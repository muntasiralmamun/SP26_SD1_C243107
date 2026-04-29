import java.util.Scanner;

public class Q2 {
    public static void main(String[] args)
    {
                Scanner input = new Scanner(System.in);
                System.out.println("Enter Seat number:");
            int s = input.nextInt();
            if(s>=1 && s <= 10)
                System.out.println("Lower Double");
            else if(s >= 11 && s <= 15)
                System.out.println("Lower Single");
            else if(s >= 16 && s <= 25)
                System.out.println("Upper Double");
            else if(s >= 26 && s <= 30)
                System.out.println("Upper Single");
            else
                System.out.println("Incorrect Seat number");
    }
}
