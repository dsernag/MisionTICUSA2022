package Ciclo2Java.Semana3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

/**
 * *@author David Serna Clase para almacenar las características del producto
 */
class Producto {

    /**
     * Codigo del producto
     */
    private int codigo;
    /**
     * Nombre del producto
     */
    private String nombre;
    /**
     * Precio del producto
     */
    private double precio;
    /**
     * cantidad del producto
     */
    private int cantdidad;

    /**
     * Constructor Producto
     *
     * @param codigo
     * @param nombre
     * @param precio
     * @param cantdidad
     */
    public Producto(int codigo, String nombre, double precio, int cantdidad) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.cantdidad = cantdidad;
    }

    /**
     * Constructor vacío
     */
    public Producto() {
    }

    /**
     *
     * @return Código del Producto
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * @return Nombre del Producto
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @return Cantidad del Producto
     */
    public int getCantdidad() {
        return cantdidad;
    }

    /**
     * @return Precio del Producto
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * @param codigo Cambiar código del Producto instanciado
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * @param nombre Cambiar nombre del Producto instanciado
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @param precio Cambiar precio del Producto instanciado
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * @param cantdidad Cambiar cantidad del Producto instanciado
     */
    public void setCantdidad(int cantdidad) {
        this.cantdidad = cantdidad;
    }

    /**
     * Sí la clase es llamada sin ningú método, se imprime lo siguiente:
     */
    @Override
    public String toString() {
        return getCodigo() + " " + getNombre() + " " + getPrecio() + " " + getCantdidad();
    }
}

/**
 * Clase con la base datos, es un hashmap de clases Productos
 *
 * @author David Serna
 */
class BaseDatosProductos {
    /**
     * Función para crear la base de datos eficientemente
     *
     * @return Hashmap instanciado con las entradas.
     */
    private static HashMap<Integer, Producto> GenerarHashMap() {
        int[] codigo = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        String[] nombre = { "Tangelos", "Limones", "Peras", "Arandanos", "Tomates", "Fresas", "Helado", "Galletas",
                "Chocolates", "Jamon" };
        double[] precio = { 9000, 2500, 2700, 9300, 8100, 9100, 4500, 700, 4500, 11000 };
        int[] cantidad = { 67, 35, 65, 34, 42, 90, 41, 18, 80, 55 };

        HashMap<Integer, Producto> lista_Productos = new HashMap<>();

        for (int i : codigo) {
            Producto producto = new Producto();

            producto.setCodigo(codigo[i - 1]);
            producto.setNombre(nombre[i - 1]);
            producto.setPrecio(precio[i - 1]);
            producto.setCantdidad(cantidad[i - 1]);

            lista_Productos.put(producto.getCodigo(), producto);
        }
        return lista_Productos;
    }

    /**
     * Instanciamos la base de datos que será la clase
     */
    private HashMap<Integer, Producto> lista_Productos = GenerarHashMap();

    /**
     * Constructor vacío
     */
    public BaseDatosProductos() {
    }

    /**
     * Constructor recargado
     *
     * @param lista_Productos
     */
    public BaseDatosProductos(HashMap<Integer, Producto> lista_Productos) {
        this.setLista_Productos(lista_Productos);
    }

    /**
     * La clase BaseDatosProductos es este hashmap
     *
     * @return El hashmap de esta clase
     */
    public HashMap<Integer, Producto> getLista_Productos() {
        return lista_Productos;
    }

    /**
     * Establecer un hashmap nuevo
     *
     * @param lista_Productos el hashmap que se instanciará
     */
    public void setLista_Productos(HashMap<Integer, Producto> lista_Productos) {
        this.lista_Productos = lista_Productos;
    }

    /**
     * Método para obtener todos los productos
     *
     * @return Una cadena de Strings con el inventario
     */
    @Override
    public String toString() {
        String expresion = "";
        for (Producto i : this.getLista_Productos().values()) {
            expresion += i.toString() + "\n";
        }
        return expresion;
    }

    /**
     *
     * @param nuevProducto Producto a verificar
     * @return True or False sí el código está en la BD
     */
    public boolean verificarCodigo(Producto nuevProducto) {
        return this.getLista_Productos().containsKey(nuevProducto.getCodigo());
    }

