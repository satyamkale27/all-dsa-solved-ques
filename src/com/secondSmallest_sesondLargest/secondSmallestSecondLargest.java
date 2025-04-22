package com.secondSmallest_sesondLargest;

public class secondSmallestSecondLargest {

    public static void main(String[] args) {

        /*
        Example 1:
        Input: [1,2,4,7,7,5]
        Output: Second Smallest : 2
	    Second Largest : 5
         */

        // my code written it has flaws by works for some condition //

        int[] num = {1,2,4,7,7,5};
       int resultSecondGreatest = findSecondGreatest(num);
       int resultSecondSmallest = findSecondSmallest(num);

        System.out.println("second greatest " + resultSecondGreatest);
        System.out.println("second smallest " + resultSecondSmallest);

    }


    static int findSecondGreatest(int[] arr){

        if(arr.length < 2){
            return -1;
        }

        int fristGreatest = Integer.MIN_VALUE;
        int secondGreatest = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length;i++){
            if(arr[i]>fristGreatest){
                fristGreatest = arr[i];
            }

            if(arr[i] < fristGreatest  && secondGreatest < fristGreatest){
                secondGreatest = arr[i];
            }
        }
        return secondGreatest;

    }

    static int findSecondSmallest(int[] arr) {
        if(arr.length < 2){
            return -1;
        }

        int fristSmallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] < fristSmallest) {
                fristSmallest = arr[i];
            }

            if(arr[i] > fristSmallest  && secondSmallest > fristSmallest && arr[i] < secondSmallest){
                secondSmallest = arr[i];
            }
        }
        return secondSmallest;
    }

}
