package Ciclo2Java.Semana1;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        final int DOLAR = 3500;

        // Entrada del usuario:
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese una cantidad en pesos Colombianos (Puede ser decimal): ");
        double pesos = input.nextDouble();

        System.out.println("La cantidad ingresada corresponde a " + String.format("%.2f", (pesos / DOLAR)));

        input.close();
    }
}
