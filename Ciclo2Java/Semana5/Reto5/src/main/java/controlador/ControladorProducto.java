/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import modelo.Producto;
import modelo.RepositorioProducto;
import vista.AppTienda;

/**
 * Clase controladora master
 *
 * @author daseg
 */
public class ControladorProducto implements ActionListener {

    /**
     * Acceso al repositorio CRUD para realizar todas las operaciones.
     */
    private RepositorioProducto repositorio;

    /**
     * Representa el agregado (Para consulta Spring Boot)
     */
    private Producto producto;

    /**
     * Administrar el modelo de datos de la tabla (JTable)
     */
    private DefaultTableModel modeloTabla;

    /**
     * Acceso a la vista
     */
    private AppTienda vista;

    //
    /**
     * Constructor vacio
     */
    public ControladorProducto() {
        super();
    }

    /**
     *
     * @param repositorio Recibe referencia al modelo
     * @param tienda recibe referencia a la vista o interfazgrafica
     */
    public ControladorProducto(RepositorioProducto repositorio, AppTienda vista) {
        this.repositorio = repositorio;
        this.vista = vista;
        producto = Producto.crearProducto();
        llenarTabla();
        agregarEventos();

    }

    /**
     * Agrega eventos a todos los botones!
     */
    private void agregarEventos() {
        this.vista.getAgregarBtn().addActionListener(this);
        this.vista.getActualizarBtn().addActionListener(this);
        this.vista.getBorrarBtn().addActionListener(this);
        this.vista.getReporteBtn().addActionListener(this);
        this.vista.getAcercadeBtn().addActionListener(this);
        this.vista.getBtnLimpiar().addActionListener(this);
    }

    /**
     * Procesar los eventos de click sobre los botones
     *
     * @param actionE
     */
    @Override
    public void actionPerformed(ActionEvent actionE) {
        if (actionE.getSource() == this.vista.getAgregarBtn()) {
            agregarProducto();
        } else if (actionE.getSource() == this.vista.getActualizarBtn()) {
            actualizarProducto();
        } else if (actionE.getSource() == this.vista.getBorrarBtn()) {
            borrarProducto();
        } else if (actionE.getSource() == this.vista.getReporteBtn()) {
            generarReporte();
        } else if (actionE.getSource() == this.vista.getBtnLimpiar()) {
            limpiar();
        } else if (actionE.getSource() == this.vista.getAcercadeBtn()) {
            JOptionPane.showMessageDialog(this.vista, "Mi nombre es David Serna Gutérrez.\nIngeniero Forestal, científico de datos y especializasta SIG.\n"
                    + "\nEste es un programa básico para realizar compras en un supermarket.\nPor favor respete los derechos de autor.\n\n"
                    + "©David Serna\ne-mail: dsernag@unal.edu.co\n\n\nGracias por compilar y correr.", "Acerca de mí", JOptionPane.INFORMATION_MESSAGE);

        }
    }

    /**
     * Regresa la verificación de que los valores precio e inventario sean
     * positivos
     *
     * @param precio
     * @param inventario
     * @return
     */
    public boolean verificadorCampos(double precio, int inventario) {
        return precio >= 0 && inventario >= 0;
    }

    /**
     * Verifica nombres duplicados (usada en agregar)
     *
     * @param nombre
     * @return
     */
    public boolean verificarNombre(String nombre) {
        List<Producto> listaProductos = (List<Producto>) repositorio.findAll();
        boolean respuesta = true;
        for (Producto producto : listaProductos) {
            if (nombre.equalsIgnoreCase(producto.getNombre())) {
                respuesta = false;
            }
        }
        return respuesta;
    }

    /**
     * Limpia las cajas de texto
     */
    public void limpiar() {
        this.vista.getCajaInventario().setText("");
        this.vista.getCajaNombre().setText("");
        this.vista.getCajaPrecio().setText("");
    }

