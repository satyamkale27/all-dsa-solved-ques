package com.arraySortedCheck;

public class arraySortedCheck {

    public static void main(String[] args) {
        /*
        Input: N = 5, array[] = {1,2,3,4,5}
        Output: True.
         */

        int[] num = {5,4,6,7,8};

        boolean result = isAssending(num);
        System.out.println(result);
    }



    static boolean isAssending(int[] arr){



        for(int i = 0; i < arr.length - 1; i++){

                if(arr[i] > arr[i+1]){
                    return false;
                }




        }
        return true;

    }
}
