/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CarritoCompra;

/**
 *
 * @author cdcorti
 */
public class Test {
  public static void main(String[] args) {
      String[] nombres = new String []{"yerba","gaseosa","pan","carne"};
      int[] precios = new int[]{500,300,200,1000};
      int[] descuentos = new int[]{20,10,5,200};
      Producto[] producto = new Producto[nombres.length];
      for (int i=0;i<nombres.length;i++) {
          producto[i] = new Producto ();
          producto[i].nombre = nombres[i];
          producto[i].costo = precios[i];
          producto[i].descuento = descuentos[i];
          producto[i].codigo = i;
      }
      CarritoCompra carrito = new CarritoCompra() ;
      carrito.agregarProducto(producto[1], 3); //900 
      carrito.agregarProducto(producto[2], 2); //400
      carrito.agregarProducto(producto[0], 4); //2000
    //  System.out.println(carrito.getCostoTotal());
      
  Productolimitado pl= new Productolimitado () ;
  pl.nombre="mouse";
  pl.cantidad=2;
  pl.costo=110f;
  pl.descuento=10f;
  pl.setStock(10);
  System.out.println(pl.getCosto());
}}