public class StringEmpty {

    public static void main(String args[]) {


        String str1 = null;
        String str2 = "stringisempty";

        if (str1 == null) {
            System.out.println("String1 is empty");
        } else {


            if (str2 == null) {
                System.out.println("String2 is empty");
            } else {


                if (str1 == null && str2 == null) {
                    System.out.println("Both strings are empty");
                }
            }
        }
    }
}


