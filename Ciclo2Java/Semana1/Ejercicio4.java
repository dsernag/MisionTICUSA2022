package Ciclo2Java.Semana1;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Por favor ingrese un número: ");
        double numero = input.nextDouble();

        // Condicionales anidados

        if (numero < 0 && numero % 3 == 0) {
            System.out.println("El número es negativo y es múltiplo de 3.");
        } else {
            System.out.println("El número ¡NO! es negativo ni múltiplo de 3.\nIntenta de nuevo");
        }

        input.close();
    }

}
