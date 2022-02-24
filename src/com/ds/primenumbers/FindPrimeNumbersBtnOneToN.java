package com.ds.primenumbers;

import java.util.Arrays;

public class FindPrimeNumbersBtnOneToN {

    public static void main(String args[]) {
        int n = 20;
        System.out.println(Arrays.toString(getPrimes(n)));
    }
    public static int [] getPrimes(int N) {

        int arr[] = new int[N+1];
        for(int i=2;i*i<=N;i++) {
            if(arr[i] == 0) {
                for(int j=i*i;j<=N;j+=i) {
                    arr[j] = -1;
                    System.out.println("marking "+j+" as non prime");
                }
            }
        }
        int count = 0;
        for(int i=2;i<arr.length;i++) {
            if(arr[i] == 0) {
                count++;
            }
        }
        System.out.println("prime count is "+count);
        int ans[] = new int[count];
        int k = -1;
        for(int i=2;i<arr.length;i++) {
            if(arr[i] == 0) {
                ans[++k] = i;
            }
        }
        return ans;
    }
    // T.C N*log(logN)
}
