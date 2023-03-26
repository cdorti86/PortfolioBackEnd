/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Figurasgeometricas;

import java.util.ArrayList;

/**
 *
 * @author cdcorti
 */
 public class Test {
  public static void main(String[] args) {
      System.out.println( "Hola Mundo");
      System.out.println( "Chau, Mundo");
      
      Circulo c1 = new Circulo (3);
      System.out.println (c1.getRadio());
      System.out.println (c1.getPerimetro());
      
            Circulo c2 = new Circulo (3);
      System.out.println (c1.getRadio());
      
      Rectangulo r1 = new Rectangulo ("blanco", 32, 20);
      System.out.println( r1.getLado1());
      System.out.println( r1.getColor());
      
      ArrayList <Figura> arrCirculos = new ArrayList<>();
      
       Circulo c3 = new Circulo (6);
       Circulo c4 = new Circulo (10); 
      arrCirculos.add (c3);
      arrCirculos.add (c4);
      arrCirculos.add (r1);      
      
      for ( Figura estecirculo : arrCirculos ) {
          double permetro = estecirculo.getPerimetro (); {
               System.out.println( permetro);
      }
      }
      
      System.out.println ("no mas figuras");
      
  }
 }
