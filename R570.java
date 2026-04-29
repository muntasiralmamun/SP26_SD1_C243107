import java.util.*;
public class R570 {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of children :");
        int n = sc.nextInt();
        System.out.println("Enter candy you have :");
        int x = sc.nextInt();
        int a = n-x;
        int b;
        if(a<=0)
        {
            System.out.println("No need to buy");
        }
        else if(a%4 == 0)
        {
            System.out.println("Need to buy :"+ a/4 );
        }
        else(a%4 != 0)
        {
            b= a/4 +1;
                System.out.println("Need to buy : "+ b);


        }

    }
}
