/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.model.beans;

public class Categoria {

    private String idCategoria;
    private String nombre;

    public String getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(String idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString(){
       return this.getNombre();
    }

}
