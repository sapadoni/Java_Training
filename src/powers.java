import java.util.Scanner;

public class powers {


    public static void main(String[] args) {

        int x, y;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number:");
        x = scan.nextInt();
        System.out.println("Enter the power: ");
        y = scan.nextInt();



        System.out.print("The result is: " + Math.pow(x, y));
    }
}