    /**
     *
     * @param nuevoProducto Producto a verificar
     * @return True or False sí el Nombre está en la BD o No
     */
    public boolean verficarNombre(Producto nuevoProducto) {
        return this.getLista_Productos().get(nuevoProducto.getCodigo()).getNombre().equals(nuevoProducto.getNombre());
    }

    /**
     * 
     * @param nuevoProducto Producto a agregar
     */
    public void agregarProducto(Producto nuevoProducto) {
        if (verificarCodigo(nuevoProducto)) {
            System.out.println("ERROR");
        } else {
            this.getLista_Productos().put(nuevoProducto.getCodigo(), nuevoProducto);
            this.imprimirReporte();
        }

    }

    /**
     * 
     * @param nuevoProducto Producto a borrar
     */
    public void borrarProducto(Producto nuevoProducto) {
        if (!verificarCodigo(nuevoProducto)) {
            System.out.println("ERROR");
        } else if (!verficarNombre(nuevoProducto)) {
            System.out.println("ERROR");
        } else {
            this.getLista_Productos().remove(nuevoProducto.getCodigo());
            this.imprimirReporte();
        }
    }

    /**
     * @param nuevoProducto Producto a actualizar
     */
    public void actualizarProducto(Producto nuevoProducto) {
        if (!verificarCodigo(nuevoProducto)) {
            System.out.println("ERROR");
        } else if (!verficarNombre(nuevoProducto)) {
            System.out.println("ERROR");
        } else {
            this.getLista_Productos().replace(nuevoProducto.getCodigo(), nuevoProducto);
            this.imprimirReporte();
        }
    }

    /**
     * 
     * @param usuarioEntrada Agregar, borrar o actualizar
     * @param nuevoProducto  El producto al que se le realizará la opción
     */
    public void realizarOperacion(String usuarioEntrada, String[] datos) {
        int codigo = Integer.parseInt(datos[0]);
        String nombre = datos[1];
        double precio = Double.parseDouble(datos[2]);
        int cantidad = Integer.parseInt(datos[3]);

        Producto nuevoProducto = new Producto(codigo, nombre, precio, cantidad);

        if (usuarioEntrada.equals("AGREGAR")) {
            this.agregarProducto(nuevoProducto);
        } else if (usuarioEntrada.equals("BORRAR")) {
            this.borrarProducto(nuevoProducto);
        } else if (usuarioEntrada.equals("ACTUALIZAR")) {
            this.actualizarProducto(nuevoProducto);
        } else {
            System.out.println("ERROR");
        }
    }

    /**
     * 
     * @return Devuelve una lista con el top de tres productos más costosos
     */
    public double[] topTresProductos() {
        ArrayList<Double> listaPrecios = new ArrayList<>();

        for (Producto producto : this.getLista_Productos().values()) {
            listaPrecios.add(producto.getPrecio());
        }
        Collections.sort(listaPrecios, Collections.reverseOrder());
        double[] tresPrecios = { listaPrecios.get(0), listaPrecios.get(1), listaPrecios.get(2) };
        return tresPrecios;
    }

    /**
     * 
     * @return Mensaje con los productos más costosos
     */
    public void imprimirReporte() {
        double[] tresMayores = topTresProductos();

        for (double valor : tresMayores) {
            for (Producto producto : this.getLista_Productos().values()) {
                if (valor == producto.getPrecio()) {
                    System.out.print(producto.getNombre() + " ");
                }
            }
        }
    }
}

/**
 * Clase para realizar el reto
 */
public class Reto3 {
    private static Scanner input = new Scanner(System.in);
    /**
     * Main function
     * @param args
     */
    public static void main(String[] args) {
        /**
         * Instanciar la BD Inicial
         */
        BaseDatosProductos bdInicial = new BaseDatosProductos();

        /**
         * Get tipo de operación a realizar
         */
        System.out.println("Ingrese la operación a realizar");
        String operacion = input.nextLine();
        /**
         * Get datos del producto
         */
        System.out.println("Ingrese los datos");
        String[] datos = input.nextLine().split(" ");

        /**
         * Operación a realizar
         */
        bdInicial.realizarOperacion(operacion, datos);
    }

}
