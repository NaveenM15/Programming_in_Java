
//PROGRAM TO FIND PERFECT NUMBER
// Perfect numbers are the numbers , which factors are equal to the original number
// example- Factor of 6 = 1,2,3 => 6=1+2+3 => [6=6]


import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args){
        Scanner io=new Scanner(System.in);
        System.out.println("Enter the number; ");
        int n=io.nextInt();
        int sum=0;
        for(int i=1;i<n;i++)
        {
            if(n%i==0)
            {
                sum+=i;
            }
        }
        if(sum==n) {
            System.out.println("The Given Number is perfect Number:");
        }
        else {
            System.out.println("The Given Number is NOT perfect Number:");
        }
    }

}
