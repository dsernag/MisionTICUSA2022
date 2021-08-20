package Ciclo2Java.Semana2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

class Asignatura {
    private String materia;
    private int creditos;

    public Asignatura() {

    }

    public Asignatura(String materia, int creditos) {
        this.materia = materia;
        this.creditos = creditos;
    }

    
    /** 
     * @return String
     */
    public String getMateria() {
        return materia;
    }

    
    /** 
     * @return int
     */
    public int getCreditos() {
        return creditos;
    }

    
    /** 
     * @param materia
     */
    public void setMateria(String materia) {
        this.materia = materia;
    }

    
    /** 
     * @param creditos
     */
    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

}

public class Ejercicio19 {

    public static HashMap<String, Asignatura> recogerDatos() {

        Scanner input = new Scanner(System.in);
        HashMap<String, Asignatura> listaMaterias = new HashMap<>();

        System.out.println(
                "Por favor ingrese el nombre de la asignatura y la cantidad de créditos.\nPor ejemplo: 'Ciencias Sociales 5'");
        String entrada = input.nextLine();

        // Es necesario que escriba por lo menos una asignatura, para que el programa retorne algo
        while (entrada.equals("")) {
            System.out.println("Debe escribir una entrada al menos: ");
            entrada = input.nextLine();
        }
        while (!entrada.equals("")) {

            String entrStr[] = entrada.split(" ");
            ArrayList<String> entrList = new ArrayList<>(Arrays.asList(entrStr)); // Para acceder más fácil a los
                                                                                  // elementos
            int size = entrStr.length;

            // Instanciar la clase Asignatura
            Asignatura asignatura = new Asignatura();
            asignatura.setCreditos(Integer.parseInt((entrList.get(size - 1))));
            asignatura.setMateria(String.join(" ", entrList.subList(0, size - 1)));

            listaMaterias.put(asignatura.getMateria(), asignatura);
            entrada = input.nextLine();
        }
        input.close();
        return listaMaterias;

    }

    public static void main(String[] args) {
        // Recolectar la info en una función
        HashMap<String, Asignatura> asignaturas = recogerDatos();
        int suma_creditos = 0; // Acumulador para devolver el total de créditos
        for (Asignatura materia : asignaturas.values()) {
            suma_creditos += materia.getCreditos();
        }
        System.out.println("En total tienes inscritos " + suma_creditos + " créditos");

    }

}
