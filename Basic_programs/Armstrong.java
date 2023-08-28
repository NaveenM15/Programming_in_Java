
// PROGRAM TO FIND THE ARMSTRONG

import java.util.Scanner;

public class Armstrong {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter the Number to Armstrong: ");
            int n = input.nextInt();
            int rem, sum = 0, temp;
            temp = n;
            while (n > 0) {
                rem = n % 10;
                sum = sum  + rem*rem*rem*rem;
                n = n / 10;
            }
            if (sum == temp)
                System.out.printf("The Number %d is Armstrong:", temp);
            else
                System.out.printf("The Number %d is Not a Armstrong", temp);
        }
    }

