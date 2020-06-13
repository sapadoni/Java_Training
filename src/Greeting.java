import java.util.Scanner;
public class Greeting {

    public static void main(String[] args)
    {
        String name;
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your name:");
        name = scan.next();
        System.out.println("Hello and welcome" + ", " + name + "!" );
    }
}
