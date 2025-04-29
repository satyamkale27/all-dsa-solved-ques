package com.singleNumberCheckArr;

import java.util.Arrays;

public class singlrArrayCheck {

    /*

    Given an array of nums of n integers.
     Every integer in the array appears twice except one integer.
     Find the number that appeared once in the array.
Examples:
Input : nums = [1, 2, 2, 4, 3, 1, 4]
Output : 3

     */

    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 4, 3, 1, 4};
        int result = singleArrCheck(nums);
        System.out.println(result);

    }

    static int singleArrCheck(int[] nums){
        int count = 0;
        int[] countArr = new int[nums.length];

        for(int i = 0; i < nums.length; i++){
            for(int j = 0; j < nums.length; j++){
                if(nums[i] == nums[j]){
                    count++;
                    countArr[i] = count;
                }
            }
            count = 0;
        }

        for(int i = 0; i < countArr.length; i++){
            if(countArr[i] == 1){
               return nums[i];
            }
        }
        return -1;

    }
}
