package com.ds.primenumbers;

import java.util.Arrays;

public class FindPrimeSumOfGivenNum {
    // Express the given even number as sum of 2 prime numbers
    // 4 <= A <= 2*107

    public static void main(String args[]) {
        int A = 25;
        System.out.println(Arrays.toString(primeSum(A)));
    }

    public static int[] primeSum(int A) {
        int arr[] = new int[A+1];
        for(int i=2;i*i<=A;i++) {
            if(arr[i] == 0) {
                for(int j=i*i;j<=A;j+=i) {
                    arr[j] = -1;
                }
            }
        }
        int ans[] = new int[2];
        for(int i=2;i<=A;i++) {
            if(arr[i] == 0) {
                int y = A - i;
                if(arr[y] == 0) {
                    ans[0] = i;
                    ans[1] = y;
                    break;
                }
            }
        }
        return ans;
    }
}
