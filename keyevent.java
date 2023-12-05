import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;



public class keyevent extends Frame implements KeyListener{
    Label l2; 
    public keyevent()
    {
        setVisible(true);
        setSize(450, 450);
        setLayout(new FlowLayout());
         l2=new Label();
        TextField l=new TextField(40);
        add(l);
        add(l2);
        l.addKeyListener(this);
            
    
    }
    public void keyPressed(KeyEvent ke )
    {
        l2.setText("Key pressed");
    }
    public void keyTyped(KeyEvent ke )
    {
        l2.setText("Key typed");
    }
    public void keyReleased(KeyEvent ke )
    {
        l2.setText("Key released");
    }
    public static void main(String[] args) {
        new keyevent();
    }
}

