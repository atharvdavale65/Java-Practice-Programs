import java.util.Scanner;

public class leap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter year=");

        int a= sc.nextInt();
        int c = a%4;
        if(c==0)
        {
            System.out.println("year is leap year");

        }
        else
        {
            System.out.println("not a leap year");
        }
    }
}
