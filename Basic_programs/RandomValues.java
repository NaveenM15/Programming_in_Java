
// TYPES OF RANDOM METHODS AND CLASS
import java.lang.Math;
import java.util.Scanner;
public class RandomValues {
    public static void main(String []args)
    {
//       // Random values in between 0 - 1.
//        System.out.println("\n1st Random Number"+ Math.random());
//        System.out.println("2st Random Number"+ Math.random());
//        System.out.println("3st Random Number"+ Math.random());
//        System.out.println("4st Random Number"+ Math.random());
//        System.out.println("5st Random Number"+

//        Scanner input=new Scanner(System.in);
//        System.out.println("MAXIMUN VALUE: ");
//        int max=input.nextInt();
//        System.out.println("MINIMUN VALUE: ");
//        int min=input.nextInt();
        int max=400;
        int min=200;
        double result1= (Math.random()*(max-min+1)+2);
        System.out.println("RESULT-1: "+ result1);
        int result2= (int)(Math.random()*(max-min+1)+2);
        System.out.println("RESULT-2: "+ result2);

    }
}
