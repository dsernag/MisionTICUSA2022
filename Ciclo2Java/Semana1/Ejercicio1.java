package Ciclo2Java.Semana1;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Solicitar datos de bienvenida:
        System.out.print("Por favor ingrese su nombre: ");
        String nombre = input.nextLine();

        // Solicitar la edad:
        System.out.print("Por favor ingrese su edad en número entero: ");
        int edad = input.nextInt();

        // Arrojar el mensaje de salida:
        System.out.println("Hola! " + nombre + " tienes " + edad + " años.");

        input.close();
    }
}