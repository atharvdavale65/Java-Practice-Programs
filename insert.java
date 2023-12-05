import java.util.Scanner;

public class insert {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array=");
        int size = sc.nextInt();
       
        int[] arra = new int[20];
        
        for (int i = 0; i < size; i++) {
            arra[i] = sc.nextInt();
        }
         System.out.println("Enter element tht u want to insert=");
        int insert=sc.nextInt();

        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (arra[j] > arra[j + 1]) {
                    int temp = arra[j];
                    arra[j] = arra[j + 1];
                    arra[j + 1] = temp;
                }
            }
    }
    arra[size]=insert;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - i ; j++) {
                if (arra[j] > arra[j + 1]) {
                    int temp = arra[j];
                    arra[j] = arra[j + 1];
                    arra[j + 1] = temp;
                }
            }
    }
    for(int i=0;i<(size+1);i++)
    {
        System.out.print(arra[i]);
    }
}
}
