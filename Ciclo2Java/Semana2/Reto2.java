package Ciclo2Java.Semana2;

import java.util.HashMap;
import java.util.Scanner;

/**
 * *@author David Serna Clase para almacenar las características del producto
 */
class Producto {
    // Codigo producto
    private int codigo;
    // Nombre producto
    private String nombre;
    // Precio producto
    private double precio;
    // Cantidad producto
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
 * @author David Serna Clase para almacenar una colección de productos
 */
class BaseDatosProductos {

    // Base de datos es una clase tipo Hashmap
    private HashMap<Integer, Producto> lista_Productos = new HashMap<>();

    // Constructor vacío
    public BaseDatosProductos() {
    }

    /**
     * Constructor recargado
     * 
     * @param lista_Productos La Clase es instanciada mediante un HashMap<Integer,
     *                        Producto>
     */
    public BaseDatosProductos(HashMap<Integer, Producto> lista_Productos) {
        this.setLista_Productos(lista_Productos);
    }

    /**
     * 
     * @return El hash map con la base de datos
     */
    public HashMap<Integer, Producto> getLista_Productos() {
        return lista_Productos;
    }

    /**
     * 
     * @param lista_Productos Establecer una nueva base de datos
     */
    public void setLista_Productos(HashMap<Integer, Producto> lista_Productos) {
        this.lista_Productos = lista_Productos;
    }

    /**
     * Sí la clase es llamada sin ningún método, imprimir la colección completa
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
     * @param nuevoProducto Clase Producto a agregar
     */
    public void agregarProducto(Producto nuevoProducto) {
        if (this.getLista_Productos().containsKey(nuevoProducto.getCodigo())) {
            System.out.println("ERROR");
        } else {
            this.getLista_Productos().put(nuevoProducto.getCodigo(), nuevoProducto);
            this.imprimirReporte();
        }

    }

    /**
     * 
     * @param nuevoProducto Clase Producto a borrar
     */
    public void borrarProducto(Producto nuevoProducto) {
        if (!this.getLista_Productos().containsKey(nuevoProducto.getCodigo())) {
            System.out.println("ERROR");
        } else if (!this.getLista_Productos().get(nuevoProducto.getCodigo()).getNombre()
                .equals(nuevoProducto.getNombre())) {
            System.out.println("ERROR");
        } else {
            this.getLista_Productos().remove(nuevoProducto.getCodigo());
            this.imprimirReporte();
        }
    }

    /**
     * 
     * @param nuevoProducto Clase Producto a actualizar
     */
    public void actualizarProducto(Producto nuevoProducto) {
        if (!this.getLista_Productos().containsKey(nuevoProducto.getCodigo())) {
            System.out.println("ERROR");
        } else if (!this.getLista_Productos().get(nuevoProducto.getCodigo()).getNombre()
                .equals(nuevoProducto.getNombre())) {
            System.out.println("ERROR");
        } else {
            this.getLista_Productos().replace(nuevoProducto.getCodigo(), nuevoProducto);
            this.imprimirReporte();
        }
    }

    /**
     * 
     * @param usuarioEntrada Tipo de operación (Dada por el usuario)
     * @param datos          Array con los datos (Dada por el usuario)
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
     * @return El producto más costoso
     */
    public String productoMayor() {
        String productoMayor = "";
        double mayor = 0;
        for (Producto producto : this.getLista_Productos().values()) {
            if (producto.getPrecio() > mayor) {
                mayor = producto.getPrecio();
                productoMayor = producto.getNombre();
            }
        }
        return productoMayor;
    }

    /**
     * 
     * @return El producto más económico
     */
    public String productoMenor() {
        String productoMenor = "";
        double menor = 99999999;
        for (Producto producto : this.getLista_Productos().values()) {
            if (producto.getPrecio() < menor) {
                menor = producto.getPrecio();
                productoMenor = producto.getNombre();
            }
        }
        return productoMenor;
    }

    /**
     * 
     * @return El promedio de precios de todos los productos
     */
    public double promedioPrecios() {
        double suma = 0;
        int contador = 0;
        for (Producto producto : this.getLista_Productos().values()) {
            suma += producto.getPrecio();
            contador++;
        }
        return suma / contador;
    }

    /**
     * 
     * @return El valor tottal del inventario La sumatoria del producto de cada
     *         producto entre su precio y cantidad.
     */
    public double valorInventario() {
        double valorTotal = 0;
        for (Producto producto : this.getLista_Productos().values()) {
            valorTotal += producto.getPrecio() * producto.getCantdidad();
        }
        return valorTotal;
    }

    /**
     * Imprime el reporte Final
     */
    public void imprimirReporte() {
        System.out.println(this.productoMayor() + " " + this.productoMenor() + " "
                + String.format("%.1f", this.promedioPrecios()) + " " + String.format("%.1f", this.valorInventario()));
    }
}

/**
 * @author Clase para realizar el reto
 */
public class Reto2 {
    // Constante para ingresar los datos
    private static Scanner input = new Scanner(System.in);

    /**
     * Función para crear la base de datos eficientemente. En el reto 3 este método
     * se agrega directamente en la clase
     * 
     * @return HashMap con los datos iniciales del ejercicio.
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
     * 
     * @param args MAIN function
     */
    public static void main(String[] args) {
        // Instanciar la base inicial:
        BaseDatosProductos bdInicial = new BaseDatosProductos();
        bdInicial.setLista_Productos(GenerarHashMap());

        // Solicitar la entrada al usuario =
        System.out.println("Ingrese la operación a realizar");
        String operacion = input.nextLine();
        // Solicitar los datos:
        System.out.println("Ingrese los datos");
        String[] datos = input.nextLine().split(" ");

        // Correr el método de realizar la operación (dentro se imprime el reporte)
        bdInicial.realizarOperacion(operacion, datos);
    }

}
