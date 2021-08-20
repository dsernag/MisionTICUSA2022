package Ciclo2Java.Semana2;

class Cuenta {
    private String titular;
    private double cantidad;

    // Setters and Getters
    /**
     * @param titular
     */
    public void setTitular(String titular) {
        this.titular = titular;
    }

    /**
     * @return String
     */
    public String getTitular() {
        return titular;
    }

    /**
     * @param cantidad
     */
    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * @return double
     */
    public double getCantidad() {
        return cantidad;
    }

    // Constructores
    public Cuenta() {
    }

    public Cuenta(String titular) {
        this.titular = titular;
    }

    /**
     * Esta función permite ingresar una cantidad a la cuenta
     * 
     * @param cantidad
     */
    public void ingresar(double cantidad) {
        if (cantidad <= 0) {
            System.out.println("Por favor ingrese una cantidad mayor a 0");
        } else {
            setCantidad(getCantidad() + cantidad);
            System.out.println("Felicitaciones!. Acabas de ingresar: " + String.format("%.2f", cantidad)
                    + "//Para un total de: " + String.format("%.2f", getCantidad()));
        }

    }

    /**
     * Esta función permite retirar de la cuenta
     * 
     * @param cantidad
     */
    public void retirar(double cantidad) {
        if (cantidad > getCantidad()) {
            setCantidad(0);
            System.out.println("Retiraste más de lo que tenías por eso quedas en 0");
        } else {
            setCantidad(getCantidad() - cantidad);
            System.out.println("Felicitaciones!. Acabas de retirar: " + String.format("%.2f", cantidad)
                    + "//Para un total de: " + String.format("%.2f", getCantidad()));
        }
    }

}

public class Ejercicio15 {
    public static void main(String[] args) {
        // Instanciar dos cuentas
        Cuenta cuenta1 = new Cuenta("Julian");
        Cuenta cuenta2 = new Cuenta("Andrés");

        // Ingresar, retirar y jugar con ellas:
        // Ingresar
        cuenta1.ingresar(100000);
        cuenta2.ingresar(300000);

        // Ingreso negativo:
        cuenta1.ingresar(-100);
        cuenta2.ingresar(-200);

        // Retirar:
        cuenta1.retirar(50000);
        cuenta2.retirar(400000); // Caso en que la cuenta queda negativa
    }
}
