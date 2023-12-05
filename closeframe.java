import java.awt.*;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;



public class closeframe extends Frame  {
    public closeframe()
    {
          setVisible(true);
            setSize(450, 450);
        setLayout(new FlowLayout());
        
        addWindowListener(new WindowAdapter() 
            
        {
            public void windowClosing(WindowEvent e)
            {
                System.exit(0);
            }
        });
    }    
      

    public static void main(String[] args) {
        
        new closeframe();

    
       
    }
}