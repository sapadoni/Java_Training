import java.util.Scanner;
import java.util.Arrays;

public class placeofelement {

    public static void main(String[] args)
    {
        int[] array = { 1, 2, 3, 4, 5, 6, 7 };
        int t;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number you would like to find the index position of:");
                t = scan.nextInt();
        System.out.println("Index position of this number is: " + findIndex(array, t));
    }


    public static int findIndex(int arr[], int t)
    {

        int index = Arrays.binarySearch(arr, t);
        return (index < 0) ? -1 : index;
    }
}
