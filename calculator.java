import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.*;

public class calculator extends JFrame{
    public  calculator(){
        Label l1=new Label("NUmber 1");
        TextField t1=new TextField(20);
        Button b1=new Button("ADD");
          Button b2=new Button("Subtract");
            Button b3=new Button("Multiply");


        Label l2=new Label("Number 2");
        TextField t2=new TextField(20);
        TextField t3=new TextField(40);
        
        add(l1);
        add(t1);
        
        add(l2);
        add(t2);
        add(t3);

        
        add(b1);
        add(b2);
        add(b3);

       
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){  
                String str=t1.getText();
                String str1=t2.getText();
                int a=Integer.parseInt(str);
                int b=Integer.parseInt(str1);
                int add=a+b;
                t3.setText(Integer.toString(add));
                
                  
            }
        }); 
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                 String str=t1.getText();
                String str1=t2.getText();
                int a=Integer.parseInt(str);
                int b=Integer.parseInt(str1);
                int add=a-b;
                t3.setText(Integer.toString(add));
            }
        });
        b3.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                String str=t1.getText();
                String str1=t2.getText();
                int a=Integer.parseInt(str);
                int b=Integer.parseInt(str1);
                int add=a*b;
                t3.setText(Integer.toString(add));
            }
        });
        setVisible(true);
        setLayout(new FlowLayout(50, 60, 20));
        setSize(450, 450);
        b1.setBackground(Color.RED);
        b2.setBackground(Color.RED);
        b3.setBackground(Color.RED);
    }
    public static void main(String[] args) {
        new calculator();
    }
    
}