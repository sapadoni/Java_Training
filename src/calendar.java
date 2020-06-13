import java.util.Scanner;

public class calendar {

    public static void main(String[] args) {

        String month;
        int num;


        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter a Month Name:");
        month = scan.next();


        if (month.equals("January")) {
            num = 1;
        } else if (month.equals("February")) {
            num = 2;
        } else if (month.equals("March")) {
            num = 3;
        } else if (month.equals("April")) {
            num = 4;
        } else if (month.equals("May")) {
            num = 5;
        } else if (month.equals("June")) {
            num = 6;
        } else if (month.equals("July")) {
            num = 7;
        } else if (month.equals("August")) {
            num = 8;
        } else if (month.equals("September")) {
            num = 9;
        } else if (month.equals("October")) {
            num = 10;
        } else if (month.equals("November")) {
            num = 11;
        } else if (month.equals("December")) {
            num = 12;
        }


     //   System.out.print(" The Number of the Month you choose is" + getMonthNum);
    }

}


