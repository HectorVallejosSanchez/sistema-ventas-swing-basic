package com.model.logic;

import com.model.beans.Producto;
import com.model.dao.ProductoDao;
import java.util.List;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

public class ProductoLogic {

    public static DefaultTableModel obtenerModeloTabla() {
        DefaultTableModel oDTableModel = null;
        Vector datos = ProductoDao.obtenerListaProducto();
        Vector columnas = new Vector();
        columnas.add("CODIGO");
        columnas.add("NOMBRE");
        columnas.add("COSTO");
        columnas.add("PRECIO");
        columnas.add("STOCK");
        columnas.add("CATEGORIA");
        oDTableModel = new DefaultTableModel(datos, columnas);
        return oDTableModel;
    }

    public static DefaultTableModel obtenerModeloTabla(String nombre) {
        DefaultTableModel oDTableModel = null;
        Vector datos = ProductoDao.obtenerListaProducto(nombre);
        Vector columnas = new Vector();
        columnas.add("CODIGO");
        columnas.add("NOMBRE");
        columnas.add("COSTO");
        columnas.add("PRECIO");
        columnas.add("STOCK");
        columnas.add("CATEGORIA");
        oDTableModel = new DefaultTableModel(datos, columnas);
        return oDTableModel;
    }

    public static DefaultTableModel obtenerModeloTablaporCodigo(String codigo) {
        DefaultTableModel oDTableModel = null;
        Vector datos = ProductoDao.obtenerListaProductoporCodigo(codigo);
        Vector columnas = new Vector();
        columnas.add("CODIGO");
        columnas.add("NOMBRE");
        columnas.add("COSTO");
        columnas.add("PRECIO");
        columnas.add("STOCK");
        columnas.add("CATEGORIA");
        oDTableModel = new DefaultTableModel(datos, columnas);
        return oDTableModel;
    }
    public static boolean insertarProducto(Producto oProducto) {
        return ProductoDao.insertar(oProducto);
    }

    public static boolean modificarProducto(Producto oProducto) {
        return ProductoDao.modificar(oProducto);
    }

    public static boolean eliminarProducto(Producto oProducto) {
        return ProductoDao.eliminar(oProducto);
    }

    public static Producto buscarProducto(String codigo) {
        return ProductoDao.buscar(codigo);
    }
    public static List<Producto> listarProductos(){
        return ProductoDao.listarProductos();
    }
}
