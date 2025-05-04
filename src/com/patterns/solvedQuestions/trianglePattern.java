package com.patterns.solvedQuestions;

import java.util.Scanner;

public class trianglePattern {

    // code written by me
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = input.nextInt();
        int till = 30;
        int middle = till / 2;
        int num = 0;

        for (int i = 0; i < n ; i++){

            for (int s = 0; s < middle - num; s++) {
                System.out.print(" ");
            }


            for (int j = middle - num; j <= middle + num; j++){

                System.out.print("* ");
            }
            num++;
            System.out.println();

        }
    }
}
