/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model.logic;

import com.model.beans.Categoria;
import com.model.dao.CategoriaDao;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

public class CategoriaLogic {

    public static DefaultTableModel obtenerModeloTabla() {
        DefaultTableModel oDTableModel = null;
        Vector datos = CategoriaDao.obtenerListaCategoria();
        Vector columnas = new Vector();
        columnas.add("CODIGO");
        columnas.add("NOMBRE");
        oDTableModel = new DefaultTableModel(datos, columnas);
        return oDTableModel;
    }

    public static DefaultComboBoxModel obtenerModeloCombo() {

        DefaultComboBoxModel oDComboModel = null;
        Vector vector = new Vector();
        vector = CategoriaDao.listarCategoria();
        oDComboModel = new DefaultComboBoxModel(vector);
        return oDComboModel;
    }

    public static boolean insertarCategoria(Categoria oCategoria) {
        return CategoriaDao.insertar(oCategoria);
    }

    public static boolean modificarCategoria(Categoria oCategoria) {
        return CategoriaDao.modificar(oCategoria);
    }

    public static boolean eliminarCategoria(Categoria oCategoria) {
        return CategoriaDao.eliminar(oCategoria);
    }
//
//    public static String buscarCategoriaporCodigo(String codigo) {
//        return CategoriaDao.buscarCategoria(codigo);
//    }
}
