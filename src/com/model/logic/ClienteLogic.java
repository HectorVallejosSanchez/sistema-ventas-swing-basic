/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model.logic;

import com.model.beans.Cliente;
import com.model.dao.ClienteDao;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

public class ClienteLogic {

    public static DefaultTableModel obtenerModeloTabla() {
        DefaultTableModel oDTableModel = null;
        Vector datos = ClienteDao.obtenerListaCliente();
        Vector columnas = new Vector();
        columnas.add("CODIGO");
        columnas.add("NOMBRES");
        columnas.add("APELLIDOS");
        columnas.add("DIRECCION");
        columnas.add("TELEFONO");
        oDTableModel = new DefaultTableModel(datos, columnas);
        return oDTableModel;
    }

    public static DefaultTableModel obtenerTablaporNombre(String nombre) {
        DefaultTableModel modelotabla = null;
        Vector vDatos = ClienteDao.obtenerPornombre(nombre);
        Vector vColumnas = new Vector();
        vColumnas.add("CODIGO");
        vColumnas.add("NOMBRES");
        vColumnas.add("APELLIDOS");
        vColumnas.add("DIRECCION");
        vColumnas.add("TELEFONO");
        modelotabla = new DefaultTableModel(vDatos, vColumnas);
        return modelotabla;
        
    }

    public static DefaultTableModel obtenerModeloTabla(String codigo) {
        DefaultTableModel oDTableModel = null;
        Vector datos = ClienteDao.obtenerListaCliente(codigo);
        Vector columnas = new Vector();
        columnas.add("CODIGO");
        columnas.add("NOMBRES");
        columnas.add("APELLIDOS");
        columnas.add("DIRECCION");
        columnas.add("TELEFONO");
        oDTableModel = new DefaultTableModel(datos, columnas);
        return oDTableModel;
    }

    public static DefaultTableModel obtenerModeloTablaporNombre(String nombre) {
        DefaultTableModel oDTableModel = null;
        Vector datos = ClienteDao.obtenerListaClienteporNombre(nombre);
        Vector columnas = new Vector();
        columnas.add("CODIGO");
        columnas.add("NOMBRES");
        columnas.add("APELLIDOS");
        columnas.add("DIRECCION");
        columnas.add("TELEFONO");
        oDTableModel = new DefaultTableModel(datos, columnas);
        return oDTableModel;
    }

    public static DefaultTableModel obtenerModeloTablaporApellido(String apellido) {
        DefaultTableModel oDTableModel = null;
        Vector datos = ClienteDao.obtenerListaClienteporApellido(apellido);
        Vector columnas = new Vector();
        columnas.add("CODIGO");
        columnas.add("NOMBRES");
        columnas.add("APELLIDOS");
        columnas.add("DIRECCION");
        columnas.add("TELEFONO");
        oDTableModel = new DefaultTableModel(datos, columnas);
        return oDTableModel;
    }

    public static boolean insertarCliente(Cliente oCliente) {
        return ClienteDao.insertar(oCliente);
    }

    public static boolean modificarCliente(Cliente oCliente) {
        return ClienteDao.modificar(oCliente);
    }

    public static boolean eliminarCliente(Cliente oCliente) {
        return ClienteDao.eliminar(oCliente);
    }

    public static Cliente buscarCliente(String codigo) {
        return ClienteDao.buscar(codigo);
    }
}
