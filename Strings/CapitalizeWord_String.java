
 // CAPITALIZE EVERY FIRST WORD IN A STRING.

 import java.lang.String;
import java.lang.StringBuffer;
public class CapitalizeWord_String {
    public static void main(String[] args)
    {
        StringBuffer io=new StringBuffer("naveen hoW aRE you");
        System.out.println("Given String: "+ io);
        if(io.charAt(0)>=97 && io.charAt(0)<=122)
        {
            int c=io.charAt(0)-32;
            io.setCharAt(0,(char)c);
        }
        System.out.println(io);
        for(int i=1;i<io.length();i++)
        {

          if(io.charAt(i)==32)
          {
              i++;
              if (io.charAt(i) >= 97 && io.charAt(i) <= 122)
              {
                  int n = io.charAt(i) - 32;
                  io.setCharAt(i, (char) n);
              }
          }
            else
            {
                if(io.charAt(i)>=65 && io.charAt(i)<=90)
                {
                    int n=io.charAt(i)+32;
                    io.setCharAt(i,(char)n);
                }
            }
        }
        System.out.println("The Converted String : "+io);
    }
}
