import java.util.Scanner;
public class comparestring {

    public static void main(String[] args) {

        String one;
        String two;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first word:");
        one = scan.next();
        System.out.println("Enter your second word:");
        two = scan.next();

        if(one.length() == two.length()) {
            System.out.println("These two strings are the same length.");

        } else {
            if (one.length() != two.length()) {
                System.out.println("These two strings are not the same length.");
            }
        }

    }
}
