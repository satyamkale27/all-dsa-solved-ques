package com.patterns.solvedQuestions;

import java.util.Scanner;

public class oval {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = input.nextInt();

        for(int i = 0; i < n; i++){


            // left space

            for (int s = 0; s < n-i-1; s++){
                System.out.print(" ");
            }

            // star

            for (int j = 0; j < 2*i+1; j++){
                System.out.print("* ");
            }


            // right space

            for (int s = 0; s < n-i-1; s++){
                System.out.print(" ");
            }



            System.out.println();


        }


        for(int i = n - 2; i >= 0; i--){

            for (int s = 0; s < n-i-1; s++){
                System.out.print(" ");
            }

            // star

            for (int j = 0; j < 2*i+1; j++){
                System.out.print("* ");
            }


            // right space

            for (int s = 0; s < n-i-1; s++){
                System.out.print(" ");
            }
            System.out.println();

        }


    }
}
