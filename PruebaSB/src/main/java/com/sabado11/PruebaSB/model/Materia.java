/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sabado11.PruebaSB.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author cdcorti
 */
@Entity
@Getter @Setter

public class Materia {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)    
    Long id;
    String nombre;
    int nota;
    @ManyToOne
    @JoinColumn(name="id_alumno")
    private Alumno alumno;

}
