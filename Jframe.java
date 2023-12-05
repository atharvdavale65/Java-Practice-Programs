
import java.awt.*;

import javax.swing.*;

public class Jframe extends JFrame{
        public Jframe()
        {
        
            Label l1=new Label("User name");
        
            JTextField t1=new JTextField("");
            JLabel l2=new JLabel("Passsword");
            JTextField t2=new JTextField("");
            JButton b1 = new JButton("Login");
            JButton b2=new JButton("Reset");
            JPanel p=new JPanel();
         
            
            Label l4=new Label("Address");
            TextArea t3=new TextArea("");
            Label l3=new Label("Gender:");
         
            JRadioButton ch1 =new JRadioButton("male", false);
            JRadioButton ch2=new JRadioButton("female", false);
            
            
            
            add(l1);
            add(t1);
            add(l2);
            add(t2);
            add(l4);
            add(t3);
            add(l3);
            p.add(ch1);
            p.add(ch2);
            p.setBackground(Color.red);
            add(p);
            add(b1);
            add(b2);
            setSize(450, 450);
            setVisible(true);
            setBackground(Color.CYAN);
            setLayout(new GridLayout(8,8,8,8));
    
    
            
            
        }
        public static void main(String[] args) {
            new Jframe();
          
        }
    
        
    }
    

