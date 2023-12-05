import java.util.Scanner;

public class tax {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter salary=");
        int a=sc.nextInt();
        if(a>2.5&&a<5)
        {
            System.out.println("tax=5%");
        }
        else if(a>5&&a<10)
        {
            System.out.println("tax=20%");

        }
        else
        {
            System.out.println("tax=30%");
        }

    }
}
