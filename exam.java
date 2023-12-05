public class exam{
    public static void main(String[] args) {
        
    
    String s="geekgeekgeek";
    int count = 0;
    while (s.contains("geek")) {
        s = s.replace("geek", "");
        count++;
    }
    if(s.length()!=0)
    {
        System.out.println("-1");
    }
    else
    {
    System.out.println(count); 
    }
}
}
