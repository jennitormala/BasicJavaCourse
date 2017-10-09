package com.omisoft.aatanasov.javacourse.introinjava.task1;

import java.util.Scanner;


public class Test {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the two numbers: ");
        int numForGCD1 = input.nextInt();
        int numForGCD2 = input.nextInt();
        int numForLCM1 = input.nextInt();
        int numForLCM2 = input.nextInt();

         GreatestCommonDivisor greatest = new GreatestCommonDivisor();
         LeastCommonMultiple least = new LeastCommonMultiple();

        System.out.println("The GCD of two numbers is: " + greatest.gcd(numForGCD1, numForGCD2));
        System.out.println("The LCM of two numbers is: " + least.lcm(numForLCM1, numForLCM2));
        input.close();
    }
}




