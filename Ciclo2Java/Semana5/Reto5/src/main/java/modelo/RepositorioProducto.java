/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author daseg
 */
public interface RepositorioProducto extends CrudRepository<Producto, Integer> {
    
}
