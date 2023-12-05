import java.awt.*;


public class frame extends Frame {
   public frame(){
    Button b1=new Button("save");
    Button b2=new Button("update");
    Button b3=new Button("delete");
    Label l1=new Label("user name");

     Label l2=new Label("Password");
     Label l3=new Label("adrees");
     Checkbox ch1=new Checkbox("age",false);
     TextField t1=new TextField();
     TextField t2=new TextField();
     List l11=new List();
     l11.add("Sveri");
     l11.add("Bmit");
     l11.add("wit");


     TextArea a1=new TextArea();

        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(l3);
        add(a1);
        
        add(b1);
        add(b2);
        add(b3);
        add(l11);
        add(ch1);

       setVisible(true);
       setSize(1000, 800);
       setTitle("Registration form");
       setLayout(new FlowLayout());
       setBackground(Color.CYAN);
       
   }
public static void main(String[] args) {
        frame f =new frame();
}
}
