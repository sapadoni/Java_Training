import java.util.Scanner;
public class stringtoint {

    public static void main(String[] args){

        String s;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the string you wish to convert:");
        s = scan.next();
        Integer i = Integer.valueOf(s);

        System.out.println("The value of the string in integer form is:" + " "+i);
    }
}


