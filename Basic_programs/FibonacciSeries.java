// Fibonacci series 0,1,1,2,3,5,8,13,21,34,55,...
import java.util.Scanner;
public class FibonacciSeries {
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        int n1=0,n2=1;
        int n3;

        System.out.println("Enter the Range to find Fibonacci : ");
        int num=input.nextInt();
        System.out.print(" \n THE FIBONACCI SERIES OF " + num +  " is : " + n1 + " ," + n2 );
        for(int i=2;i<num;i++)
        {
            n3=n1+n2;
            n1=n2;
            n2=n3;
            System.out.print( " ,"+n3);
        }
    }

}
