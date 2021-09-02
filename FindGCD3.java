package com.company;

class FindGCD3 {
        public static void main(String[] args)
        {

        int n1 = 30, n2 = 70;
        while (n1 != n2) {
            if (n1 > n2)
                n1=n1-n2;
            else
                n2=n2-n1;
        }
        System.out.printf("GCD of n1 and n2 is:" + n2);
    }
    }

