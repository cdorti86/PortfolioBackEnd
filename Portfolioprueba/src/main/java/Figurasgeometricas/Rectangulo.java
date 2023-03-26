/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Figurasgeometricas;

/**
 *
 * @author cdcorti
 */
public class Rectangulo extends Figura {
        public String color3;
        public double lado1;
        public double lado2;

    public Rectangulo() {
    }

        
        
    public Rectangulo(String color, double lado1, double lado2) {
        this.setColor (color);
        this.lado1 = lado1;
        this.lado2 = lado2;
    }


    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }
       
 

       
}
