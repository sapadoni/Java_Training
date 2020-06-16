import java.util.Scanner;

public class arraylength {

    public static void main(String[] args) {

        int result;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your array:");
            int num = scan.nextInt();
            int array[] = new int[num];

            result =  num * array.length;

            System.out.println("The new array is " + result);
        }
    }







