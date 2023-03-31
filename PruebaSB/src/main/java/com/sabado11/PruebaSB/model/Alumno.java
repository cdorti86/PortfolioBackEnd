/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sabado11.PruebaSB.model;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author cdcorti
 */
@Entity
@Getter @Setter

public class Alumno {
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    Long id;
    String nombre;
    
    @OneToMany(mappedBy="alumno")
    List <Materia> materias = new ArrayList ();

    public Alumno() {
    }

    public Alumno(Long id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        this.materias = materias;
    }
    
}
