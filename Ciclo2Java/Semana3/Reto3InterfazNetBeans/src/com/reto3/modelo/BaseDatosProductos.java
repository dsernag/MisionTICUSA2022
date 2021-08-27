/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.reto3.modelo;

import com.reto3.vista.VentanaPrincipal;
import com.reto3.vista.TablaResumenInventario;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 * Clase con la base datos, es un hashmap de clases Productos
 *
 * @author David Serna
 */
public class BaseDatosProductos {
    /**
     * Función para crear la base de datos eficientemente
     *
     * @return Hashmap instanciado con las entradas.
     */
    private static HashMap<Integer, Producto> GenerarHashMap() {
        int[] codigo = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        String[] nombre = {"Tangelos", "Limones", "Peras", "Arandanos", "Tomates", "Fresas", "Helado", "Galletas",
            "Chocolates", "Jamon"};
        double[] precio = {9000, 2500, 2700, 9300, 8100, 9100, 4500, 700, 4500, 11000};
        int[] cantidad = {67, 35, 65, 34, 42, 90, 41, 18, 80, 55};

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
            JOptionPane.showMessageDialog(null, "El código del producto que va a agregar no puede estar en la base de datos.\n"
                    + "Por favor revise el inventario.", "ERROR", JOptionPane.ERROR_MESSAGE);
        } else {
            this.getLista_Productos().put(nuevoProducto.getCodigo(), nuevoProducto);
            JOptionPane.showMessageDialog(null, "Felitaciones ha agregado: " + nuevoProducto.getCantdidad()
                    + " unidades de " + nuevoProducto.getNombre() + " con un precio de: " + nuevoProducto.getPrecio(),
                    "¡Felicitaciones!", JOptionPane.INFORMATION_MESSAGE);
            VentanaPrincipal.generarInforme();
        }
    }
    /**
     * 
     * @param nuevoProducto Producto a borrar
     */
    public void borrarProducto(Producto nuevoProducto) {
        if (!verificarCodigo(nuevoProducto)) {
            JOptionPane.showMessageDialog(null, "El código del producto que va a borrar debe estar en la base de datos.\n"
                    + "Por favor revise el inventario.", "ERROR", JOptionPane.ERROR_MESSAGE);
        } else if (!verficarNombre(nuevoProducto)) {
            JOptionPane.showMessageDialog(null, "Para borrar un producto el nombre debe coincidir con la base de datos.\n"
                    + "Por favor revise el inventario.", "ERROR", JOptionPane.ERROR_MESSAGE);
        } else {
            this.getLista_Productos().remove(nuevoProducto.getCodigo());
            JOptionPane.showMessageDialog(null, "Felitaciones ha borrado todas las unidades de: "
                    + nuevoProducto.getNombre(), "¡Felicitaciones!", JOptionPane.INFORMATION_MESSAGE);
            VentanaPrincipal.generarInforme();
        }
    }
    /**
     * @param nuevoProducto Producto a actualizar
     */
    public void actualizarProducto(Producto nuevoProducto) {
        if (!verificarCodigo(nuevoProducto)) {
            JOptionPane.showMessageDialog(null, "El código del producto que va a actualizar debe estar en la base de datos.\n"
                    + "Por favor revise el inventario.", "ERROR", JOptionPane.ERROR_MESSAGE);
        } else if (!verficarNombre(nuevoProducto)) {
            JOptionPane.showMessageDialog(null, "\"Para actualizar un producto el nombre debe coincidir con la base de datos.\n"
                    + "Por favor revise el inventario.", "ERROR", JOptionPane.ERROR_MESSAGE);
        } else {
            this.getLista_Productos().replace(nuevoProducto.getCodigo(), nuevoProducto);
            JOptionPane.showMessageDialog(null, "Felitaciones ha actualizado: " + nuevoProducto.getNombre(),
                    "¡Felicitaciones!", JOptionPane.INFORMATION_MESSAGE);
            VentanaPrincipal.generarInforme();
        }
    }
    /**
     * 
     * @param usuarioEntrada Agregar, borrar o actualizar
     * @param nuevoProducto El producto al que se le realizará la opción
     */
    public void realizarOperacion(String usuarioEntrada, Producto nuevoProducto) {
        if (usuarioEntrada.equals("AGREGAR")) {
            this.agregarProducto(nuevoProducto);
        } else if (usuarioEntrada.equals("BORRAR")) {
            this.borrarProducto(nuevoProducto);
        } else if (usuarioEntrada.equals("ACTUALIZAR")) {
            this.actualizarProducto(nuevoProducto);
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
        double[] tresPrecios = {listaPrecios.get(0), listaPrecios.get(1), listaPrecios.get(2)};
        return tresPrecios;
    }
    /**
     * 
     * @return Mensaje con los productos más costosos
     */
    public String imprimirReporte() {
        double[] tresMayores = topTresProductos();
        String mensaje = "Los tres productos más costosos son: ";
        for (double valor : tresMayores) {
            for (Producto producto : this.getLista_Productos().values()) {
                if (valor == producto.getPrecio()) {
                    mensaje += producto.getNombre() + " ";
                    //System.out.print(producto.getNombre() + " ");
                }
            }
        }
        return mensaje;
    }
}
