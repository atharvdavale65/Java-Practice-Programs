public class patternstar {
    static void pattern(){
        for(int i=0;i<=5;i++)
        {
            for(int j =0;j<=(5-i);j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        pattern();
    }
}
