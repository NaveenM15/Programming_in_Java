
// PROGRAM TO INSERT A ELEMENT IN GIVEN INDEX IN A ARRAY
import java.util.Arrays;
public class InsertElement_Array {
    public static void main(String[] args)
    {
        int[] a={1,2,4,5,6,7,8};
        System.out.print("\nBEFORE INSERT: "+Arrays.toString(a));
        int index=2;
        int value=3;
        for(int i=a.length-1;i>index;i--)
        {
            a[i]=a[i-1];

        }
        a[index]=value;
        System.out.print("\nAFTER INSERT: "+Arrays.toString(a));
    }
}
