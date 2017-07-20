/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.TraficDeterminingDeptRole;

/**
 *
 * @author DeepaliP
 */
import userinterface.TraficControlRoomRole.*;
import java.awt.*;
import java.util.*;
import javax.swing.*;
import javax.swing.table.*;

public class RowTable extends JTable
{
     Map<Integer, Color> rowColor = new HashMap<Integer, Color>();

     public RowTable(TableModel model)
     {
          super(model);
     }

     @Override
     public Component prepareRenderer(TableCellRenderer renderer, int row, int column)
     {
          Component c = super.prepareRenderer(renderer, row, column);

          if (!isRowSelected(row))
          {
               Color color = rowColor.get( row );
               c.setBackground(color == null ? getBackground() : color);
          }

          return c;
     }

     public void setRowColor(int row, Color color)
     {
          rowColor.put(row, color);
     }

     public static void main(String[] args)
     {
          DefaultTableModel model = new DefaultTableModel(10, 4);
          RowTable table = new RowTable( model );
          table.setPreferredScrollableViewportSize(table.getPreferredSize());

          table.setRowColor(1, Color.YELLOW);
          table.setRowColor(4, Color.RED);
          table.setRowColor(7, Color.ORANGE);

          JFrame frame = new JFrame();
          frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
          frame.add( new JScrollPane( table ) );
          frame.pack();
          frame.setLocationRelativeTo( null );
          frame.setVisible(true);
     }
}
