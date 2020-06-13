import java.util.Scanner;
public class Name {
    public static void main(String[] args) {

        String firstname;
        String lastname;
        String name;

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the first name:");
        firstname = scan.next();
        System.out.print("Enter the last name:");
        lastname = scan.next();

        name = firstname + lastname;

        System.out.print("Hello" + " " + name);


    }
}
