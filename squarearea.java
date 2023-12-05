class area{
    int a;
    int area;
    public void areaa(){
        area=a*a;
        System.out.println(area);
    }
    
}





public class squarearea {
    public static void main(String[] args) {
        area obj=new area();
        obj.a=5;
        obj.areaa();
    }
}
