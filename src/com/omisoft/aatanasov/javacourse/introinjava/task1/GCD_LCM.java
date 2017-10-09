package com.omisoft.aatanasov.javacourse.introinjava.task1;

/**
 * Method for implementation of GCD and LCM of two numbers
 */
public class GCD_LCM {

    /**
     * This method finds the greatest common divisor
     * @param x
     * @param y
     * @return
     */
    public int gcd(int x, int y) {
        int r = 0, a, b;
        a = (x > y) ? x : y;
        b = (x < y) ? x : y;

        r = b;
        while (a % b != 0) {
            r = a % b;
            a = b;
            b = r;
        }
        return r;
    }

    /**
     * This method finds the least common multiple
     * @param x
     * @param y
     * @return
     */
    public int lcm(int x, int y) {
        int a;
        a = (x > y) ? x : y;
        while (true) {
            if (a % x == 0 && a % y == 0)
                return a;
            ++a;
        }
    }
}