import java.util.Scanner;

public class arrayleftrotation {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array=");
        int size = sc.nextInt();
        System.out.println("Enter D=");
        int d=sc.nextInt();
        int[] arra = new int[size];
        
        for (int i = 0; i < size; i++) {
            arra[i] = sc.nextInt();
        }
        for(int i=0;i<size;i++)
        {   
            if(d<size-1){
            arra[i]=arra[d];
            }
            else{
                d=0;
                
                arra[i]=arra[d];
                d++;

            }
            d++;
        }
        
        for(int i=0;i<size;i++)
        {
            System.out.print(arra[i]);
        }
    }
}
