package Ciclo2Java.Semana1;

import java.util.Scanner;
import java.util.ArrayList;

public class Ejercicio8 {
    /**
     * Método para encontrar el mayor
     * 
     * @param alumnos
     * @return
     */
    public static double encontrarMayor(ArrayList<Double> alumnos) {
        double mayor = 0;
        int i = 0;
        int cantidad_Alumnos = alumnos.size();

        while (i < cantidad_Alumnos) {
            if (alumnos.get(i) > mayor) {
                mayor = alumnos.get(i);
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
    public static double encontrarMenor(ArrayList<Double> alumnos) {
        double menor = alumnos.get(0);
        int i = 0;
        int cantidad_Alumnos = alumnos.size();

        while (i < cantidad_Alumnos) {
            if (alumnos.get(i) < menor) {
                menor = alumnos.get(i);
                i++;
            } else {
                i++;
            }
        }
        return menor;
    }

    // Método para encontrar el promedio:
    public static double encontrarPromedio(ArrayList<Double> alumnos) {
        double suma = 0;
        int i = 0;
        int cantidad_Alumnos = alumnos.size();

        while (i < cantidad_Alumnos) {
            suma += alumnos.get(i);
            i++;
        }
        return suma / cantidad_Alumnos;
    }

    public static String imprimirMetricas(ArrayList<Double> alumnos) {
        double mayor = encontrarMayor(alumnos);
        double menor = encontrarMenor(alumnos);
        double promedio = encontrarPromedio(alumnos);

        return "El alumno más alto mide: " + mayor + " cm. El alumno más bajo: " + menor + " cm. Y la altura promedio de la clase es: " + String.format("%.2f", promedio) + " cm.";
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Escriba la cantidad de alumnos");
        int n_alumnos = input.nextInt();
        ArrayList<Double> lista_alumnos = new ArrayList<Double>();

        int contador = 0;
        while (contador < n_alumnos) {
            System.out.println("Escriba la altura del alumno: " + (contador + 1));
            double altura = input.nextDouble();
            lista_alumnos.add(altura);
            contador++;
        }

        System.out.println(imprimirMetricas(lista_alumnos));

        input.close();
    }
}
