package com.ds.gcd;

public class FindGCD {

    public static void main(String args[]) {
        System.out.println(gcd(13,24));
    }

    public static int gcd(int a,int b) {
        if(a>b) {
            return gcd(b,a);
        }
        if(a == 0) {
            return b;
        }
        return gcd(b%a,a);
    }
}
