package com.ds.gcd;

public class FindGcdOfArray {

    public static void main(String args[]) {
        int A[] = {3, 9, 6, 8, 3 };
        System.out.println(solve(A));
    }

    public static int solve(int[] A) {
        int [] prefixSubArr = new int[A.length-1];
        int [] suffixSubArr = new int[A.length-1];

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
        for(int i=A.length-2;i>=0;i--) {
            int s;
            if(i == A.length-2) {
                s = gcd(A[i],A[i+1]);
            }else {
                s = gcd(A[i],suffixSubArr[i+1]);
            }
            suffixSubArr[i] = s;
        }

        int gcdMax = 0;
        int psLen = A.length-1;
        for(int i=0;i<A.length;i++) {
            int hcf;
            if(i == 0) {
                hcf = suffixSubArr[1];
                gcdMax = gcdMax > hcf ? gcdMax : hcf;
            }
            else if(i == A.length-1) {
                hcf = prefixSubArr[psLen-1];
                gcdMax = gcdMax > hcf ? gcdMax : hcf;
            } else {
                hcf = gcd(prefixSubArr[i-1], suffixSubArr[i+1]);
            }
            gcdMax = gcdMax > hcf ? gcdMax : hcf;
        }
        return gcdMax;
    }

    private static int gcd(int a,int b) {
        if(a > b) {
            return gcd(b,a);
        }
        if(a == 0) {
            return b;
        }
        return gcd(b%a,a);
    }

}
