import java.util.Scanner;
public class perimeterofrectangle {

    public static void main(String[] args) {

        int l, w;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the length:");
        l = scan.nextInt();
        System.out.println("Enter the width: ");
        w = scan.nextInt();



        int perim = (2 * l) + (2 * w);
        System.out.print("The perimeter is: " + perim);
    }
}
