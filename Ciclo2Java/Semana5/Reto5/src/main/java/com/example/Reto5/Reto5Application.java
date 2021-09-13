package com.example.Reto5;

import controlador.ControladorProducto;
import modelo.RepositorioProducto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jdbc.repository.config.EnableJdbcRepositories;
import vista.AppTienda;

/**
 * Instancia la vista y el controlador
 * @author dsernag
 */
@SpringBootApplication
@ComponentScan("modelo")
@EnableJdbcRepositories("modelo")
public class Reto5Application {
    
    @Autowired
    RepositorioProducto repositorio;
    public static void main(String[] args) {
        SpringApplicationBuilder builder = new SpringApplicationBuilder(Reto5Application.class);
        builder.headless(false);
        ConfigurableApplicationContext context = builder.run(args);
    }
    
    @Bean
    ApplicationRunner applicationRunner(){
        return args -> {
            AppTienda vista = new AppTienda();
            ControladorProducto controlador = new ControladorProducto(repositorio, vista);
            vista.setControlador(controlador);
        };
    }

}
