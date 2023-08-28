
// PROGRAM TO FIND THE DUPLICATE ELEMENT IN AN ARRAY
//  A Numbers comes multiple times in an array.
import java.util.Arrays;
public class DuplicateElement_Array {
    public static void main(String[] args)
    {
        int[] a={1,2,3,4,5,4,5,1};
        System.out.print("\nGiven Array : "+Arrays.toString(a));
        for(int i=0;i<a.length;i++)
        {

             for(int j=i+1;j<a.length;j++)
             {
                 if(a[i]==a[j] && (i!=j))
                 {

                     System.out.println("\nDuplicate Element= "+a[j]);
                 }
             }
        }
    }


}
