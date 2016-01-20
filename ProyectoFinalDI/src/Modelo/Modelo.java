package Modelo;

import javax.swing.table.DefaultTableModel;

public class Modelo {
    
    public class ModeloTablaNoEditable extends DefaultTableModel {

        public boolean isCellEditable(int row, int column) {
            return false;
        }
    }
}