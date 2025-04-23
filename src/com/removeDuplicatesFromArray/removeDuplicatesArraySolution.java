package com.removeDuplicatesFromArray;

import java.util.Arrays;

public class removeDuplicatesArraySolution {
    public static void main(String[] args) {

        int[] arr = {1,1,2,2,2,3,3};
        int k = removeDuplicates(arr);
        System.out.println(k);

    }


    static int removeDuplicates(int[] arr){
        int i = 0;
        for (int j = 1; j < arr.length; j++) {
            if (arr[i] != arr[j]) {
                i++;
                arr[i] = arr[j];
            }
        }
        return i + 1;
    }
}
