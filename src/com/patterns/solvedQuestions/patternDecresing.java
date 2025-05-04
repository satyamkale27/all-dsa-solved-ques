package com.patterns.solvedQuestions;

public class patternDecresing {

    /*
     *
     * *
     * * *
     * * * *

      solved by me + tutorial

     */

    public static void main(String[] args) {

        int arrayCount = 1;

        for (int i = 0; i < 10; i++){

            for (int j = 0; j < arrayCount; j++){
                System.out.print("* ");
            }
            arrayCount++;
            System.out.println();
        }
    }
}
