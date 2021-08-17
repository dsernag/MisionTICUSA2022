package Ciclo2Java.Semana1;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio12 {
    /**
     * Método para encontrar el mayor
     * 
     * @param alumnos
     * @return
     */
    public static double encontrarMayor(ArrayList<Double> calificaciones) {
        double mayor = 0;
        int i = 0;
        int cantidadCalificaciones = calificaciones.size();

        while (i < cantidadCalificaciones) {
            if (calificaciones.get(i) > mayor) {
                mayor = calificaciones.get(i);
                i++;
            } else {
                i++;
            }
        }
        return mayor;
    }

    /**
     * Método para encontrar el menor
     * 
     * @param alumnos
     * @return
     */
    public static double encontrarMenor(ArrayList<Double> calificaciones) {
        double menor = calificaciones.get(0);
        int i = 0;
        int cantidadCalificaciones = calificaciones.size();

        while (i < cantidadCalificaciones) {
            if (calificaciones.get(i) < menor) {
                menor = calificaciones.get(i);
                i++;
            } else {
                i++;
            }
        }
        return menor;
    }

    public static void main(String[] args) {
        // Lista para recoger los numeros

        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese una calificación de 0 a 10: ");
        double numero = input.nextDouble();

        ArrayList<Double> calificaciones = new ArrayList<Double>();

        if (numero < 0 || numero > 10) {
            System.out.println("Nota inválida. No hay nada para mostrar");
        } else {
            while (numero >= 0 && numero <= 10) {
                calificaciones.add(numero);
                System.out.println("Ingrese una calificación de 0 a 10: ");
                numero = input.nextDouble();
            }
        System.out.println("La califación mayor es: " + encontrarMayor(calificaciones) +" y la califación menor es " + encontrarMenor(calificaciones) );

        
        }
        input.close();

    }
}