    /**
     * Borra la fila seleccionada de la tabla!
     */
    public void borrarProducto() {

        int filaSeleccionada = this.vista.getTablaModelo().getSelectedRow();
        Integer idBusqueda = null;

        if (filaSeleccionada >= 0) {
            idBusqueda = Integer.valueOf(modeloTabla.getValueAt(filaSeleccionada, 0).toString());

            if (repositorio.existsById(idBusqueda)) {
                producto = repositorio.findById(idBusqueda).get();
                repositorio.deleteById(idBusqueda);
                modeloTabla.removeRow(filaSeleccionada);
                JOptionPane.showMessageDialog(this.vista, "Se ha eliminado con éxito:\n" + producto, "Producto eliminado", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this.vista, "No existe un Producto con el código: " + idBusqueda, "Producto no encontrado", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this.vista, "Debe seleccionar el producto que desea Borrar", "Borrar Producto", JOptionPane.ERROR_MESSAGE);
        }
    }

    /**
     * Agrega producto, previamente unas verificaciones
     */
    public void agregarProducto() {
        String nombre;
        double precio;
        int inventario;

        try {

            nombre = this.vista.getCajaNombre().getText().trim();
            precio = Double.parseDouble(vista.getCajaPrecio().getText());
            inventario = Integer.valueOf(vista.getCajaInventario().getText());
            if (verificadorCampos(precio, inventario) && verificarNombre(nombre)) {

                producto = Producto.crearProducto(null, nombre, precio, inventario);

                repositorio.save(producto);

                modeloTabla.addRow(producto.registroProductos());
                limpiar();
                JOptionPane.showMessageDialog(this.vista, "Producto Agregado correctamente\n" + producto, "Agregar Producto", JOptionPane.INFORMATION_MESSAGE);
            } else if (!verificarNombre(nombre)) {
                JOptionPane.showMessageDialog(this.vista, "Nombre de producto a ingresar ya está en la base de datos", "Agregar Producto", JOptionPane.ERROR_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this.vista, "Precio o cantidad negativa", "Agregar Producto", JOptionPane.ERROR_MESSAGE);
            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this.vista, "Revise los tipos de datos y recuerde que todos los campos deben estar completos", "Agregar Producto", JOptionPane.ERROR_MESSAGE);
        }
    }

    /**
     * Actualiza el producto, primero debe seleccionar una fila
     */
    public void actualizarProducto() {
        Integer idBusqueda = null;
        String nombre;
        double precio;
        int inventario;

        int filaSeleccionada = vista.getTablaModelo().getSelectedRow();
        if (filaSeleccionada >= 0) {
            try {
                idBusqueda = Integer.valueOf(modeloTabla.getValueAt(filaSeleccionada, 0).toString());
                nombre = this.vista.getCajaNombre().getText().trim();
                precio = Double.parseDouble(this.vista.getCajaPrecio().getText());
                inventario = Integer.valueOf(this.vista.getCajaInventario().getText());
                if (verificadorCampos(precio, inventario)) {
                    //obtiene un agregado a partir de su id
                    producto = repositorio.findById(idBusqueda).get();
                    //asigna a los atributos del agregado la informaciòn
                    //registrada en las cajas de datos
                    producto.setCodigo(idBusqueda);
                    producto.setNombre(nombre);
                    producto.setPrecio(precio);
                    producto.setInventario(inventario);
                    //uso el metodo save del repositorio
                    repositorio.save(producto);

                    //limpio el contenido de las cajas de texto
                    limpiar();
                    //actualiza los datos en la tabla
                    modeloTabla.setValueAt(producto.getNombre(), filaSeleccionada, 1);
                    modeloTabla.setValueAt(producto.getPrecio(), filaSeleccionada, 2);
                    modeloTabla.setValueAt(producto.getInventario(), filaSeleccionada, 3);
                    JOptionPane.showMessageDialog(vista, "Producto Actualizado correctamente\n" + producto, "Actualizar Producto", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(this.vista, "Precio o cantidad negativa", "Actualizar Producto", JOptionPane.ERROR_MESSAGE);
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(vista, "Revise los tipos de datos y recuerde que todos los campos deben estar completos", "Actualizar Producto", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(vista, "Debe seleccionar una fila para actualizar", "Actualizar Producto", JOptionPane.ERROR_MESSAGE);
        }

    }

    /**
     * Genera el reporte con las especificaciones exigidas
     */
    public void generarReporte() {
        List<Producto> listaProductos = (List<Producto>) repositorio.findAll();
        double menor = 999999.0;
        String prodMenor = "";

        double mayor = 0.0;
        String prodMayor = "";

        double suma = 0.0;
        double inventario = 0.0;

        for (Producto producto : listaProductos) {
            if (producto.getPrecio() > mayor) {
                mayor = producto.getPrecio();
                prodMayor = producto.getNombre();
                suma += producto.getPrecio();
                inventario += producto.getPrecio() * producto.getInventario();
            } else if (producto.getPrecio() < menor) {
                menor = producto.getPrecio();
                prodMenor = producto.getNombre();
                suma += producto.getPrecio();
                inventario += producto.getPrecio() * producto.getInventario();

            } else {
                suma += producto.getPrecio();
                inventario += producto.getPrecio() * producto.getInventario();
            }
        }

        double promedio = suma / listaProductos.size();

        String mensaje = "El producto más costoso es: " + prodMayor
                + ".\nEl producto más barato es: " + prodMenor
                + ".\nEl promedio de todos los precios es: " + String.format("%.2f", promedio)
                + "\nEl precio total del inventario es: " + String.format("%.2f", inventario);

        JOptionPane.showMessageDialog(this.vista, mensaje, "Resumen", JOptionPane.INFORMATION_MESSAGE);
    }

    /**
     * Utilizada al inicio del instanciamiento del objeto para llenar la tabla.
     */
    public void llenarTabla() {
        //instancio el modelo de la tabla y hago que nos e puedan editar los registros
        modeloTabla = new DefaultTableModel() {

            @Override
            public boolean isCellEditable(int row, int column) {
                //all cells false
                return false;
            }
        };

        //asignar modelo de datos
        vista.getTablaModelo().setModel(modeloTabla);

        //configuro columnas de la tabla
        modeloTabla.addColumn("Codigo");
        modeloTabla.addColumn("Nombre");
        modeloTabla.addColumn("Precio");
        modeloTabla.addColumn("Inventario");

        //configuro el encabezado de la tabla
        JTableHeader encabezado = vista.getTablaModelo().getTableHeader();
        encabezado.setFont(new Font("Tahome", Font.BOLD, 16));

        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);
        ((DefaultTableCellRenderer) encabezado.getDefaultRenderer()).setHorizontalAlignment(JLabel.CENTER);

        vista.getTablaModelo().getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
        vista.getTablaModelo().getColumnModel().getColumn(1).setCellRenderer(centerRenderer);
        vista.getTablaModelo().getColumnModel().getColumn(2).setCellRenderer(centerRenderer);
        vista.getTablaModelo().getColumnModel().getColumn(3).setCellRenderer(centerRenderer);

        List<Producto> listaProductos = (List<Producto>) repositorio.findAll();

        //Cargar los datos de la tabla 
        if (!listaProductos.isEmpty()) {
            for (Producto producto : listaProductos) {
                modeloTabla.addRow(producto.registroProductos());
            }
        }
    }
}
