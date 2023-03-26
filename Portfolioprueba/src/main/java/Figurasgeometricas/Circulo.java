/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Figurasgeometricas;

/**
 *
 * @author cdcorti
 */
public class Circulo extends Figura {
    public double radio;
    public String color;

    public Circulo() {
    }

    
    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }
    @Override
    public double getPerimetro() {
        return this.radio*3.1416*2 ;
    }

    public double getRadio() {
        return radio;
    }

    @Override
    public String getColor() {
        return color;
    }
    
}
