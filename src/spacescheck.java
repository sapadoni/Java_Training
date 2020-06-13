public class spacescheck {

    static int i,j=0,check;


    static int spacecount(String s)
    {
        for(i=0,j=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch==' ')
                j++;
        }
        return j;
    }

    public static void main (String args[])
    {
        check=spacescheck.spacecount("programming in java");

        System.out.println("This string contains :  "+check + " " + "white spaces");
    }
}

