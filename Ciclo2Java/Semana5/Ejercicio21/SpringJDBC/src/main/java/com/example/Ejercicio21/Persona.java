/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.Ejercicio21;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

/**
 *
 * @author daseg
 */
@Table("personas")
public class Persona {

    @Id
    @Column("id_persona")
    private Integer id_persona;

    @Column("nombre")
    private String nombre;

    @Column("apellido")
    private String apellido;

    @Column("profesion")
    private String profesion;

    @Column("ciudad")
    private String ciudad;

    /**
     * Constructor
     *
     * @param nombre
     * @param apellido
     * @param profesion
     * @param ciudad
     */
    private Persona(Integer id_persona, String nombre, String apellido, String profesion, String ciudad) {
        this.id_persona = id_persona;
        this.nombre = nombre;
        this.apellido = apellido;
        this.profesion = profesion;
        this.ciudad = ciudad;
    }

    /**
     * Metodo de utilidad. Para instanciar la clase y pasar valores a sus
     * parametros
     *
     * @param nombre
     * @param apellido
     * @param profesion
     * @param ciudad
     * @return
     */
    public static Persona crearPersona(Integer id_persona, String nombre, String apellido, String profesion, String ciudad) {
        return new Persona(id_persona, nombre, apellido, profesion, ciudad);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    @Override
    public String toString() {
        return "| " + id_persona + " | " + nombre + " | " + apellido + " | " + profesion + " | " + ciudad + " | ";
    }
    
}
