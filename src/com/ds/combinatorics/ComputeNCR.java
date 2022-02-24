package com.ds.combinatorics;

public class ComputeNCR {

    public static void main(String args[]) {
        System.out.println(ncr(5,2,13));
    }

    private static int power(int x, int y, int p)
    {
        int res = 1;
        x = x % p;
        while (y > 0) {
            if (y % 2 == 1)
                res = (res * x) % p;
            y = y >> 1; // y = y/2
            x = (x * x) % p;
        }
        return res;
    }

    // Returns n^(-1) mod p
    static int modInverse(int n, int p)
    {
        return power(n, p - 2, p);
    }

    // Returns nCr % p using Fermat's
    // little theorem.
    private static int ncr(int n, int r, int p) {
        if (n<r)
            return 0;
        if (r == 0)
            return 1;
        int[] fact = new int[n + 1];
        fact[0] = 1;
        for (int i = 1; i <= n; i++)
            fact[i] = fact[i - 1] * i % p;
        System.out.println(fact[n]);
        return (fact[n] * modInverse(fact[r], p)
                % p * modInverse(fact[n - r], p)
                % p)
                % p;
    }
}
