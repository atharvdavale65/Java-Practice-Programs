public class se{
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
    perfromselection(A,B,n);
    for(int num : B){
      System.out.print(num + " ");
    }
  }
}