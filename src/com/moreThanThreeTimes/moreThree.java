package com.moreThanThreeTimes;

import java.util.ArrayList;
import java.util.LinkedHashSet;



/*
Given an integer array nums of size n.
Return all elements which appear more than n/3 times in the array.
The output can be returned in any order.

Examples:
Input: nums = [1, 2, 1, 1, 3, 2]
Output: [1]

 */

// code written by me

public class moreThree {
    public static void main(String[] args) {
        int[] nums = {1, 2, 1, 1, 3, 2};
        ArrayList<Integer> result = three(nums);
        System.out.println(result);
    }

static ArrayList<Integer> three(int[] nums){

    ArrayList<Integer> resultList = new ArrayList<>();
    int number = nums.length / 3;
    int count = 0;
    int[] countArr = new int[nums.length];

    for(int i = 0; i<nums.length; i++){

        for(int j = 0; j<nums.length; j++){
            if(nums[i] == nums[j]){
                count++;
                countArr[i] = count;
            }
        }
        count = 0;
    }
    for(int i = 0; i<countArr.length; i++){

        if(countArr[i]>=number + 1){
            resultList.add(nums[i]);
        }
    }

    LinkedHashSet<Integer> set = new LinkedHashSet<>(resultList);
    ArrayList<Integer> sortedResult = new ArrayList<>(set);
    return sortedResult;

}
}







