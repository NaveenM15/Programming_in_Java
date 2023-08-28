
//PROGRAM TO FIND FACTORIAL OF NUMBER

import java.util.Scanner;

public class Factorial
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the Number to Find Factorial: ");
        int num=input.nextInt();
        int fact;
//        for(int i=1;i<=num;i++)
//        {
//            fact=fact*i;
//        }
         fact=factorial(num);
         System.out.printf("The Factorial of %d is = %d",num,fact);
    }
    public static int factorial(int num)
    {
        if(num==0)
            return 1;
        else
            return (num * factorial(num-1));
    }
}