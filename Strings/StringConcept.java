
// String in Java
 import java.lang.String;
public class StringConcept {
    public static void main(String args[])
    {
        String n1="Hello Ram     ";
        String n2="Hello Ram";
        System.out.println("String n1= "+ n1 );
        System.out.println("String n2= "+ n2 );
        System.out.println("String n1= "+ n1.hashCode());// address of given string
        System.out.println("String n2= "+ n2.hashCode());
        // check the equality
        // IT IS CASE SENSITIVE
        System.out.println("Equal Condition of Case : "+n1.equals(n2));

        // IN ORDER TO AVOID CASE SENSITIVE
        //equalsIgnoreCase
        System.out.println("Equal Condition of IgnoreCase: "+n1.equalsIgnoreCase(n2));

        System.out.println("Index            : "+n1.charAt(0));
        System.out.println("Upper            : "+n1.toUpperCase());
        System.out.println("Upper            : "+n1.toLowerCase());

        // replace(find value,replace value)
        System.out.println("Replace value     : "+n1.replace("Hello","Good Morning"));
        // cointains value
        System.out.println("Containing Element: "+n1. contains("Ram"));
        System.out.println("IsEmpty           : "+n1.isEmpty());
        //Letter Endwith/ Startwith
        System.out.println("Start with        : "+n1.startsWith("H"));
        System.out.println("Ends with         : "+n1.endsWith("m"));
        // Substring is used to divide the Given String
        //n1.substring(5);(last 5) || n1.substring(2,5);(2,4);
        System.out.println(" Substring        : "+n1.substring(0,7));

        // String is a group of Characters , inorder to print the characters
        //   in the string value use  [a.toCharArray]
        char a[]=n1.toCharArray();
        for(char c:a)
        {
            System.out.print(c+" ");
        }
        System.out.println("\nBefore Trim    : "+n1.length());
        System.out.println("  Trim         : "+n1.trim());
        // Chaining method
        System.out.println("  After Trim   : "+n1.trim().length());

    }
}
