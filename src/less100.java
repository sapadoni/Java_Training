import java.util.Scanner;
import java.util.*;
public class less100 {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Input a number: ");
        int x = scan.nextInt();


        if (x < 100) {
            System.out.println(x + " " + "is less than 100");
        }
        else {
            if (x > 100) {
                System.out.println(x + " " + "is greater than 100");
            }
        }

        }
}
