package com.leftRotateArrayByK;

import java.util.Arrays;

public class correctSol {

    /*
    Input: nums = [1, 2, 3, 4, 5, 6], k = 2
    Output: nums = [3, 4, 5, 6, 1, 2]
     */

    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4, 5, 6};
        int[] result = leftRotateArrayByK(num, 2);
        System.out.println(Arrays.toString(result));
    }

    static int[] leftRotateArrayByK(int[] arr, int k) {
        int n = arr.length;
        int checkk = k % n;

        int[] rotatedArray = new int[n];

        for (int i = 0; i < n - checkk; i++) {
            rotatedArray[i] = arr[checkk + i];
        }

        for (int i = 0; i < checkk; i++) {
            rotatedArray[n - checkk + i] = arr[i];
        }

        return rotatedArray;
    }
}
