
import java.util.Scanner;



class largestthreeelemtsinarray
{
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

        System.out.println("Lagets Three elements are:");
        for (int i =size-1; i >=2; i--) {
            System.out.println(arra[i]);
        }
    }
}
