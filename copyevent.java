
import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.*;

public class copyevent extends JFrame{
    public  copyevent(){
        Label l1=new Label("cd");
        TextField t1=new TextField(20);
        Button b1=new Button("Copy");

        Label l2=new Label("cd");
        TextField t2=new TextField(20);

        setVisible(true);
        setLayout(new GridLayout(6, 8));
        setSize(450, 450);
        add(l1);
        add(t1);
        add(b1);
        add(l2);
        add(t2);
       
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){  
                String a=t1.getText();
                t2.setText(a);  
            }
        }); 
    }
    public static void main(String[] args) {
        new copyevent();
    }
    
}

