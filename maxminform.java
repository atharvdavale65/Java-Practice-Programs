import java.util.Scanner;

public class maxminform {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array=");
        int size = sc.nextInt();
        int[] arra = new int[size];
        
        for (int i = 0; i < size; i++) {
            arra[i] = sc.nextInt();
        }

        // Bubble Sort
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (arra[j] > arra[j + 1]) {
                    // swap arra[j] and arra[j+1]
                    int temp = arra[j];
                    arra[j] = arra[j + 1];
                    arra[j + 1] = temp;
                }
            }
        }
        for(int i=0;i<size;i++)
        {
           
                arra[i]=arra[size-1];
                size--;
               
         i++;    
        }
       
        
        
        for(int i=0;i<size;i++)
        {
            System.out.print(arra[i]);
        }
    }
}
