package com.omisoft.aatanasov.javacourse.introinjava.task1;
import java.util.Scanner;


public class Test {
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the two numbers: ");
        int x = input.nextInt();
        int y = input.nextInt();
GCD_LCM gcd_lcm = new GCD_LCM();
        System.out.println("The GCD of two numbers is: " + gcd_lcm.gcd(x, y));
        System.out.println("The LCM of two numbers is: " + gcd_lcm.lcm(x, y));
        input.close();
    }
}




