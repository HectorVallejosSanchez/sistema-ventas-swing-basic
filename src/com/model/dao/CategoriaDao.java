/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model.dao;

import com.model.beans.Categoria;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class CategoriaDao {

    private static List<Categoria> lstCategoria = new ArrayList<Categoria>();

    public static int buscar(Categoria oCategoria) {
        int posicion = -1;
        for (int i = 0; i < lstCategoria.size(); i++) {
            if (lstCategoria.get(i).getIdCategoria().equals(oCategoria.getIdCategoria())) {
                posicion = i;
                break;
            }
        }

        return posicion;
    }

    public static boolean insertar(Categoria oCategoria) {

        if (buscar(oCategoria) == -1) {
            lstCategoria.add(oCategoria);
            return true;
        } else {
            return false;
        }
    }

    public static boolean eliminar(Categoria oCategoria) {
        int pos;
        pos = buscar(oCategoria);
        if (pos != -1) {
            lstCategoria.remove(pos);
            return true;
        } else {
            return false;
        }
    }

    public static boolean modificar(Categoria oCategoria) {
        int pos;
        pos = buscar(oCategoria);
        if (pos != -1) {
            lstCategoria.set(pos, oCategoria);
            return true;
        } else {
            return false;
        }
    }

    public static Vector obtenerListaCategoria() {
        Vector vCategoria = new Vector();

        for (int i = 0; i < lstCategoria.size(); i++) {
            Vector categoria = new Vector();
            categoria.add(lstCategoria.get(i).getIdCategoria());
            categoria.add(lstCategoria.get(i).getNombre());
            vCategoria.add(categoria);
        }
        return vCategoria;

    }

    public static Vector listarCategoria() {
        Vector vCategoria = new Vector();
        for (int i = 0; i < lstCategoria.size(); i++) {
            vCategoria.add(lstCategoria.get(i));
        }
        return vCategoria;
    }

}
