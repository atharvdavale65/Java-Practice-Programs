import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class tabledemo {
    public static void main(String[] args) {
        JFrame jf=new JFrame();
        JTabbedPane jtp=new JTabbedPane();
        JPanel jp1=new JPanel();
        JPanel jp2=new JPanel();
        JPanel jp3=new JPanel();
        JButton jb1=new JButton("b1"); 
        JButton jb2=new JButton("b2");
        JButton jb3=new JButton("b3");
        jp1.add(jb1);
        jp2.add(jb2);
        jp3.add(jb3);
        jtp.add("First panel-Tab", jp1);
         jtp.add("Second panel-Tab", jp2);
          jtp.add("Third panel-Tab", jp3);
          jf.add(jtp);
          jf.setVisible(true);
    }
}
