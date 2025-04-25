package com.leftRotateArray;

import java.lang.reflect.Array;
import java.util.Arrays;

public class leftRotateArray {

    /*
    Input: nums = [1, 2, 3, 4, 5]
    Output: [2, 3, 4, 5, 1]
     */

    // solved by me

    public static void main(String[] args) {
        int[] num ={1, 2, 3, 4, 5};
        int[] result = leftRotateArrayByOne(num);
        System.out.println(Arrays.toString(result));

    }


    static int[] leftRotateArrayByOne(int[] arr){


        int[] rotatedArray = new int[arr.length];

        for(int i = 0; i < arr.length - 1; i++){

            rotatedArray[i] = arr[i+1];

        }

        rotatedArray[arr.length -1] = arr[0];
        return rotatedArray;

    }
}
