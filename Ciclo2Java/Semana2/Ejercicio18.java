package Ciclo2Java.Semana2;

class Vehiculo {
    String numero_matricula;
    double peso;

    public Vehiculo(String numero_matricula, double peso) {
        this.numero_matricula = numero_matricula;
        this.peso = peso;
    }

    public Vehiculo() {

    }

    public String getNumero_matricula() {
        return numero_matricula;
    }

    public double getPeso() {
        return peso;
    }

    public void setNumero_matricula(String numero_matricula) {
        this.numero_matricula = numero_matricula;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double impuestoBase(double peso) {
        return peso * 0.45;
    }

}

class Electrico extends Vehiculo {
    private double precio;

    public Electrico() {

    }

    public Electrico(String numero_matricula, double peso, double precio) {
        super(numero_matricula, peso);
        this.precio = precio;
    }

    public Electrico(double precio) {
        this.precio = precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getPrecio() {
        return precio;
    }

    public double impuestoExtra() {
        // Los vehículos eléctricos tributan un 9% de su precio más el impuesto base
        return this.impuestoBase(peso) + this.getPrecio() * 0.09;
    }

}

class Combustion extends Vehiculo {
    private double cilindrada;

    public Combustion() {

    }

    public Combustion(String numero_matricula, double peso, double cilindrada) {
        super(numero_matricula, peso);
        this.cilindrada = cilindrada;
    }

    public Combustion(double cilindrada) {
        this.cilindrada = cilindrada;
    }

    public double getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(double cilindrada) {
        this.cilindrada = cilindrada;
    }

    public double impuestoExtra() {
        // los vehículos de combustión tributan el triple de su cilindrada más el
        // impuesto base
        return this.impuestoBase(peso) + 3 * this.cilindrada;
    }
}

public class Ejercicio18 {

    public static void main(String[] args) {
        Electrico electrico1 = new Electrico("OAB78F", 200, 5000000);
        Electrico electrico2 = new Electrico("RMZ78E", 322, 7200000);
        Combustion convencional1 = new Combustion("WWFX335", 1428, 4500);
        Combustion convencional2 = new Combustion("FTQ771", 1684, 2200);

        Electrico electricos[] = { electrico1, electrico2 };
        Combustion convencionales[] = { convencional1, convencional2 };

        for (Combustion vehi_combus : convencionales) {
            System.out.println("El vehículo convencional de matrícula: " + vehi_combus.getNumero_matricula() + " debe cancelar: "
                    + String.format("%.2f", vehi_combus.impuestoExtra()) + " pesos.");
        }

        for (Electrico vehi_elec : electricos) {
            System.out.println("El vehículo eléctrico de matrícula: " + vehi_elec.getNumero_matricula() + " debe cancelar: "
                    + String.format("%.2f", vehi_elec.impuestoExtra()) + " pesos.");
        }
    }

}
