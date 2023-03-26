/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CarritoCompra;

/**
 *
 * @author cdcorti
 */
public class Producto {
    public float costo ;
    public String nombre ;
   public  int codigo ;
    public int cantidad ;
    public float descuento ;
    
    float getCosto () {
        return costo-descuento;}
}
