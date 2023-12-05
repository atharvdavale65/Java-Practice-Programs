import java.awt.Button;
import java.awt.Color;

import java.awt.GridBagLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class changecolour extends JFrame{
    public changecolour(){
        setVisible(true);
        setSize(450, 450);
        setLayout(new GridBagLayout());
        Button b1=new Button("Red");
        Button b2=new Button("Green");
        Button b3=new Button("Blue");
        Panel p=new Panel();
        add(b1);
        add(b2);
        add(b3);
        
        b1.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
               getContentPane().setBackground(Color.RED);
            }
        });
        b2.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
               getContentPane().setBackground(Color.GREEN);
            }
        });
        b3.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
               getContentPane().setBackground(Color.BLUE);
            }
        });

    }    
    public static void main(String[] args) {
        new changecolour();
    }
}
