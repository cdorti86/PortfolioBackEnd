/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ejemplo.SpringBoot_V11.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author cdcorti
 */
@Getter @Setter
@Entity
public class Persona {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;
    private String Nombre;
    private String Apellido;

    public Persona() {
    }

    public Persona(Long Id, String Nombre, String Apellido) {
        this.Id = Id;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
    }
    
}
