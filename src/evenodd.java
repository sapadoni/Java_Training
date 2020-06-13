import java.util.Scanner;
public class evenodd {

    public static void main(String[] args) {
        int number;
        System.out.println("Enter an Integer number:");
        Scanner scan = new Scanner(System.in);
        number = scan.nextInt();


        if (number % 2 == 0)
            System.out.println("This is an even number");
         else
             System.out.println("This is an odd number");

        }
    }



