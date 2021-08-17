package Ciclo2Java.Semana1;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        // Datos del triángulo:
        Scanner input = new Scanner(System.in);

        System.out.println("Por favor ingrese la base del triángulo (Pueden ser números reales):");
        double base = input.nextDouble();

        System.out.println("Por favor ingrese la altura del triángulo (Pueden ser números reales):");
        double altura = input.nextDouble();

        double area = (base * altura) / 2;
        System.out.println("El área del triángulo es: " + String.format("%.2f", area));

        input.close();

    }

}
