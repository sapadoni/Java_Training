import java.util.Scanner;
public class lengthstring {

    public static void main(String[] args) {
        String string;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter text: ");
        string = scan.next();

        System.out.println("The length of this is:" + string.length());

    }
}
