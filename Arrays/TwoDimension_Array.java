
// PROGRAM TO TWO DIMENSION ARRAY IN JAVA

import java.util.Scanner;

public class TwoDimension_Array {
    public static void main(String[] args)
    {
        // 2D ARRAY
//        int arr[][]={
//                {1,2,3},
//                {4,5,6},
//                {7,8,9}
//                };
//        for(int i=0;i<arr.length;i++)
//        {
//            for(int j=0;j<arr.length;j++)
//            {
//                System.out.print(" " +arr[i][j]);
//            }
//            System.out.println(" ");
//        }
        Scanner input=new Scanner(System.in);
        System.out.println("Enter No.of Rows: ");
        int rows=input.nextInt();
        System.out.println("Enter No.of Cols: ");
        int cols=input.nextInt();
        int arr[][]=new int[rows][cols];
        int i,j;
        for( i=0;i<rows;i++) {
            for(  j=0;j<cols;j++) {
                System.out.println("Enter the Elements in arr: ");
                arr[i][j]=input.nextInt();
            }
        }
        System.out.println("Enter the Elements in arr= ");
        for( i=0;i<rows;i++) {
            for ( j = 0; j < cols; j++) {
                System.out.print( " "+ arr[i][j]);
            }
            System.out.print("\n");
        }



    }

}
