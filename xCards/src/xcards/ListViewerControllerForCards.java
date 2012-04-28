/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package xcards;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author florian
 */
public class ListViewerControllerForCards extends ListViewerController {
    
    public void addToList(ArrayList<Cards> list) {
        for (Iterator<Cards> it = list.iterator(); it.hasNext();) {
            Cards card = it.next();
            this.addToList(card.getTitle());
            
        }
    }
    
}
