/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CarritoCompra;

/**
 *
 * @author cdcorti
 */
public class CarritoCompra {
    int max=10 ;
    Producto[] productos = new Producto [max];
    int[] cantidades = new int [max];
    int productosCarrito=0;
    
    float getCostoTotal() {
        float total=0;
        for (int i=0;i<productosCarrito ;i++) {
            total+=productos[i].getCosto()*cantidades[i];
                    }
        return total;
        }
    boolean agregarProducto(Producto p, int cantidad) {
        if (productosCarrito==10) {
            System.out.println("Error no entra en el carrito");
            return false;
        }
        productos[productosCarrito] = p;
        cantidades[productosCarrito] = cantidad;
        productosCarrito++;
        System.out.println("Se agrego el producto con exito");
        return false;
        }
    }
