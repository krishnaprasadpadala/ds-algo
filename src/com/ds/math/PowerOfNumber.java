package com.ds.math;

public class PowerOfNumber {

    // Calculating power using Fast Power Technique
    public static void main(String args[]) {
        System.out.println(pow(5,3));
    }

    private static int pow(int n, int p) {
        if(p == 0) {
            return 1;
        }
        int hfPow = pow(n,p/2);
        if(p%2 == 0) {
            return hfPow * hfPow;
        } else {
            return n * hfPow * hfPow;
        }
    }


}
