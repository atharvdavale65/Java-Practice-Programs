import java.util.Scanner;

public class table {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=10;i++)
        {
            int t=n*i;
            System.out.println(t);
        }
    }
}
