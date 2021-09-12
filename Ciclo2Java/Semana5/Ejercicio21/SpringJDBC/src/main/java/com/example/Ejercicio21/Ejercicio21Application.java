package com.example.Ejercicio21;

import java.util.List;
import javax.swing.JOptionPane;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Ejercicio21Application {

    @Autowired
    RepositorioPersonas repositorioPersonas;

    public static void main(String[] args) {
        SpringApplicationBuilder builder = new SpringApplicationBuilder(Ejercicio21Application.class);
        builder.headless(false);
        ConfigurableApplicationContext context = builder.run(args);
    }
    /**
     * Metodo rapdio para crear una ventana de respuestas
     */
    public void imprimirResumen() {
        List<Persona> resultado = (List<Persona>) repositorioPersonas.findAll();
        String resume = "| id_persona | nombre | apellido | profesion | ciudad |\n";
        for (Persona persona : resultado) {
            resume += persona + "\n";
        }
        JOptionPane.showMessageDialog(null, resume, "RESULTADO", JOptionPane.INFORMATION_MESSAGE);
    }

    @Bean
    ApplicationRunner applicationRunner() {
        return args -> {
            //1) Agregue dos registros a la base de datos
            // Crear el tipo de clases a agregar:
            Persona persona1 = Persona.crearPersona(null, "Juancho", "Zapata", "Odontologo", "Moscu");
            Persona persona2 = Persona.crearPersona(null, "Luisa", "Cadavid", "Enfermera", "Paris");
            Persona persona3 = Persona.crearPersona(null, "Octavio", "Paz", "Doctor", "Miami");
            Persona persona4 = Persona.crearPersona(null, "Felipe", "Sierra", "Entrenador", "La Habana");

            repositorioPersonas.save(persona1);
            repositorioPersonas.save(persona2);
            repositorioPersonas.save(persona3);
            repositorioPersonas.save(persona4);

            //2) Imprima todos los registros de la base de datos
            imprimirResumen();
            
            //3) Cuente la cantidad de registros en la base de datos
            List<Persona> resultado = (List<Persona>) repositorioPersonas.findAll();
            JOptionPane.showMessageDialog(null, ("Existen " + resultado.size() + " entradas"), "Cantidad de entradas", JOptionPane.INFORMATION_MESSAGE);

            //4) imprima los datos de la persona con el id_persona = 2
            Persona busqueda2 = repositorioPersonas.findById(2).get();
            String resume2 = "| id_persona | nombre | apellido | profesion | ciudad |\n";
            resume2 += busqueda2;
            JOptionPane.showMessageDialog(null, resume2, "Persona con ID = 2", JOptionPane.INFORMATION_MESSAGE);

            //5) Cambie la información de alguno de los registros de la base de datos
            JOptionPane.showMessageDialog(null, "Se actualiza\nProfesion = Astronauta\nCiudad = Londres", "Actualizacion Persona 1", JOptionPane.INFORMATION_MESSAGE);
            Persona actualizar = repositorioPersonas.findById(1).get();
            actualizar.setProfesion("Astronauta");
            actualizar.setCiudad("Londres");
            repositorioPersonas.save(actualizar);
            imprimirResumen();
            
            //6) Elimine el registro de la persona id_persona = 2
            JOptionPane.showMessageDialog(null, "Persona 2 eliminada", "Borrar Persona 2", JOptionPane.INFORMATION_MESSAGE);
            repositorioPersonas.deleteById(2);
            imprimirResumen();
        };

    }

}
