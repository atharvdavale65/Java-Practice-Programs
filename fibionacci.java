public class fibionacci {
    static void fibo(){
        int a=0;
        int b=1;
        int sum = 0;
      
        for(int i=1;i<10;i++){
        sum =a+b;
        a=b;
        b=sum;
        
        System.out.print(sum+",");
        }
  
       
    } 
    public static void main(String[] args) {
      fibo();
    }
}
