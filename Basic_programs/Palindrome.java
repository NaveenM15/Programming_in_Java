

// PROGRAM TO FIND THE PALINDROME
import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the Number to check Palindrome: ");
        int n=input.nextInt();
        int rem,sum=0,temp;
        temp=n;
        while(n>0)
        {
            rem=n%10;
            sum=(sum*10)+rem;
            n=n/10;
        }
        if(sum==temp)
            System.out.printf("The Number %d is Palindrome:",temp);
        else
            System.out.printf("The Number %d is Not a Palindrome",temp);
    }
}
