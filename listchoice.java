import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.List;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class listchoice extends Frame {
    public listchoice()
    {
        setVisible(true);
        setSize(450, 450);
        setLayout(new FlowLayout());
        List l=new List(5);
        Label l1=new Label();
        l.add("Sveri");
        l.add("WIT");
        l.add("Orchid");
        l.add("Sihngad");
        l.add("Symboisi");
     
        add(l);
           add(l1);
        l.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent ie)
            {
             String str= l.getItem(l.getSelectedIndex());
              l1.setText("Selected College is="+str);
            }
        });
        
    }

    public static void main(String[] args) {
        new listchoice();
    }
}
