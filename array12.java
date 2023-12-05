import java.util.Scanner;

public class array12{

     public class inarray{
    int a[] = new int[5];
    Scanner sc = new Scanner(System.in);

    for(int i =0;i<=a.length;i++){
        a[i] =sc.nextInt();
    }
}

    public static void main(String args[])
    {
        inarray n = new inarray();
        int a[] =new int[5];
        for(int i =0; i<=a.length;i++)
        System.out.println("array is "+n.a[i]);
    }
}


    

}