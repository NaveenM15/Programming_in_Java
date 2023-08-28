
// PROGRAM BASED ON ARRAYS

import java.util.Scanner;
import java.util.*;

public class Arrays {
    public static void main(String[] args)
    {
        int[] c=new int[15];// Declaration and Allocation of Memory
        for(int i=0;i<5;i++)
        {
            Scanner io=new Scanner(System.in);
            System.out.print("\n Enter the number: ");
            c[i]=io.nextInt();
        }
        for(int element:c)
        {
            System.out.println(element);
        }

    }

}
