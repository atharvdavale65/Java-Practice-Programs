import java.util.Scanner;

public class profit
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter cost price=");
        int cp=sc.nextInt();
        System.out.println("enter selling price=");
        int sp=sc.nextInt();
        if(cp>sp)
        {
            int loss=cp-sp;
            System.out.println("loss="+loss);
        }
        else
        {
            int profitt=sp-cp;
            System.out.println("profit="+profitt);
        }    
        
        
    }
}