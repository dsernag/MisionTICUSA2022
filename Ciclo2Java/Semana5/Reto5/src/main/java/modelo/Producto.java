/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

/**
 *
 * @author daseg
 */
@Table("productos")
public class Producto {

    @Id
    @Column("codigo")
    /**
     * Codigo del producto, por defecto null (se autoincrementa)
     */
    private Integer codigo;

    @Column("nombre")
    /**
     * Nombre del producto
     */
    private String nombre;

    @Column("precio")
    /**
     * Precio del producto
     */
    private Double precio;

    @Column("inventario")
    /**
     * Cantidad de unidades del producto
     */
    private Integer inventario;

    /**
     *
     */
    public Producto() {
        super();
    }

    /**
     * Constructor para crear Producto
     *
     * @param codigo
     * @param nombre
     * @param precio
     * @param inventario
     */
    public Producto(Integer codigo, String nombre, Double precio, Integer inventario) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.inventario = inventario;
    }

    /**
     * Función estática para crear la clase sin ser instanciada!!!
     *
     * @param codigo
     * @param nombre
     * @param precio
     * @param inventario
     * @return
     */
    public static Producto crearProducto(Integer codigo, String nombre, Double precio, Integer inventario) {
        return new Producto(codigo, nombre, precio, inventario);
    }

    public static Producto crearProducto() {
        return new Producto();
    }

    /**
     *
     * @return
     */
    public Integer getCodigo() {
        return codigo;
    }

    /**
     *
     * @param codigo
     */
    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    /**
     *
     * @return
     */
    public String getNombre() {
        return nombre;
    }

    /**
     *
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     *
     * @return
     */
    public Double getPrecio() {
        return precio;
    }

    /**
     *
     * @param precio
     */
    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    /**
     *
     * @return
     */
    public Integer getInventario() {
        return inventario;
    }

    /**
     *
     * @param inventario
     */
    public void setInventario(Integer inventario) {
        this.inventario = inventario;
    }

    @Override
    /**
     *
     */
    public String toString() {
        return "Producto{" + "codigo=" + codigo + ", nombre=" + nombre + ", precio=" + precio + ", inventario=" + inventario + '}';
    }

    /**
     *
     * @return
     */
    public String[] registroProductos() {
        String datos[] = new String[4];
        datos[0] = String.valueOf(this.codigo);
        datos[1] = String.valueOf(this.nombre);
        datos[2] = String.valueOf(this.precio);
        datos[3] = String.valueOf(this.inventario);
        return datos;
    }
}
