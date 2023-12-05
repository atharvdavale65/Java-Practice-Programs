import java.util.Scanner;

public class checkpassorfail {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter mark of sub 1=");
        int a=sc.nextInt();
        System.out.println("Enter mark of sub 2=");
        int b=sc.nextInt();
        System.out.println("Enter mark of sub 3=");
        int c=sc.nextInt();
        int total=a+b+c;
        if((total>=120)&&(a>=33)&&(b>=33)&&(c>=33))
        {
            System.out.println("pass");
        }
        else
        {
            System.out.println("fail");
        }
    }
}
