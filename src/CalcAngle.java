import java.util.Scanner;
public class CalcAngle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double x, y;
        double angle;


        System.out.print("Enter the first angle for this triangle in degrees: ");
        x = scan.nextDouble();


        System.out.print("Enter the second value for this triangle in degrees: ");
        y = scan.nextDouble();

        angle = 180-(x+y);

        System.out.println("The size of the final angle in degrees is: " + angle);

    }
}
