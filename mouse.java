import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;




public class mouse extends Frame implements MouseListener{
    Label l2; 
    public mouse()
    {
        setVisible(true);
        setSize(450, 450);
        setLayout(new FlowLayout());
         l2=new Label();
        TextField l=new TextField(40);
        add(l);
        add(l2);
        l.addMouseListener(this);
        
            
    
    }
    public void mouseClicked(MouseEvent e) {  
        l2.setText("Mouse Clicked");  
    }  
    public void mouseEntered(MouseEvent e) {  
        l2.setText("Mouse Entered");  
    }  
    public void mouseExited(MouseEvent e) {  
        l2.setText("Mouse Exited");  
    }  
    public void mousePressed(MouseEvent e) {  
        l2.setText("Mouse Pressed");  
    }  
    public void mouseReleased(MouseEvent e) {  
        l2.setText("Mouse Released");  
    }  
    public static void main(String[] args) {
        new mouse();
    }
}