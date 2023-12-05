import java.util.Scanner;

public class fibonacciseries {
    public static void main(String[] args) {
       int a=0;
       int b=1;
       System.out.print(a+","+b);
        int c=0;
        for(int i=1;i<10;i++)
        {   
            
           c=a+b; //c=5
           a=b;     //a=3
           b=c;     //b=5

            System.out.print(","+c);
        }
        
    }
}
