import java.util.Scanner;

public class reversestring {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Input string=");
        String s=sc.nextLine();
        char [] abc=s.toCharArray();
        for(int i=abc.length-1;i>=0;i--)
        {
               System.out.print(abc[i]);
        }

    }
}
