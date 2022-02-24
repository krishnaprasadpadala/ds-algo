package com.ds.primenumbers;

public class FindCountOfDivisors {

    public int[] solve(int[] A) {
        int arr[] = new int[1000001];
        arr[0] = 0;
        arr[1] = 1;
        for (int i = 2; i < arr.length; i++) {
            arr[i] = 2;
        }
        for (int i = 2; i <= 1000000; i++) {
            for (int j = i * 2; j <= 1000000; j += i) {
                arr[j] = arr[j] + 1;
            }
        }
        int ans[] = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            ans[i] = arr[A[i]];
        }
        return ans;
    }
}
