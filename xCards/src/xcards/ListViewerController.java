/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package xcards;

import java.sql.*;
import java.util.ArrayList;
/**
 *
 * @author florian
 */

public class ListViewerController {
    private ListViewer window;

    public ListViewerController() {
        System.out.print("init ListViewerController\n");

        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                window = new ListViewer();
                window.setVisible(true);
            }
        });
    }
    

}