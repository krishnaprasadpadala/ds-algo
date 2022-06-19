package com.ds.hashing;

import java.util.Arrays;

public class LongestConsecutive {

    public static int longestConsecutive(final int A[]) {

        int[] a = new int[1000000];
        int[] b = new int[1000000];

        for (int j : A) {
            if (j > 0) {
                a[j] = 1;
            } else if (j < 0) {
                b[-j] = 1;
            } else {
                a[j] = 1;
                b[j] = 1;
            }
        }

        int currCnt = 0;
        int maxCnt = 0;
        for (int i = 1000000 - 1; i >= 0; i--) {
            if (b[i] == 1) {
                currCnt++;
            } else {
                maxCnt = Math.max(maxCnt, currCnt);
                currCnt = 0;
            }
        }

        for (int i = 0; i < 1000000; i++) {
            if (i==0 && a[0] == 1) {
                continue;
            }
            if (a[i] == 1) {
                currCnt++;
            } else {
                maxCnt = Math.max(maxCnt, currCnt);
                currCnt = 0;
            }
        }
        maxCnt = Math.max(maxCnt, currCnt);
        return maxCnt;
    }

    public static void main(String[] args) {
        int [] A = {97, 86, 67, 19, 107, 9, 8, 49, 23, 46, -4, 22, 72, 4, 57, 111, 20, 52, 99, 2, 113, 81, 7, 5, 21, 0, 47, 54, 76, 117, -2, 102, 34, 12, 103, 69, 36, 51, 105, -3, 33, 91, 37, 11, 48, 106, 109, 45, 58, 77, 104, 60, 75, 90, 3, 62, 16, 119, 85, 63, 87, 43, 74, 13, 95, 94, 56, 28, 55, 66, 92, 79, 27, 42, 70};
        int cnt = longestConsecutive(A);
        System.out.println(cnt);
    }
}
