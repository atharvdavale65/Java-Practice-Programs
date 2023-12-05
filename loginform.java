import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;

public class loginform extends Frame{
    public loginform()
    {
    
        Label l1=new Label("User name");
    
        TextField t1=new TextField("");
        Label l2=new Label("Passsword");
        TextField t2=new TextField("");
        Button b1 = new Button("Login");
        Button b2=new Button("Reset");
        Panel p=new Panel();
        
        

        CheckboxGroup chg=new CheckboxGroup();
        Label l4=new Label("Address");
        TextArea t3=new TextArea("");
        Label l3=new Label("Gender:");
        Checkbox ch1=new Checkbox("Male", chg, false);
        Checkbox ch2=new Checkbox("Female", chg, false);
        
        
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
        setLayout(new GridLayout(8,8));


        
        
    }
    public static void main(String[] args) {
        loginform l=new loginform();
      
    }

    
}


