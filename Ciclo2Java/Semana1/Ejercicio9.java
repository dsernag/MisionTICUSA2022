package Ciclo2Java.Semana1;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Escriba una cadena de caracteres: ");
        String cadena = input.nextLine();
        input.close();

        // Gracias a: https://stackoverflow.com/questions/9655753/how-to-count-the-spaces-in-a-java-string/9655809
        int espacios = 0;
        for (char c : cadena.toCharArray()) {
            if (c == ' ') {
                espacios ++; 
            }
        }
        System.out.println("Su cadena de texto tiene: " + espacios + " en blanco");
    }
}
