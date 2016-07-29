/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model.dao;

import com.model.beans.Item;
import com.model.beans.Producto;
import com.model.logic.ProductoLogic;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class ItemDao {

    private List<Item> lstItem = new ArrayList<>();

    public int posProducto(Item oItem) {
        int pos = -1;
        for (int i = 0; i < ProductoLogic.listarProductos().size(); i++) {
            if (oItem.getoProducto().getIdProducto().equals(ProductoLogic.listarProductos().get(i).getIdProducto())) {
                pos = i;
            }
        }
        return pos;
    }

    public int stock(Item oItem) {
        int pos = posProducto(oItem);
        return ProductoLogic.listarProductos().get(pos).getStock();
    }

    public boolean insertar(Item oItem) {
        int st;
        if (stock(oItem) >= oItem.getCantidad()) {
            lstItem.add(oItem);
            Producto oProducto;
            oProducto = ProductoLogic.listarProductos().get(posProducto(oItem));
            st = oProducto.getStock() - oItem.getCantidad();
            oProducto.setStock(st);
            ProductoLogic.listarProductos().set(posProducto(oItem), oProducto);
            return true;
        } else {
            return false;
        }

    }

    public Vector obtnerListaItems() {
        Vector vItems = new Vector();
        for (int i = 0; i < lstItem.size(); i++) {
            Vector vItem = new Vector();
            vItem.add(lstItem.get(i).getNum());
            vItem.add(lstItem.get(i).getoProducto());
            vItem.add(lstItem.get(i).getCantidad());
            vItem.add(lstItem.get(i).calcularSubtotal());
            vItems.add(vItem);
        }
        return vItems;
    }
    
    public double calculatetotal(){
        double t=0;
        for (int i = 0; i < lstItem.size(); i++) {
            t=t+lstItem.get(i).getSubTotal();
        }
        return t;
    }
        
    
}
