package Ciclo2Java.Semana1;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Clase Alumno para almacenar el nombre y los valores
 */
class Alumno {
    private String nombre;
    private double calificacion1;
    private double calificacion2;

    public Alumno() {
    }

    public Alumno(String nombre, double calificacion1, double calificacion2) {
        this();
        this.nombre = nombre;
        this.calificacion1 = calificacion1;
        this.calificacion2 = calificacion2;
    }

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
    public double getCalificacion1() {
        return calificacion1;
    }

    /**
     * 
     * @param calificacion1
     */
    public void setCalificacion1(double calificacion1) {
        this.calificacion1 = calificacion1;
    }

    /**
     * 
     * @return
     */
    public double getCalificacion2() {
        return calificacion2;
    }

    /**
     * 
     * @param calificacion2
     */
    public void setCalificacion2(double calificacion2) {
        this.calificacion2 = calificacion2;
    }
}

public class Ejercicio14 {
    /**
     * Verificar que la entrada sea válida
     * 
     * @param nota
     * @return
     */
    public static boolean notaValida(double nota) {
        return nota >= 0 && nota <= 10;
    }

    /**
     * Retorna el hash map con todos los estudiantes y sus notas:
     * 
     * @param cantidadAlumnos
     * @return
     */
    public static HashMap<String, Alumno> crearMatriz(int cantidadAlumnos) {
        final Scanner inputloop = new Scanner(System.in);

        HashMap<String, Alumno> matrizAlumnos = new HashMap<>();
        int i = 1;
        while (i <= cantidadAlumnos) {

            System.out.println("Por favor ingrese el nombre del estudiante N°" + i
                    + " y sus dos calificaciones, separadas por espacio: ");

            String linea[] = inputloop.nextLine().split(" ");

            double cal1 = Double.parseDouble(linea[1]);
            double cal2 = Double.parseDouble(linea[2]);

            while (!notaValida(cal1) && !notaValida(cal2)) {
                System.out.println("Ingrese nuevamente el nombre del estudiante N°" + i
                        + " y sus dos calificaciones, separadas por espacio (Números entre 1 a 10): ");
                linea = inputloop.nextLine().split(" ");

                cal1 = Double.parseDouble(linea[1]);
                cal2 = Double.parseDouble(linea[2]);
            }

            Alumno alumno = new Alumno(linea[0], cal1, cal2);

            matrizAlumnos.put(alumno.getNombre(), alumno);
            i++;
        }
        inputloop.close();
        return matrizAlumnos;
    }

    /**
     * Devuelve el mensaje de sí pasa o no:
     * 
     * @param matriz
     */
    public static void imprimirResultados(HashMap<String, Alumno> matriz) {
        for (Alumno j : matriz.values()) {
            double promedio = j.getCalificacion1() * 0.4 + 0.6 * j.getCalificacion2();
            if (promedio >= 6) {
                System.out.println(
                        "\n" + j.getNombre() + " ha aprobado, con promedio de " + String.format("%.2f", promedio));
            } else {
                System.out.println(
                        "\n" + j.getNombre() + " no ha aprobado. Promedio: " + String.format("%.2f", promedio));
            }
        }
    }

    /**
     * Main function
     * 
     * @param args
     */
    public static void main(String[] args) {
        final Scanner inputmain = new Scanner(System.in);

        System.out.println("Hola, bienvenido! Por ingresa la cantidad de alumnos a ingresar: ");
        int nAlumnos = inputmain.nextInt();

        HashMap<String, Alumno> matrizEstudiantes = crearMatriz(nAlumnos);

        imprimirResultados(matrizEstudiantes);

        inputmain.close();
    }
}
