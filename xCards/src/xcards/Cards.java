/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package xcards;

/**
 *
 * @author florian
 */
public class Cards {
    
    private int id;
    private String title;
    private String text;
    
    public Cards(int id, String title, String text) {
        this.id = id;
        this.title = title;
        this.text = text;
    }
    
    public String getTitle() {
        return this.title;
    }

    public int getId() {
        return this.id;
    }

    public String getText() {
        return this.text;
    }
    
    
}
