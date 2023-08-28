

//PROGRAM TO FIND FACTORS OF NUMBER

import java.util.Scanner;
import java.lang.*;
public class Factors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Number to Find Factors: ");
        int num = input.nextInt();
        int i;
        for (i=1; i <= num; i++) {
            if (num % i == 0)
                System.out.println(i);
        }

    }
}
