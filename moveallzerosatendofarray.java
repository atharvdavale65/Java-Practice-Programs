import java.util.Scanner;

public class moveallzerosatendofarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array=");
        int size = sc.nextInt();
        int[] arra = new int[size];
        
        for (int i = 0; i < size; i++) {
            arra[i] = sc.nextInt();
        }
        int nonZeroIndex = 0;

        
        for (int i = 0; i < size; i++) {
            if (arra[i] != 0) {
                int temp = arra[i];
                arra[i] = arra[nonZeroIndex];
                arra[nonZeroIndex] = temp;
                nonZeroIndex++;
            }
        }

        System.out.println("Sorted array:");
        for (int i = 0; i < size; i++) {
            System.out.println(arra[i]);
        }
    
    }
}
