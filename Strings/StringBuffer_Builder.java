
// String Builder and String Buffer both are Mutable
// String Builder- Thread Safe
// String Buffer - Non- Thread safe.

import java.lang.String;
import java.util.*;
public class StringBuffer_Builder {
    public static void main(String[] args)
    {
        // String Buffer = String Builder
        StringBuffer buffer=new StringBuffer("Hello");
        System.out.println("Normal String: "+buffer);
        System.out.println("Append String: "+buffer.append("Naveen"));
        System.out.println("After Appending String: "+buffer);
        // inserting element in particular indes
        // a.insert(index,element);
        System.out.println("Inserting String: "+buffer.insert(5,"Candy boy"));
        System.out.println("Replaced String: "+buffer.replace(5, 9,"Chocolate"));
        System.out.println("Delete String: "+buffer.delete(5,15));
//        System.out.println("Reversed String: "+buffer.reverse());
        System.out.println("index String: "+buffer.charAt(7));
        System.out.println("Length String: "+buffer.length());
        System.out.println("Substring: "+buffer.substring(0,9));
        System.out.println("Normal String: "+buffer);
        // to replace the Index value
        // using- setCharAt(index,char to replace)
//        System.out.println("Replaced Index String: "+buffer.setCharAt(0,'B'));
        buffer.setCharAt(0,'L');
        System.out.println("Replaced Index String: "+buffer );

       // The Capacity of StringBuffer is default [16]
        // Then ADD default size + Sting length
        StringBuffer io=new StringBuffer("Hello guys ");
        System.out.println(io.capacity());
        System.out.println("Reverse :"+buffer.reverse());


    }


}
