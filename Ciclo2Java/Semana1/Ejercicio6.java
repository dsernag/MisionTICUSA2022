package Ciclo2Java.Semana1;

import java.util.Scanner;

public class Ejercicio6 {

    public static String calcularDescuento(double totalCompra) {
        final String MSS = "Tienes derecho a un descuento del ";
        if (totalCompra < 100) {
            return "No tienes derecho a descuento. Debes cancelar: " + totalCompra;
        } else if (totalCompra > 100 && totalCompra <= 200) {
            return MSS + "10%." + " Debes cancelar: " + (totalCompra - (totalCompra * 0.1));
        } else {
            return MSS + "15%." + " Debes cancelar: " + (totalCompra - (totalCompra * 0.15));
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Por favor ingrese el precio del producto: ");
        double precio = input.nextDouble();

        System.out.println("Por favor ingrese la cantidad a comprar: ");
        int unidades = input.nextInt();

        double total = unidades * precio;
        System.out.println(calcularDescuento(total));
        input.close();
    }
}
