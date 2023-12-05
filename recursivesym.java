public class recursivesym {
    static int sum (int x)
    {   
        if(x==1)
        {
            return 1;
        }
        else
        return x+sum(x-1);
    }
    public static void main(String[] args) {
        System.out.print(sum(10));
    }
}
