import java.util.Scanner;

public class Even_Odd_Array {
public static void main(String[] args)
    {
       Scanner input=new Scanner(System.in);
       System.out.print("Enter the Limit: ");
       int n=input.nextInt();
       int arr[]=new int[n];
       int even=0,odd=0;
       for(int i=0;i<n;i++)
       {
           System.out.println("Enter the Elements in array: ");
           arr[i]=input.nextInt();
       }
//       for(int i=0;i<n;i++)
//       {
//           if(arr[i]%2==0)
//           {
//               even++;
//           }
//           else{
//               odd++;
//           }

        for(int element : arr)
        {
            if(element%2==0)
            {
                even++;
            }
            else{
                odd++;
            }

       }
       System.out.println("EVEN= "+even);
        System.out.println("ODD= "+odd);


    }
}
