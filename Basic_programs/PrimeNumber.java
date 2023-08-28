
// PROGRAM TO FIND PRIME NUMBERS
import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number to find Prime: ");
        int n=input.nextInt();
         int flag=0;
        if(n==0 || n==1)
        {
             System.out.printf("The Number [%d] is Not a Prime.",n);
        }
        else {
            for(int i=2;i<=n;i++)
            {
                if(n%i==0) {
                    flag = 1;
                    break;
                }
            }

        }
        if(flag == 0)
        {
            System.out.printf("The Number [%d] is  Prime.",n);
        }
        else
            System.out.printf("The Number [%d] is Not a Prime.",n);

    }
}
