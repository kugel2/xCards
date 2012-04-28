/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package xcards;

import java.sql.*;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
/**
 *
 * @author florian
 */

public class ListViewerController {
    private ListViewer window;
    private DefaultListModel model;

    public ListViewerController() {
        System.out.print("init ListViewerController\n");
        
        model = new DefaultListModel();

        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                window = new ListViewer();
                window.setVisible(true);
                
                window.setListModel(model);
            }
        });
    }
    
    public void addToList(String text) {
        model.add(0, text);
    }
    

}