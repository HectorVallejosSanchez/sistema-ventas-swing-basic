/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model.logic;

import com.model.beans.Item;
import com.model.dao.ItemDao;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

public class ItemLogic {

    ItemDao oiDao = new ItemDao();

    public boolean insertarItem(Item oItem) {
        return oiDao.insertar(oItem);
    }
    
    public Vector vvv(){
        return oiDao.obtnerListaItems();
    }
    
    public DefaultTableModel obtenerModeloTabla(){
        DefaultTableModel modeloTabla = null;
        Vector vDatos = oiDao.obtnerListaItems();
        Vector vColumnas = new Vector();
        
        vColumnas.add("num");
        vColumnas.add("producto");
        vColumnas.add("cantidad");
        vColumnas.add("subtotal");
        
        modeloTabla = new DefaultTableModel(vDatos, vColumnas);
        return modeloTabla;
        
    }
    public double calculateTotal(){
        return oiDao.calculatetotal();
    }
}
