/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.reto3.modelo;

/**
 * *@author David Serna Clase para almacenar las características del producto
 */
public class Producto {

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
