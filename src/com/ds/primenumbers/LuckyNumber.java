package com.ds.primenumbers;

public class LuckyNumber {

    // A lucky number is a number which has exactly 2 distinct prime divisors.
    // You are given a number A and you need to determine the count of lucky numbers between the range 1 to A (both inclusive).
    // 1<=A<=50000
    public static void main(String args[]) {
        int A = 20;
        System.out.println(solve(A));
    }

    public static int solve(int A) {
        int arr[] =new int[50001];
        arr[0] = 0;
        arr[1] = 0;
        for(int i=2; i<=50000;i++) {
            if(arr[i] == 0) {
                for(int j=i*2;j<=50000;j+=i) {
                    arr[j] = arr[j]+1;
                }
            }
        }

        int ans = 0;
        for(int i=0;i<=A;i++) {
            if(arr[i] == 2) {
                ans++;
            }
        }
        return ans;
    }
}
