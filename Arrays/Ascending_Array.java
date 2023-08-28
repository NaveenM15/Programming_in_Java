
// PROGRAM TO FIND ASCENDING ORDER IN ARRAY
import java.util.Arrays;
public class Ascending_Array {
    public static void main (String[] args){
        int[] a={2,5,7,9,3,4,1};
        System.out.print("Before Sort : "+Arrays.toString(a));
        int temp;
        for(int i=0;i<a.length;i++)
        {
             for(int j=i+1;j<a.length;j++)
             {
                 if(a[i]>a[j])
                 {
                     temp = a[i];
                     a[i] = a[j];
                     a[j]=temp;
                 }
             }
        }
        System.out.print("\n After Sort :"+Arrays.toString(a));
    }
}
