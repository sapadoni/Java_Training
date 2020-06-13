import java.util.Scanner;
public class Pie {

    public static void main(String[] args) {

        int piece;
        int people;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of pie pieces:");
        piece = scan.nextInt();
        System.out.println("Enter the number of people:");
        people = scan.nextInt();

        if (piece > people || piece == people) {
            System.out.println("There is enough pie for everyone!");
        }
        else {
            if (piece < people)
            System.out.println("Sorry, there is not enough pie.");
        }


    }
}
