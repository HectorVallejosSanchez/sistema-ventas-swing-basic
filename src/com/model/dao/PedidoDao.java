/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model.dao;

import com.model.beans.Pedido;
import java.util.ArrayList;
import java.util.List;

public class PedidoDao {
    public static List<Pedido> lstPedidos = new ArrayList<>();
    
    public static int buscar(Pedido oPedido){
        int pos =-1;
        
        for (int i = 0; i < lstPedidos.size(); i++) {
            if (lstPedidos.get(i).getNumero()==oPedido.getNumero()) {
                pos = i;
            }
        }
        return pos;
    }
    
    public static boolean insertar(Pedido oPedido){
        if (buscar(oPedido)==-1) {
            lstPedidos.add(oPedido);
            return true;
        }else{
            return false;
        }
    }
    
    
}
