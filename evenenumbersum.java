import java.util.Scanner;

public class evenenumbersum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=0;
        int sum=0;
        while(i<=n)
        {
            sum=sum+2*i;// 0+2*0=0  0+2=2  2+4=6
            i++;
         

        }
        System.out.println(sum);
    }
}
