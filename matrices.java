import java.util.Scanner;

public class matrices {
    public static void main(String[] args) {
        int sum =0;
        int [][] matrix_A= {{1,2,3},{3,4,5}};
        int [][] matrix_b={{5,6,7},{8,9,10}};
        int [][] matrix_c= {{0,0,0},{0,0,0}};
        for (int i=0;i<matrix_A.length;i++)
            for( int j=0;j<matrix_A[i].length;j++)
        {
            matrix_c[i][j]=matrix_A[i][j] + matrix_b[i][j];
       
        

        }
        for (int i=0;i<matrix_A.length;i++){
        for( int j=0;j<matrix_A[i].length;j++)
        {
           System.out.print(matrix_c[i][j]+"  ");

        }
        System.out.println();
    }
       
     
       
    }
}
