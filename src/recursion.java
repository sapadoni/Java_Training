import java.util.Scanner;
import java.lang.*;
public class recursion {


    public static void main(String args[])
    {
        int n;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the value of n:");
        n = scan.nextInt();
        System.out.println(recurSum(n));
    }

    public static int recurSum(int n)
    {
        if (n <= 1)
            return n;
        return n + recurSum(n - 1);
    }



}

