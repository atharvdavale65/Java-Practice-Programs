import java.util.Scanner;

public class selectionsort{
  public static void perfromselection(int[] A, int[] B,int n){
    int length= A.length;
    
    for(int i= 0; i<n; i++){
      int minIndex=i;
      for(int j=i+1;j<length;j++){
        if(A[j]< A[minIndex]){
          minIndex=j;
        }
      }
      int temp = A[i];
      A[i] = A[minIndex];
      A[minIndex]=temp;
      temp=B[i];
      B[i]= B[minIndex];
      B[minIndex] = temp;
    }
  }
  public static void main (String[] args){
    Scanner sc = new Scanner(System.in);
   	String inputString =sc.nextLine();
    String inputString1 =sc.nextLine();
    int n=sc.nextInt();
    
    String[] tokens = inputString.split("\\s+");
    int[] A=new int[tokens.length];
    for(int i=0;i< tokens.length;i++){
      A[i]= Integer.parseInt(tokens[i]);
    }
     String[] tokens1 = inputString1.split("\\s+");
    int[] B=new int[tokens1.length];
    for(int i=0;i< tokens.length;i++){
      B[i]= Integer.parseInt(tokens1[i]);
    }
    
    
    
    perfromselection(A,B,n);
    for(int num : B){
      System.out.print(num + " ");
    }
  }
}