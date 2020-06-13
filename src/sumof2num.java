import java.util.Scanner;
public class sumof2num {

    public static void main(String[] args) {

        int x, y;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first number:");
        x = scan.nextInt();
        System.out.println("Enter the second number: ");
        y = scan.nextInt();


        int sum = x + y;
        System.out.print("The sum is: " + sum);
    }
}