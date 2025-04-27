package com.leftRotateArrayByK;

import java.util.Arrays;

public class leftRotateArrayByK {

    /*
    Input: nums = [1, 2, 3, 4, 5, 6], k = 2
    Output: nums = [3, 4, 5, 6, 1, 2]
     */

    //  code written by me, has some flaws

    public static void main(String[] args) {

        int[] num = {1, 2, 3, 4, 5, 6};
        int[] result = leftRotateArrayByK(num,2);
        System.out.println(Arrays.toString(result));

    }

    static int[] leftRotateArrayByK(int[] arr, int k){


        int[] rotatedArray = new int[arr.length];


        for (int i = 0; i < arr.length - k; i++){

            rotatedArray[i] = arr[k+i];
        }

        for (int i = 0; i < k; i++){
            rotatedArray[arr.length-k+i] = arr[i];

        }


        return rotatedArray;
    }
}
