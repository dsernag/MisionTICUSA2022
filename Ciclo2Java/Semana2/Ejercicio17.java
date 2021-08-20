package Ciclo2Java.Semana2;

// Primera clase Fecha
class Fecha {
    private int ano;
    private int mes;
    private int dia;

    public Fecha() {

    }

    public Fecha(int ano, int mes, int dia) {
        this.ano = ano;
        this.mes = mes;
        this.dia = dia;
    }

    /**
     * @return int
     */
    public int getAno() {
        return ano;
    }

    /**
     * @return int
     */
    public int getDia() {
        return dia;
    }

    /**
     * @return int
     */
    public int getMes() {
        return mes;
    }

    /**
     * @param ano
     */
    public void setAno(int ano) {
        this.ano = ano;
    }

    /**
     * @param mes
     */
    public void setMes(int mes) {
        this.mes = mes;
    }

    /**
     * @param dia
     */
    public void setDia(int dia) {
        this.dia = dia;
    }

    /**
     * @return String
     */
    @Override
    public String toString() {
        return getDia() + "/" + getMes() + "/" + getAno();
    }

}

// Segunda Clase Persona
class Persona {
    private String nombre;
    private String apellido;
    private Fecha nacimiento;

    public Persona() {

    }

    public Persona(String nombre, String apellido, Fecha nacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nacimiento = nacimiento;
    }
    
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public Fecha getNacimiento() {
        return nacimiento;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setNacimiento(Fecha nacimiento) {
        this.nacimiento = nacimiento;
    }

}

public class Ejercicio17 {
    public static void main(String[] args) {
        // Fecha fechaPer1 = new Fecha(1994, 6, 25);
        Persona persona1 = new Persona("David", "Serna", new Fecha(1994, 6, 25));

        // Fecha fechaPer2 = new Fecha(1982, 12, 13);
        Persona persona2 = new Persona("Carlos", "Benavides", new Fecha(1982, 12, 13));

        // Fecha fechaPer3 = new Fecha(1958, 4, 2);
        Persona persona3 = new Persona("Catalina", "Sánchez", new Fecha(1958, 4, 2));

        Persona personas[] = { persona1, persona2, persona3 };

        for (Persona persona : personas) {
            System.out.println("La fecha de nacimiento de " + persona.getNombre() + " " + persona.getApellido()
                    + " es: " + persona.getNacimiento());
        }

    }

}
