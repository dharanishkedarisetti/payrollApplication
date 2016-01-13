/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.JComboBox;

/**
 *
 * @author dhara
 */
public class TextAreaUpdaterTask<T extends JComponent> implements Runnable{

    @Override
    public void run() {
        if (guiComponent instanceof JButton) {
            b = (JButton) guiComponent;
            b.setText(message); // update button text
        }

        if (guiComponent instanceof JComboBox) {
            c = (JComboBox) guiComponent ;
            c.removeAllItems();
            for (Object item : list) {                
                c.addItem(item);
            }
        }
    }
    public TextAreaUpdaterTask(T guiComponent) {
        this.guiComponent = guiComponent;
    }
    JButton b;
    JComboBox c;
    JLabel l;
    JTextArea t;
    JTextField f;
    String message;     // message to update gui component
    ArrayList list;        // list of messages to update gui component
    T guiComponent;     // gui components to update with message

    
    public void setMessage(ArrayList aList) {
        this.list = aList;
        
    }

}
