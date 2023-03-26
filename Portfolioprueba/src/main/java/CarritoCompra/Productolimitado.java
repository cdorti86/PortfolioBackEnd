/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CarritoCompra;

/**
 *
 * @author cdcorti
 */
public class Productolimitado extends Producto {
    int stock ;

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
    
    @Override
 public float getCosto () {
     if (stock>1000)
         return super.getCosto()*1.5f;
     else if (this.stock<100)
         return super.getCosto()*2f;
     return super.getCosto();
 }
}
