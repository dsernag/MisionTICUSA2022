package Ciclo2Java.Semana1;

import java.util.Scanner;

public class Ejercicio10 {

    public static boolean validarCaracteres(String contrasena) {

        int carEspeciales = 0; // Deben ser 3 al final

        for (char c : contrasena.toCharArray()) {
            if (c == '*') {
                carEspeciales++;
            }
            if (c == '-') {
                carEspeciales++;
            }
            if (c == '_') {
                carEspeciales++;
            }
        }
        return carEspeciales == 3;

    }

    public static boolean validarLongitud(String contrasena) {

        int longitudCadena = contrasena.toCharArray().length;
        return longitudCadena >= 10 && longitudCadena <= 20;
    }

    public static void main(String[] args) {
        
        final String MESSAGE = "Recuerde que la contraseña debe tener entre 10 y 20 caracteres y debe incluir *-_ en su contenido";
        Scanner input = new Scanner(System.in);
        System.out.println("Escriba una contraseña: ");
        System.out.println(MESSAGE);
        String cadena = input.nextLine();

        if (validarLongitud(cadena) && validarCaracteres(cadena)) {
            System.out.println("Tiene una contraseña válida");
        }
        else {
            System.out.println(MESSAGE);
        }
        input.close();
    }

}
