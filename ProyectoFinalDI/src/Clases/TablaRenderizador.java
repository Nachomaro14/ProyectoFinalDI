package Clases;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

public class TablaRenderizador implements TableCellRenderer{
        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
            JLabel etiqueta = new JLabel();
            etiqueta.setOpaque(true);
            if (row % 2 == 0) {
                etiqueta.setBackground(new Color(255, 255, 200));
            } else {
                etiqueta.setBackground(Color.white);
            }
            if (column == 1) {
                etiqueta.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
            } else {
                etiqueta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                etiqueta.setText(value.toString());
            }
            if (isSelected) {
                etiqueta.setBackground(new Color(151, 193, 215));
            }
            return etiqueta;
        }
    }