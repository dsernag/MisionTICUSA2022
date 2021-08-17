package Ciclo2Java.Semana1;

import java.util.Scanner;

public class Ejercicio5 {
    /**
     * A partir de la nota devuelve el grupo al que pertenece
     * 
     * @param nota número real de 0 a 10
     * @return Devuelve un string con la calificación de Excelente a Deficiente
     */
    public static String regresaCalificacion(double nota) {
        final String MENSAJE = "Su calificación es: ";
        // Deficiente: [0, 3)
        // Insuficiente [3,5)
        // Suficiente [5,6)
        // Bien [7 9)
        // Excelente [9 10]

        boolean excelente = nota <= 10 && nota >= 9;
        boolean bien = nota >= 7 && nota < 9;
        boolean suficiente = nota >= 5 && nota < 6;
        boolean insuficiente = nota >= 3 && nota < 5;
        boolean deficiente = nota >= 0 && nota < 3;

        if (excelente) {
            return MENSAJE + "EXCELENTE";
        } else if (bien) {
            return MENSAJE + "BIEN";
        } else if (suficiente) {
            return MENSAJE + "SUFICIENTE";
        } else if (insuficiente) {
            return MENSAJE + "INSUFICIENTE";
        } else if (deficiente) {
            return MENSAJE + "DEFICIENTE";
        } else {
            return "Ingrese una calificación de 0 a 10";
        }

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Por favor ingrese la calificación: ");
        double nota = input.nextDouble();

        System.out.println(regresaCalificacion(nota));
        input.close();
    }
}
