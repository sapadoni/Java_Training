import java.util.Scanner;

public class factorial {

    public static void main(String[] args)
    {
        int num ;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        num = scan.nextInt();
        System.out.println("Factorial of " + num + " is " + factorial(num));
    }
    static int factorial(int n)
    {
        int fact = 1, i;
        for (i = 2; i <= n; i++)
            fact *= i;
        return fact;
    }
}

