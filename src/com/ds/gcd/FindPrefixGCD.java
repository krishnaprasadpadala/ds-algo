package com.ds.gcd;

import java.util.Arrays;

public class FindPrefixGCD {

    public static void main(String args[]) {
        int A[] = {2,3,6,8};
        int [] prefixSubArr = new int[A.length-1];
        for(int i=1;i<A.length;i++) {
            int p;
            if(i==1) {
                p = gcd(A[i],A[i-1]);
                prefixSubArr[i-1] = p;
            } else {
                p = gcd(prefixSubArr[i-2],A[i]);
                prefixSubArr[i-1] = p;
            }
        }
        System.out.println(Arrays.toString(prefixSubArr));
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
