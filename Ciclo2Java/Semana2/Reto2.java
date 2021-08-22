package Ciclo2Java.Semana2;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Clase para almacenar cada producto
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

    // Constructor Producto
    public Producto(int codigo, String nombre, double precio, int cantdidad) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.cantdidad = cantdidad;
    }

    // Constructor vacío
    public Producto() {
    }

    /**
     * @return int
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * @return String
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @return int
     */
    public int getCantdidad() {
        return cantdidad;
    }

    /**
     * @return double
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * @param codigo
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @param precio
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * @param cantdidad
     */
    public void setCantdidad(int cantdidad) {
        this.cantdidad = cantdidad;
    }

    /**
     * @return String
     */
    @Override
    public String toString() {
        return getCodigo() + " " + getNombre() + " " + getPrecio() + " " + getCantdidad();
    }
}

/**
 * Clase con la base datos, es un hashmap de clases Productos
 */
class BaseDatosProductos {

    // Base de datos es una clase tipo Hashmap
    private HashMap<Integer, Producto> lista_Productos = new HashMap<>();

    // Constructor vacío
    public BaseDatosProductos() {
    }

    // Constructor recargado
    public BaseDatosProductos(HashMap<Integer, Producto> lista_Productos) {
        this.setLista_Productos(lista_Productos);
    }

    public HashMap<Integer, Producto> getLista_Productos() {
        return lista_Productos;
    }

    public void setLista_Productos(HashMap<Integer, Producto> lista_Productos) {
        this.lista_Productos = lista_Productos;
    }

    @Override
    public String toString() {
        String expresion = "";
        for (Producto i : this.getLista_Productos().values()) {
            expresion += i.toString() + "\n";
        }
        return expresion;
    }

    public void agregarProducto(Producto nuevoProducto) {
        if (this.getLista_Productos().containsKey(nuevoProducto.getCodigo())) {
            System.out.println("ERROR");
        } else {
            this.getLista_Productos().put(nuevoProducto.getCodigo(), nuevoProducto);
            this.imprimirReporte();
        }

    }

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

    public double promedioPrecios() {
        double suma = 0;
        int contador = 0;
        for (Producto producto : this.getLista_Productos().values()) {
            suma += producto.getPrecio();
            contador++;
        }
        return suma / contador;
    }

    public double valorInventario() {
        double valorTotal = 0;
        for (Producto producto : this.getLista_Productos().values()) {
            valorTotal += producto.getPrecio() * producto.getCantdidad();
        }
        return valorTotal;
    }

    public void imprimirReporte() {
        System.out.println(this.productoMayor() + " " + this.productoMenor() + " "
                + String.format("%.1f", this.promedioPrecios()) + " " + String.format("%.1f", this.valorInventario()));
    }
}

/**
 * Clase para realizar el reto
 */
public class Reto2 {
    private static Scanner input = new Scanner(System.in);

    // Función para crear la base de datos eficientemente:
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
