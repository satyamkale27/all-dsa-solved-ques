package com.linearSearch;

public class linearSearch {
    public static void main(String[] args) {


        /*
        Given an array of integers nums and an integer target, find the smallest index (0 based indexing)
        where the target appears in the array. If the target is not found in the array, return -1
        Examples:
        Input: nums = [2, 3, 4, 5, 3], target = 3
        Output: 1
         */

        int[] arr = {2, 3, 4, 5, 3};
        int result = linearSearch(arr,3);
        System.out.println(result);


    }

    static int linearSearch(int[] arr,int target){

        for (int i = 0; i < arr.length; i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
}
