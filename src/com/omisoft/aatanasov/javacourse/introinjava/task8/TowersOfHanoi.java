package com.omisoft.aatanasov.javacourse.introinjava.task8;

/**
 * This class is designed to solve the TowersOfHanoi Problem !
 */
public class TowersOfHanoi {


    public void solve(int n, String start, String middle, String end){
        if (n==1){
            System.out.println(start + "->" + end);
        } else {
            solve(n-1, start, end, middle);
            System.out.println(start + "->" + end);
            solve(n-1, middle, start, end);
        }
    }
}
