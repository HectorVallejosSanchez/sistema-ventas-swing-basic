package com.model.dao;

import com.model.beans.Producto;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class ProductoDao {

    private static List<Producto> lstProducto = new ArrayList<Producto>();
    
    public static List<Producto> listarProductos(){
        return lstProducto;
    }

    public static int buscar(Producto oProducto) {
        int posicion = -1;
        for (int i = 0; i < lstProducto.size(); i++) {
            if (lstProducto.get(i).getIdProducto().equals(oProducto.getIdProducto())) {
                posicion = i;
                break;
            }
        }

        return posicion;
    }

    public static Producto buscar(String codigo) {
        Producto oProducto = null;
        for (int i = 0; i < lstProducto.size(); i++) {
            if (lstProducto.get(i).getIdProducto().equals(codigo)) {
                oProducto = lstProducto.get(i);
            }
        }
        return oProducto;
    }

    public static boolean insertar(Producto oProducto) {

        if (buscar(oProducto) == -1) {
            lstProducto.add(oProducto);
            return true;
        } else {
            return false;
        }
    }

    public static boolean eliminar(Producto oProducto) {
        int pos;
        pos = buscar(oProducto);
        if (pos != -1) {
            lstProducto.remove(pos);
            return true;
        } else {
            return false;
        }
    }

    public static boolean modificar(Producto oProducto) {
        int pos;
        pos = buscar(oProducto);
        if (pos != -1) {
            lstProducto.set(pos, oProducto);
            return true;
        } else {
            return false;
        }
    }

    public static Vector obtenerListaProducto() {
        Vector vProducto = new Vector();

        for (int i = 0; i < lstProducto.size(); i++) {
            Vector producto = new Vector();
            producto.add(lstProducto.get(i).getIdProducto());
            producto.add(lstProducto.get(i).getNombre());
            producto.add(lstProducto.get(i).getCosto());
            producto.add(lstProducto.get(i).getPrecio());
            producto.add(lstProducto.get(i).getStock());
            producto.add(lstProducto.get(i).getoCategoria());
            vProducto.add(producto);
        }
        return vProducto;
    }

    public static Vector obtenerListaProducto(String nombre) {
        Vector vProducto = new Vector();        
        for (int i = 0; i < lstProducto.size(); i++) {
            if (lstProducto.get(i).getNombre().substring(0, nombre.length()).equals(nombre)) {
                Vector producto = new Vector();
                producto.add(lstProducto.get(i).getIdProducto());
                producto.add(lstProducto.get(i).getNombre());
                producto.add(lstProducto.get(i).getCosto());
                producto.add(lstProducto.get(i).getPrecio());
                producto.add(lstProducto.get(i).getStock());
                producto.add(lstProducto.get(i).getoCategoria());
                vProducto.add(producto);                
            }
        }
        return vProducto;


    }

    public static Vector obtenerListaProductoporCodigo(String codigo) {
        Vector vProducto = new Vector();
        int num = 0;
        for (int i = 0; i < lstProducto.size(); i++) {
            if (lstProducto.get(i).getIdProducto().substring(0, codigo.length()).equals(codigo)) {
                Vector producto = new Vector();
                producto.add(lstProducto.get(i).getIdProducto());
                producto.add(lstProducto.get(i).getNombre());
                producto.add(lstProducto.get(i).getCosto());
                producto.add(lstProducto.get(i).getPrecio());
                producto.add(lstProducto.get(i).getStock());
                producto.add(lstProducto.get(i).getoCategoria());
                vProducto.add(producto);
                num = 1;
            }
        }
        return vProducto;
    }
}