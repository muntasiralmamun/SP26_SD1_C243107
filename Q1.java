import java.util.Scanner;

public class Q1 {
    public static void main(String[] args)
    {
                Scanner input = new Scanner(System.in);
            System.out.println("Enter the number of present member:");
            int n = input.nextInt();
            System.out.println("Enter the number of member who voted in favour:");

            int x = input.nextInt();
            if(x >= n/2.0)
                System.out.println("Decision in favour of Resolution");
            else
                System.out.println("Decision is against the Resolution");
                
    }
}
