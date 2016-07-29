/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model.dao;

import com.model.beans.Cliente;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class ClienteDao {

    private static List<Cliente> lstCliente = new ArrayList<Cliente>();

    public static int buscar(Cliente oCliente) {
        int posicion = -1;
        for (int i = 0; i < lstCliente.size(); i++) {
            if (lstCliente.get(i).getIdCliente().equals(oCliente.getIdCliente())) {
                posicion = i;
                break;
            }
        }

        return posicion;
    }

    public static Cliente buscar(String codigo) {
        Cliente oCliente = null;
        for (int i = 0; i < lstCliente.size(); i++) {
            if (lstCliente.get(i).getIdCliente().equals(codigo)) {
                oCliente = lstCliente.get(i);
            }
        }
        return oCliente;
    }

    public static boolean insertar(Cliente oCliente) {

        if (buscar(oCliente) == -1) {
            lstCliente.add(oCliente);
            return true;
        } else {
            return false;
        }
    }

    public static boolean eliminar(Cliente oCliente) {
        int pos;
        pos = buscar(oCliente);
        if (pos != -1) {
            lstCliente.remove(pos);
            return true;
        } else {
            return false;
        }
    }

    public static boolean modificar(Cliente oCliente) {
        int pos;
        pos = buscar(oCliente);
        if (pos != -1) {
            lstCliente.set(pos, oCliente);
            return true;
        } else {
            return false;
        }
    }

    public static Vector obtenerListaCliente() {
        Vector vProducto = new Vector();

        for (int i = 0; i < lstCliente.size(); i++) {
            Vector cliente = new Vector();
            cliente.add(lstCliente.get(i).getIdCliente());
            cliente.add(lstCliente.get(i).getNombres());
            cliente.add(lstCliente.get(i).getApellidos());
            cliente.add(lstCliente.get(i).getDireccion());
            cliente.add(lstCliente.get(i).getTelefono());
            vProducto.add(cliente);
        }
        return vProducto;

    }

    public static Vector obtenerListaClienteporNombre(String nombre) {
        Vector vProducto = new Vector();
        for (int i = 0; i < lstCliente.size(); i++) {
            if (lstCliente.get(i).getNombres().substring(0, nombre.length()).equals(nombre)) {
                Vector cliente = new Vector();
                cliente.add(lstCliente.get(i).getIdCliente());
                cliente.add(lstCliente.get(i).getNombres());
                cliente.add(lstCliente.get(i).getApellidos());
                cliente.add(lstCliente.get(i).getDireccion());
                cliente.add(lstCliente.get(i).getTelefono());
                vProducto.add(cliente);
            }

        }
        return vProducto;

    }

    public static Vector obtenerListaClienteporApellido(String apellido) {
        Vector vProducto = new Vector();
        for (int i = 0; i < lstCliente.size(); i++) {


            if (lstCliente.get(i).getApellidos().substring(0, apellido.length()).equals(apellido)) {
                Vector cliente = new Vector();
                cliente.add(lstCliente.get(i).getIdCliente());
                cliente.add(lstCliente.get(i).getNombres());
                cliente.add(lstCliente.get(i).getApellidos());
                cliente.add(lstCliente.get(i).getDireccion());
                cliente.add(lstCliente.get(i).getTelefono());
                vProducto.add(cliente);

            }

        }
        return vProducto;

    }

    public static Vector obtenerListaCliente(String codigo) {
        Vector vProducto = new Vector();
        for (int i = 0; i < lstCliente.size(); i++) {
            if (lstCliente.get(i).getIdCliente().substring(0, codigo.length()).equals(codigo)) {
                Vector cliente = new Vector();
                cliente.add(lstCliente.get(i).getIdCliente());
                cliente.add(lstCliente.get(i).getNombres());
                cliente.add(lstCliente.get(i).getApellidos());
                cliente.add(lstCliente.get(i).getDireccion());
                cliente.add(lstCliente.get(i).getTelefono());
                vProducto.add(cliente);

            }
        }
        return vProducto;

    }

    public static Vector obtenerPornombre(String nombre) {
        Vector vClientes = new Vector();
        String subnombre;
        for (int i = 0; i < lstCliente.size(); i++) {
            subnombre = lstCliente.get(i).getNombres().substring(0, nombre.length());
            if (subnombre.equals(nombre)) {
                Vector vDatos = new Vector();
                vDatos.add(lstCliente.get(i).getIdCliente());
                vDatos.add(lstCliente.get(i).getNombres());
                vDatos.add(lstCliente.get(i).getApellidos());
                vDatos.add(lstCliente.get(i).getDireccion());
                vDatos.add(lstCliente.get(i).getTelefono());
                vClientes.add(vDatos);                
            }
        }

        return vClientes;

    }
}
