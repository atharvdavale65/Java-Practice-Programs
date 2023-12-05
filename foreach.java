import java.util.Scanner;

public class foreach {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int [] a=new int[5];
        int sum =0;
        for(int i:a)
        {   
            System.out.printf("enter mark of student %d=",i+1);
            a[i]=sc.nextInt();
            sum= sum+a[i];
            
        }
        int b=sum/5;
        System.out.println(b);
        



    }
}
