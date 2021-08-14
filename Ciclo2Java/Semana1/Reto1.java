package Ciclo2Java.Semana1;
import java.util.Scanner;

/**
 * 
 * 
 * @author David Serna
 */
public class Reto1 {
    /**
     * Este debe ser el único objeto de tipo Scanner en el código
     */
    private final static Scanner input = new Scanner(System.in);

    /**
     * Este método tiene como entrada masa y altura
     * 
     * @param masa
     * @param altura
     * @return Devuelve el Índice de masa corporal
     */
    public static double indMasaCor(double masa, double altura) {
        return masa / (altura * altura);
    }

    /**
     * Este método verifica sí los datos ingresados son válidos
     * 
     * @param masa
     * @param altura
     * @param edad
     * @return Regresa 'false' sí no la cumple y 'true' sí puede pasar
     */
    public static boolean verificarDatos(double masa, double altura, int edad) {
        return (masa < 0 || masa > 105 || altura < 0.5 || altura > 2.1 || edad < 1 || edad > 100);
    }

    /**
     * Método para obtener el nivel de riesgo
     * 
     * @param indice
     * @param edad
     * @return Mensaje entre ALTO, MEDIO Y BAJO
     */
    public static String calcNivelesRiesgo(double indice, int edad) {
        if (edad < 45 && indice < 22) {
            return "BAJO";
        } else if (edad < 45 && indice >= 22 || edad >= 45 && indice < 22) {
            return "MEDIO";
        } else {
            return "ALTO";
        }
    }

    /**
     * Imprime el IMC con el nivel de Riesgo
     * 
     * @param masa
     * @param altura
     * @param edad
     */
    public static void imprimirResultado(double masa, double altura, int edad) {
        double indexMC = indMasaCor(masa, altura);
        String nivelRiesgo = calcNivelesRiesgo(indexMC, edad);

        if (verificarDatos(masa, altura, edad)) {
            System.out.println("DATOS ERRADOS");
        } else {
            System.out.println(String.format("%.3f", indexMC) + " " + nivelRiesgo);
        }
    }

    /**
     * método principal
     */
    public static void main(String[] args) {
        String entrada = input.nextLine();
        // Plantilla sergio
        // String entrada = read();
        String[] valores = entrada.split(" ");

        // Obtener los valores de masa, altura y edad
        double masa = Double.parseDouble(valores[0]);
        double altura = Double.parseDouble(valores[1]);
        int edad = Integer.parseInt(valores[2]);
        imprimirResultado(masa, altura, edad);
    }
}
