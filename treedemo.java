import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.*;

public class treedemo {
    public static void main(String[] args) {
        JFrame jf=new JFrame();
        DefaultMutableTreeNode d1=new DefaultMutableTreeNode("song");
        DefaultMutableTreeNode d2=new DefaultMutableTreeNode("old song");
        DefaultMutableTreeNode d3=new DefaultMutableTreeNode("new song");
         DefaultMutableTreeNode d4=new DefaultMutableTreeNode("Classical song");
        DefaultMutableTreeNode d5=new DefaultMutableTreeNode("jwan");
        DefaultMutableTreeNode d6=new DefaultMutableTreeNode("kgf");
        DefaultMutableTreeNode d7=new DefaultMutableTreeNode("ddlj");
        DefaultMutableTreeNode d8=new DefaultMutableTreeNode("gajani");
        d1.add(d2);
        d1.add(d3);
        d1.add(d4);
        d3.add(d5);
        d3.add(d6);
        d2.add(d7);
        d4.add(d8);
        JTree jt=new JTree(d1);
        jf.add(jt);
        jf.setVisible(true);
        
    }
    
}
