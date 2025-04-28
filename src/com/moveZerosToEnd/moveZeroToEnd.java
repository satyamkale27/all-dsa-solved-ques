package com.moveZerosToEnd;

import java.util.Arrays;

public class moveZeroToEnd {


    public static void main(String[] args) {


        /*
        Input: nums = [0, 1, 4, 0, 5, 2]
        Output: [1, 4, 5, 2, 0, 0]
         */


        int[] arr = {0, 1, 4, 0, 5, 2};
        int[] result = moveZerosToEnd(arr);
        System.out.println(Arrays.toString(result));


    }

    static int[] moveZerosToEnd(int[] arr){
        int n = arr.length;
        int increment = 0;
        int[] resultArr = new int[n];


        for(int i = 0; i < n; i++){

            if(arr[i] != 0){
                resultArr[increment] = arr[i];
                increment++;
            }

        }
        return resultArr;

    }

}
