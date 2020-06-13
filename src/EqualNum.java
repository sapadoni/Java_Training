import java.util.Scanner;
public class EqualNum {

    public static void main(String[] args)

    {
        int x , y;
        Scanner scan = new Scanner(System.in);
        System.out.print("First number:");
        x = scan.nextInt();
        System.out.print("Enter the next number");
        y = scan.nextInt();

        if( x == y)
        {
            System.out.println(x + " " + "and" + " " + y + " "  + "are equal");
        }
        else
        {
            System.out.println(x + " " + "and" + " " + y + " "  + "aren't equal");
        }
    }
}
