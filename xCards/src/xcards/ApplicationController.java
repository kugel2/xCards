/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package xcards;

import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author florian
 */
public class ApplicationController {

    private Connection db_conn;

    public ApplicationController() {
        ListViewerControllerForCards abc;
        
        initDatabase();
        
        abc = new ListViewerControllerForCards();
        
        try {
            Statement stat = db_conn.createStatement();
            ResultSet rs = stat.executeQuery("select id, title, text from cards;");
            ArrayList<Cards> list = new ArrayList<Cards>();
            
            while (rs.next()) {
                list.add(new Cards(rs.getInt("id"), rs.getString("title"), rs.getString("text")));
            }
            abc.addToList(list);


        } catch (SQLException ex) {
            Logger.getLogger(ApplicationController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
        
        
    private void initDatabase() {
       try {
                    Class.forName("org.sqlite.JDBC");
                    db_conn = DriverManager.getConnection("jdbc:sqlite:db_folder/test.db");
                    
//                    Statement stat = db_conn.createStatement();
//                    stat.executeUpdate("create table IF NOT EXISTS cards (id INTEGER PRIMARY KEY AUTOINCREMENT,title TEXT, text TEXT);");
//                    PreparedStatement prep = db_conn.prepareStatement(
//                            "insert into cards (title, text) values (?, ?);");
//
//                    prep.setString(1, "Gandhi");
//                    prep.setString(2, "politics");
//                    prep.addBatch();
//                    prep.setString(1, "Turing");
//                    prep.setString(2, "computers");
//                    prep.addBatch();
//                    prep.setString(1, "Wittgenstein");
//                    prep.setString(2, "smartypants");
//                    prep.addBatch();
//
//                    db_conn.setAutoCommit(false);
//                    prep.executeBatch();
//                    db_conn.setAutoCommit(true);
//
//                    ResultSet rs = stat.executeQuery("select * from cards;");
//                    while (rs.next()) {
//                        System.out.println("name = " + rs.getString("title"));
//                        System.out.println("job = " + rs.getString("text"));
//                    }
//                    rs.close();
//                    db_conn.close();
                } catch (Exception e) {
                    System.out.print("Oops!");
                } 
    }
}
