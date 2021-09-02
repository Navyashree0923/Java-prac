package com.company;
 class PatternC {
    public static void main(String[] args) {
        int i = 1, n = 5, count = 0, count1 = 0, k = 0;

        while(i <= n){
            int j = 1;
            while(j <= n-i){
                System.out.print("  ");
                count++;
                j++;
            }
            while(k != 2*i-1){
                if(count <= n-1) {
                    System.out.print(1+k+" ");
                    count++;
                }
                else{
                    count1++;
                    System.out.print(1+k-2*count1+" ");
                }
                k++;
            }
            count1 = count = k = 0;
            i++;
            System.out.println();
        }
    }
}

