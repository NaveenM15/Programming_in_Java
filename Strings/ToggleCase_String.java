
// PROGRAM TO COVERT GIVEN STRING INTO TOGGLE CASE.
import java.util.Scanner;
 import java.lang.String;

public class ToggleCase_String
{
    public static void main(String[] args)
    {

        StringBuffer a=new StringBuffer("Apperance Are Deceptive");
        System.out.println("Given String : " +a);

        int n=a.length();
        for(int i=0;i<n;i++)
        {
            char c=a.charAt(i);
            if(c>=97 && c<=122)
            {
                int x=(int)c-32;
               a.setCharAt(i,(char)x);

            }

            else if(c>=65 && c<=90)
                {
                    int y=(int)c+32;
                   a.setCharAt(i,(char)y);
                }
        }
        System.out.println("The Toggle Case : "+a);

    }
}
