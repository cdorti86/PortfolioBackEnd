/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar.com.cristiancorti.Portfolio.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author cdcorti
 */

@Entity
@Getter @Setter
public class Proyecto {
    
            @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    Long id;
    String nombre;
    String fecha_realizacion;
    String descripcion;
    String url_proyecto;
    String imagen_proyecto;
}