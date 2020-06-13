import java.util.Scanner;
public class converthour {

    public static void main(String[] args) {

        int hour;
        int min;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of number of hours:");
        hour = scan.nextInt();
        System.out.println("Enter the number of number of minutes:");
        min = scan.nextInt();


        int second = ((min) * 60) + ((hour) * 3600);
        System.out.print("The time in seconds is: " + second);
    }
}
