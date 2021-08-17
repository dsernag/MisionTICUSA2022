package Ciclo2Java.Semana1;

import java.util.Scanner;
import java.util.Arrays;

import java.util.ArrayList;

/**
 * Habrá una variante de desafío. Se pedirá al usuario hasta donde quiere
 * llegar.
 */
public class Ejercicio7 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("El limite: ");
        double limite = input.nextDouble();
        input.close();

        Integer[] multiplosArray = { 5 };
        int i = 10;

        ArrayList<Integer> multiplos = new ArrayList<>(Arrays.asList(multiplosArray));
        while (i <= limite) {
            multiplos.add(i);
            i += 5;
        }
        System.out.println(multiplos);
    }
}
