package com.findGreatestNumber;

public class Main {
/*
 Given an array, we have to find the largest element in the array.
    Example 1:
    Input: arr[] = {2,5,1,3,0};
    Output: 5
    Explanation: 5 is the largest element in the array.

 */

    public static void main(String[] args) {
        // solved using recursive approach

        int[] example ={2,5,1,3,0};
        int resultGreaterNumber = findGreatestNumber(example);
        System.out.println(resultGreaterNumber);
    }


    static int findGreatestNumber(int[] arr){
        int greatNumber = 0;


        for(int i =0;i<arr.length;i++){

            if(arr[i] > greatNumber){
                greatNumber = arr[i];
            }

        }
        return greatNumber;

    }


}