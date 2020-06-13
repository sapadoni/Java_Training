import java.util.Scanner;
public class convertmin {

    public static void main(String[] args) {

        int min;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of minutes:");
        min = scan.nextInt();


        int second = (min) * 60;
        System.out.print("The time in seconds is: " + second);
    }

}
