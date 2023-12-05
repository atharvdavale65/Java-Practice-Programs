import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=a%10;
        
        int c=a%100;
        int d=c/10;
        int q=a/100;

        int sum=(b*b*b)+ (d*d*d) + (q*q*q);
        if(sum==a)
        {
        System.out.println("print no is armstrong");
        }
        else
        {
            System.out.println("print no is not armstrong");
        }
    }
}
