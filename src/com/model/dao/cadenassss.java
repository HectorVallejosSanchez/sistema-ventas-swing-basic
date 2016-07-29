/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model.dao;

import com.model.beans.Item1;
import java.util.ArrayList;
import java.util.List;

public class cadenassss {
    private List<String> lstItems = new ArrayList<>();

    public List<String> getLstItems() {
        return lstItems;
    }
    
    public void insertar(String oString){
        lstItems.add(oString);
    }
    
    
}
