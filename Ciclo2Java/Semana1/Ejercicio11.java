package Ciclo2Java.Semana1;

import java.util.Scanner;

public class Ejercicio11 {

    public static void main(String[] args) {
        // Lista para recoger los numeros
        int par = 0;
        int impar = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese un número: ");
        double numero = input.nextDouble();

        if (numero == 0) {
            System.out.println("No hay valores para mostrar");
        } else {
            while (numero != 0) {
                if (numero % 2 == 0) {
                    par++;
                } else {
                    impar++;
                }
                System.out.println("Ingrese un número: ");
                numero = input.nextDouble();
            }
            System.out.println("Se escribieron " + par + " números pares y " + impar + " impares");
        }
        input.close();

    }
}
