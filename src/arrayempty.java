import java.util.ArrayList;
public class arrayempty {
    public static void main(String[] args)
    {

        ArrayList<Integer> arr = new ArrayList<Integer>(10);


        arr.add(1);
        boolean ans = arr.isEmpty();
        if (ans == true)
            System.out.println("The ArrayList is empty");
        else
            System.out.println("The ArrayList is not empty");



    }
}

