
//PROGRAM TO REVERSE A GIVEN STRING
import java.lang.StringBuilder;
import java.lang.String;
public class Reverse_String {
    public static void main(String[] args)
    {
        StringBuilder a=new StringBuilder("Practice Makes Man Perfect");
        System.out.println("Normal String: "+ a);
        StringBuilder b=new StringBuilder();
        for(int i=a.length()-1;i>=0;i--)
        {
            b.append(a.charAt(i));
        }
        System.out.println("Reversed String: "+ b);

    }
}
