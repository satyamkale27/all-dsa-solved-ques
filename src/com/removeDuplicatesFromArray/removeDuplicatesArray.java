package com.removeDuplicatesFromArray;

import java.util.Arrays;

public class removeDuplicatesArray {

    /*
    Input: arr[1,1,2,2,2,3,3]
    Output: arr[1,2,3,_,_,_,_]
     */

    // my code, solved by me

    public static void main(String[] args) {
        int[] num = {1,1,1,2,2,3,3,3,3,4,4};


        int[] result = removeDuplicates(num);
        System.out.println(Arrays.toString(result));

    }


    static int[] removeDuplicates(int[] arr) {

        int checkArray = 0;
        int[] finalArray = new int[arr.length];


        for (int i = 0;i<arr.length;i++){

            if(i==0){
                checkArray = arr[i];
                finalArray[i] = arr[i];
            }

            if(arr[i] > checkArray){
                finalArray[i] = arr[i];
                checkArray = arr[i];

            }
        }


        return finalArray;
    }


}


