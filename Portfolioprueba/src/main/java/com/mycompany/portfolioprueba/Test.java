/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.portfolioprueba;

import Figurasgeometricas.Circulo;
import static java.time.Clock.system;

/**
 *
 * @author cdcorti
 */

/*
public class Test {
  public static void main(String[] args) {
      int anioActual = 2023;
      String[] nombres = new String []{"Fran","Eduardo","Cristian"};
      int[] nacimientos = new int [] {2000,2001,2002};
      String[] ocupaciones = new String [] {"Programador","visualizador","planificador"};
      Persona [] personas = new Persona [nombres.length];
      for (int i=0;i<personas.length;i++) {
      personas[i]=new Persona();
      personas[i].setNombre(nombres[i]) ;
      personas[i].anioNacimiento = nacimientos [i];
      personas[i].ocupacion = ocupaciones [i];
      }
      for (int i=0;i<personas.length;i++)
      { System.out.println (personas[i].getNombre()+" - "+personas[i].calcularEdad(anioActual));
              }
  }}
*/

/**
public class Test {
  static void myMethod() {
    System.out.println("Argentina programa!");
  }

 static void myMethod(String message) {
    System.out.println("Bienvenido" + message);
  }
  
  public static void main(String[] args) {
    myMethod();
    myMethod(" Alumno");
  }
}
*/
 public class Test {
  public static void main(String[] args) {
      System.out.println( "Hola Mundo");
      System.out.println( "Chau, Mundo");
      
      Circulo c1 = new Circulo (12);
      System.out.println (c1.getColor());
      
              
      
  }
 }
