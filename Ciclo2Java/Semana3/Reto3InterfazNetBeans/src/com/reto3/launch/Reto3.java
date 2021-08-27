/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.reto3.launch;

import com.reto3.modelo.BaseDatosProductos;
import com.reto3.vista.VentanaPrincipal;
import com.reto3.vista.TablaResumenInventario;

/**
 * Clase para correr la función main de la pantalla principal
 * @author David Serna
 */
public class Reto3 {
    /**
     * Función principal para iniciar la primera ventana
     * @param args 
     */
    public static void main(String[] args) {
        VentanaPrincipal ventana = new VentanaPrincipal();
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);

    }
}
 