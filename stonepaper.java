import java.util.Scanner;

public class stonepaper {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st palyer=");
        String a=sc.nextLine();
        System.out.println("Enter 2nd player=");
        String b=sc.nextLine();
        if(a.equals("stone")&& b.equals("scissor"))
        {
            System.out.println("winner is stone");
        }
        else if(a.equals("stone")&& b.equals("paper"))
        {
            System.out.println("winner is paper");
        }
        else if(a.equals("scissor")&& b.equals("paper"))
        {
            System.out.println("winner is scissor");
        }
        else if(a.equals("scissor")&& b.equals("stone"))
        {
            System.out.println("winner is stone");
        }


        else if(a.equals("paper")&& b.equals("scissor"))
        {
            System.out.println("winner scissor");
        }
        else if (a.equals("paper")&&b.equals("stone"))
        {
            System.out.println("winner is paper");
        }
        
        

    }
}
