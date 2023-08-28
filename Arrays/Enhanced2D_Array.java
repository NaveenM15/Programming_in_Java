
// JAGGED ARRAY USING ENHANCED FOR LOOP IN JAVA

public class Enhanced2D_Array {
    public static void main(String[] args)
    {
        int arr[][]={
                {1,2,3,4},
                {2,3,4},
                {4,5,6,7}
        };
         for(int k[]:arr)
        {
            for(int l:k)
            {
                System.out.print(" "+  l);
            }
            System.out.print("\n");
        }
    }

}
