import java.util.Scanner;

public class DivBy5 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int x= scan.nextInt();

        if (x % 5 == 0) {
            System.out.println(x + " " + "is divisible by 5");
        } else {
            if (x % 5 != 0) {
                System.out.println(x + " " + "is not divisible by 5");
            }
        }
    }
}
