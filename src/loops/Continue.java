package loops;

import java.util.Scanner;

/**
 * Author : Bhargava reddy Chinthareddy,
 * Purpose : Learning & Interview preparation
 */

public class Continue {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Enter 1st Value: ");
        int x = num.nextInt();
        System.out.print("Enter 2nd Value: ");
        int y = num.nextInt();
        if (x>y){
            for (int i = 0; i < x; i++) {
                if (i == y) {
                    continue;
                }
                System.out.println(i);
            }
            /*
                Execution:
                1. In for loop i=0 will execute
                2. In for loop i<x will execute
                3. In for loop i++ will execute
                4. Prints values from 0 with an increment by 1
                5. If condition checking & If condition satisfies & removes y value
                6. Continue Printing values below x
            */
            int j = 0;
            while (j < x) {
                if (j == y) {
                    j++;
                    continue;
                }
                System.out.println(j);
                j++;
            }
            /*
                Execution:
                1. In while loop j=0 will execute
                2. In while loop j<x will execute
                3. If condition checking & If condition satisfies
                4. Prints values from 0 with an increment by 1
                5. In for while j++ will execute & removes y value
                6. Continue Printing values below x
            */
            num.close();
        }else{
            System.out.println("Please enter the value 1 that should be greater value 2");
        }
    }
}