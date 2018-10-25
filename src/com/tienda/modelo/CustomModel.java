/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tienda.modelo;

import com.tienda.utils.ModeloUsuario;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import lombok.Getter;

/**
 *
 * @author shironeko
 */
public class CustomModel extends AbstractTableModel {
    
    
    private final String[] columnNames = ModeloUsuario.Titulos;
    @Getter
    private List<Cliente>  data;
    
    public CustomModel(List<Cliente> clientes){
        this.data = clientes;
    }

    public int getColumnCount() {
        return columnNames.length;
    }

    public int getRowCount() {
        return data.size();
    }

    public String getColumnName(int col) {
        return columnNames[col];
    }

    public Object getValueAt(int row, int col) {
        Cliente c = data.get(row);
        
        switch(col){
            
            case 0: return c.getId();
            case 1: return c.getNombre();
            case 2: return c.getApellidoPaterno() + " " + c.getApellidoMaterno();
            case 3: return c.getPassword();
            case 4: return c.getPerfil();
            case 5: return c.getFoto();
            case 6: return c.getStatus();
            
            default: return "aString";
        }
        
    }

    public Class getColumnClass(int c) {
        return getValueAt(0, c).getClass();
    }

    /*
     * Don't need to implement this method unless your table's
     * editable.
     */
    public boolean isCellEditable(int row, int col) {
        return false;
    }

    /*
     * Don't need to implement this method unless your table's
     * data can change.
     */

    
}