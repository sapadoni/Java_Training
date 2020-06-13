import java.util.Scanner;
public class lessthan {

    public static void main(String[] args) {

        double x;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your number for comparison");
        x = scan.nextDouble();

        if ((x )< 0 || (x) == 0) {

            System.out.println("This number is less than or equal to zero");

        } else {
            if ((x) > 0) {
                System.out.println("This number is greater than zero");
            }
        }

    }
}

