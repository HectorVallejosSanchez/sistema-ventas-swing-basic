/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model.logic;

import com.model.beans.Pedido;
import com.model.dao.PedidoDao;

public class PedidoLoigic {
    public static boolean insertarPEdido(Pedido oPedido){
        return PedidoDao.insertar(oPedido);
    }
    
    
}
