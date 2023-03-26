/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.portfolioprueba;

/**
 *
 * @author cdcorti
 */
public class Persona {
    
// declaro atributos
    int anioNacimiento;
    private String nombre;
    String ocupacion ;

// constructor no devuelve nada (void o boolean... etc)
    
    public Persona() {
    }

    public Persona(int anioNacimiento, String nombre, String ocupacion) {
        this.anioNacimiento = anioNacimiento;
        this.nombre = nombre;
        this.ocupacion = ocupacion;
    }
    
 // declaro metodos
    int calcularEdad (int anioActual){
         return anioActual - anioNacimiento;}

    public int getAnioNacimiento() {
        return anioNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setAnioNacimiento(int anioNacimiento) {
        this.anioNacimiento = anioNacimiento;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }
    
}