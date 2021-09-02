package com.company;
import java.util.Scanner;
 class Pattern7I {

        public static void main(String[] args)
        {
            int i, j, min, n;
            System.out.print("Enter the value of n: ");
            Scanner sc= new Scanner(System.in);
            n=sc.nextInt();
            for (i = 1; i <= n; i++)
            {
                for (j = 1; j <= n; j++)
                {
                    min = i < j ? i : j;
                    System.out.print(n - min + 1+ " ");
                }
                for (j = n - 1; j >= 1; j--)
                {
                    min = i < j ? i : j;
                    System.out.print(n - min + 1+ " ");
                }
                System.out.println();
            }
            for (i = n - 1; i >= 1; i--)
            {
                for (j = 1; j <= n; j++)
                {
                    min = i < j ? i : j;
                    System.out.print(n - min + 1+ " ");
                }
                for (j = n - 1; j >= 1; j--)
                {
                    min = i < j ? i : j;
                    System.out.print(n - min + 1+ " ");
                }
                System.out.println();
            }
        }
    }

