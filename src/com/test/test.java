package com.test;

import java.util.ArrayList;

/*
          custom java methods to test
 */

public class test {
    public static void main(String[] args) {
        int[] nums = {7,1,5,3,6,4};
        ArrayList<Integer> large = new ArrayList<>();
        int result = findBig(nums,2,large);
        System.out.println("large is "+large);
        System.out.println("index is " + result);


    }


    static int findBig(int[] arr, int start, ArrayList large){

        int sendCountIndex = 0;
        int leastBig = 0;
        int bigCount = 0;

        for(int i = start; i < arr.length; i++){
            if(i == start){
                bigCount=arr[i];
            }

            for(int j = 0; j < arr.length; j++){

                if(arr[i] > arr[j] && arr[i] > bigCount){
                    bigCount = arr[i];
                }
            }

        }

        int check = 10000;
        for(int i = start; i < arr.length; i++){

            if (Math.abs(arr[i] - bigCount) < check && arr[i] != bigCount){
                leastBig = arr[i];
                check = Math.abs(arr[i] - bigCount);
                sendCountIndex = i;

            }

        }
        large.add(leastBig);
        return sendCountIndex;
    }

}
