package Ciclo2Java.Semana1;

import java.lang.Math;
import java.util.ArrayList;

public class Ejercicio13 {
    public static void main(String[] args) {
        System.out.println("INICIO DEL PROGRAMA:\n");
        System.out.println("**********************");

        System.out.println("INICIO DEL PROGRAMA:\n");
        System.out.println("**********************");

        // El array debe ser de 10 elementos:
        int limite = 10;
        ArrayList<Integer> setNumeros = new ArrayList<Integer>();

        for (int i = 0; i <= limite; i++) {
            int randomnumber = (int)(Math.random()*(10-1+1)+1);
            setNumeros.add(randomnumber);
        }
        System.out.println("SE HA GENERADO EL SIGUIENTE SET ALEATORIO\n" + setNumeros);
        System.out.println("**********************");
        System.out.println("FIN DEL PROGRAMA:\n");

    }
}
