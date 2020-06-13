import java.util.Scanner;
public class returnrem {


    public static void main (String args[]) {

        int x;
        int y;
        int rem;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first number");
        x = scan.nextInt();
        System.out.println("Enter the second number");
        y = scan.nextInt();

        rem = (x % y);


        System.out.println("The remainder of these two numbers is " + rem);
    }

}

