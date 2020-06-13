import java.util.Scanner;
public class trianglemax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double x, y;
        double hypot;


        System.out.print("Enter a value for Side 1: ");
        x = scan.nextDouble();


        System.out.print("Enter a value for Side 2: ");
        y = scan.nextDouble();

        hypot= Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));

        System.out.println("The length of the hypotenuse is: " + hypot);

    }
}

