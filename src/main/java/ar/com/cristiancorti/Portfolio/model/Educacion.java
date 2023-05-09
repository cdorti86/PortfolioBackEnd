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
public class Educacion {

        @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    Long id;
    String Titulo;
    String Centro_educacion;
    boolean Finalizado;
    String Fecha_inicio;
    String Fecha_final;
    float Promedio;
    
}