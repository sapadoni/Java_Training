import java.util.Scanner;

public class Mult100 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scan.nextInt();

        if (100 % num == 0) {
            System.out.println( num + " " + "is a multiple of 100");
        }
        else{
            if (100 % num != 0 ) {
                System.out.println(num + " " + "is not a multiple of 100");
            }
        }

    }
}

