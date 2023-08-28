
// Program to convert given String into Uppercase
import java.lang.String;
import java.util.*;

public class UpperCase_String {
    public static void main(String[] args)
    {
        StringBuilder io=new StringBuilder("money makes many things");
//        String str=io.toUpperCase();
        String str = io .toString() .toUpperCase();
        System.out.println(str);
        for(int i=0;i<io.length();i++)
        {
            if(io.charAt(i)>=97 && io.charAt(i)<=122)
            {
                int c=(int)io.charAt(i)-32;
                io.setCharAt(i,(char)c);
            }
        }
        System.out.println(io);
    }
}
