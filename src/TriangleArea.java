import java.util.Scanner;

public class TriangleArea {

    public static void main (String [] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the width: ");
        int w = scan.nextInt();
        System.out.print("Enter the height: ");
        int h = scan.nextInt();

        int area = ((w*h)/2);

        System.out.println("The area of your triangle is:" + area);



    }
}
