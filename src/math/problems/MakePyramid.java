package math.problems;

import java.util.Scanner;

public class MakePyramid {
    public static void main(String[] args) {

        /*   Implement a large Pyramid of stars in the screen with java.

         *
         * *
         * * *
         * * * *
         * * * * *
         * * * * * *

         */
        Scanner sc = new Scanner(System.in);
        System.out.println(" how many rows you would like in the pyramid?");
        int numberOfRows = sc.nextInt();
        int rowsCount = 1;
        System.out.println("Here is the pyramid requested");
        // implementing
        for (int i = numberOfRows; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= rowsCount; j++) {
                System.out.print("* ");
            }
            System.out.println();
            rowsCount++;
        }
    }
}