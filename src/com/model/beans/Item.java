/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model.beans;

public class Item {
    private int num;    
    private int cantidad;
    private double subTotal;
    private Producto oProducto; 
    
    public double calcularSubtotal(){
        return this.cantidad*this.oProducto.getPrecio();
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }


    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getSubTotal() {
        return subTotal;
    } 

    public Producto getoProducto() {
        return oProducto;
    }

    public void setoProducto(Producto oProducto) {
        this.oProducto = oProducto;
    }
    
    
}
