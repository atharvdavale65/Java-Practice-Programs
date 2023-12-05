import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
class Customer{
  int quantity;
  int price;
 void Customer(int quantity, int price){
    this.quantity=quantity;
    this.price=price;
  }
}
class RiceBag{
int quantity;
int price;
void Ricebag(int quant, int pr){
    this.quantity=quantity;
    this.price=price;
  }
} 
public class maxsold{
	public static void main(String[] args){
 	Scanner sc=new Scanner(System.in);
 	 int n=sc.nextInt();
  	 int m=sc.nextInt();
 	 List<Customer>customers=new ArrayList<>();
 	 for(int i =0; i<n;i++){
  	 int a=sc.nextInt();
 	 int b=sc.nextInt();
 	 customers.add(new Customer(a,b));
  }
  List<RiceBag>ricebags=new ArrayList<>();
  for(int i =0; i<n;i++){
  int p=sc.nextInt();
  int q=sc.nextInt();
  ricebags.add(new RiceBag(p,q));
  }
  int result= maximumBagsSold(n,m,customers,ricebags);
  System.out.println(result);
  sc.close();
 }
  
  
 private static int maximumBagsSold(int n,int m,List<Customer> customers,List<Ricebag>ricebags){
  int soldBags=0;
  for(Customer customer : customers){
  	int customerQuantity = cutomer.quant;
    int customerPrice = cutomer.pr;
    
    for(Ricebag bag : ricebags){
    	int bagQuantity = bag.quant;
    	int bagprice = bag.pr;
      	
      	if(bagQuantity >= cutomerQuantity && bagPrice <= customerPrice){
        	soldBags++;
          riceBags.remove(bag);
          break;
        }
    }
  }
    return soldBags;
  }
}
