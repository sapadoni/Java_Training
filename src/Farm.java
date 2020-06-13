import java.util.Scanner;

public class Farm {

    public static void main(String[] args) {

        int x, y, z;


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of cows:");
        x = scan.nextInt();
        System.out.println("Enter the number of chickens: ");
        y = scan.nextInt();
        System.out.println("Enter the number of pigs: ");
        z= scan.nextInt();

        int cow = x*2;
        int chicken = y*2;
        int pig = z*4;
        int total = cow+ chicken+ pig;

        System.out.print("Total number of legs on all farm animals is: " + total );
    }
}
