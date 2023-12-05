import java.lang.Thread.State;
import java.util.Scanner;

public class findingelementinarray {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int [] a=new int[5];
        boolean qeu=false;
        for(int i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.print("[");
        for(int i=0;i<a.length;i++)
        {
           System.out.print(a[i]);
           System.out.print(",");
           
        }
        System.out.println("]");
        System.out.println("");
        System.out.println("enter no which want to find=");
        int q=sc.nextInt();
        for(int j=0;j<a.length;j++)
        {
            if(q==a[j])
            {
               qeu=true;
                break;
               
            }
           
        }
        if(qeu)
        {
            System.out.println("no is prsent");

        }
        else{
            System.out.println("not present");
        }


       

    }
}
