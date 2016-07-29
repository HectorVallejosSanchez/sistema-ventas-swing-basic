/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model.beans;

import java.util.Calendar;

public class Fecha {

    Calendar oC = Calendar.getInstance();
    private int hora;
    private int minuto;
    private int segundo;
    private int dia;
    private int mes;
    private int año;

    public int getHora() {
        return oC.get(Calendar.HOUR_OF_DAY);
    }

    public int getMinuto() {
        return oC.get(Calendar.MINUTE);
    }

    public int getSegundo() {
        return oC.get(Calendar.SECOND);
    }

    public int getDia() {
        return oC.get(Calendar.DATE);
    }

    public int getMes() {
        return (oC.get(Calendar.MONTH) + 1);
    }

    public int getAño() {
        return oC.getWeekYear();
    }
}
