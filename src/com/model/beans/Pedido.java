/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model.beans;

import java.util.List;

public class Pedido {
    private String serie;
    private int numero;
    private Cliente oCliente;
    private Fecha oFecha;
    private List<Item1> lstItems;
    private double total;

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Cliente getoCliente() {
        return oCliente;
    }

    public void setoCliente(Cliente oCliente) {
        this.oCliente = oCliente;
    }

    public Fecha getoFecha() {
        return oFecha;
    }

    public void setoFecha(Fecha oFecha) {
        this.oFecha = oFecha;
    }

    public List<Item1> getLstItems() {
        return lstItems;
    }

    public void setLstItems(List<Item1> lstItems) {
        this.lstItems = lstItems;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    
    
    
    
}
