package com.bestTimeBuySellStock;

import java.util.ArrayList;

public class buySellStock {
    public static void main(String[] args) {

        int result = calculate();
        System.out.println(result);
    }

    static int calculate(){
        int finalLastResult = 0;

        int indexSmall = 0;
        int[] nums = {7,6,4,3,1};
        ArrayList<Integer> small = new ArrayList<>();
        ArrayList<Integer> large = new ArrayList<>();


        while (indexSmall < nums.length){
            int smallResultIndex = findSmall(nums,indexSmall,small);
            int bigResultIndex = findBig(nums,indexSmall,large);
            indexSmall = smallResultIndex + 1;
        }
        System.out.println(small);
        System.out.println(large);

        for (int i = 0; i < small.size(); i++){

            finalLastResult = large.get(i) - small.get(i) + finalLastResult;
        }
        return finalLastResult;

    }


    static int findSmall(int[] arr, int start, ArrayList small){

        int smallCnt = 0;
        int indexSmall = 0;

        for(int i = start; i < arr.length; i++){
            if(i == start){
                smallCnt=arr[i];
            }

            for(int j = 0; j < arr.length; j++){

                if(arr[i] < arr[j] && arr[i] < smallCnt){
                    smallCnt = arr[i];
                    indexSmall = i;
                }
            }

        }

        small.add(smallCnt);
        return indexSmall;
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