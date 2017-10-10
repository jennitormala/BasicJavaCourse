package com.omisoft.aatanasov.javacourse.introinjava.task8;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        TowersOfHanoi hanoi = new TowersOfHanoi();
        System.out.println("Enter the number of discs you want to use: ");
        Scanner input = new Scanner(System.in);
        int discs = input.nextInt();
        hanoi.solve(discs, "A", "B", "C");
    }
}
