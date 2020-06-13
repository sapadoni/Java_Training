import java.util.ArrayList;
public class LastElem {

    public static void main(String[] args)
    {

        ArrayList<Integer> list = new ArrayList<>(7);

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.print("Array List: " +list);


        int last = list.get(list.size() - 1);

        // print first and last element of ArrayList
        System.out.println("The last element of this array is: " + last);
    }
}


