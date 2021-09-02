package com.company;

public class PatternH8 {
    public static void main(String[] args) {
        int i, j, n =5;

        for(i=1;i<=n;i++){
            for(j=i;j<=n;j++){
                System.out.print("*");
            }
            for(j=1;j<=(2*i-2);j++){
                System.out.print(" ");
            }
            for(j=i;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(i=1;i<=n-1;i++){
            for(j=0;j<=i;j++){
                System.out.print("*");
            }
            for(j=(2*i-2);j<(2*n-4);j++){
                System.out.print(" ");
            }
            for(j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

