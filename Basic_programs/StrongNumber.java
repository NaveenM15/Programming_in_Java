
//PROGRAM TO FIND STRONG NUMBER
// Strong number are the number in which the [SUM of Individual FACTORIAL ] is equal to original number
//Example- 145=(1!+ 4! + 5!)=> 145= 1+24+120 => [145=145]

import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args)
    {

        Scanner input=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = input.nextInt();
        int rem,temp,i,sum=0;

        temp=n;
        while(n>0){
            rem=n%10;
            int fact=1;
            for(i=1;i<=rem;i++) {
                fact = fact * i;
            }
            sum=sum+fact;
            n=n/10;
        }
        if(sum == temp){
            System.out.printf("\n%d is Strong Number",temp);
        }
        else
            System.out.printf("\n%d is NOT Strong Number",temp);
    }

}
