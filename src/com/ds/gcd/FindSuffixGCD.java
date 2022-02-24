package com.ds.gcd;

import java.util.Arrays;

public class FindSuffixGCD {

    public static void main(String args[]) {
        int A[] = {2,3,6,8};
        int suffArr[] = new int[A.length-1];
        for(int i=A.length-2;i>=0;i--) {
            int s;
            if(i == A.length-2) {
                s = gcd(A[i],A[i+1]);
            }else {
                s = gcd(A[i],suffArr[i+1]);
            }
            suffArr[i] = s;
        }
        System.out.println(Arrays.toString(suffArr));

    }

    private static int gcd(int a, int b) {
        if (a > b) {
            return gcd(b, a);
        }
        if (a == 0) {
            return b;
        }
        return gcd(b % a, a);
    }
}
