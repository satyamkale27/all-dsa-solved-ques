package com.patterns.solvedQuestions;

import java.util.Scanner;

public class binaryTriangle {
    public static void main(String[] args) {

        // code written by me
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = input.nextInt();
        boolean startOdd = false;
        boolean startEven = false;

        for(int i = 0; i < n; i++){

            for (int j = 0; j < i; j++){

                if(i % 2 == 0){

                    // for even

                    if(startEven){
                        System.out.print("1 ");
                        startEven = false;
                    }
                    if (!startEven){
                        System.out.print("0 ");
                        startEven = true;
                    }

                }

                if(i % 2 != 0){

                    // for odd

                    if(startOdd){
                        System.out.print("0 ");
                        startOdd = false;
                    }
                    if (!startOdd){
                        System.out.print("1 ");
                        startOdd = true;
                    }

                }


            }

            startOdd = false;
            startEven = false;
            System.out.println();


        }
    }
}
