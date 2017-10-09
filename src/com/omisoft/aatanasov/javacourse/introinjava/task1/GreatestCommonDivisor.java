package com.omisoft.aatanasov.javacourse.introinjava.task1;

/**
 * Method for implementation of GCD for two numbers
 */


public class GreatestCommonDivisor {
    /**
     * This method finds the greatest common divisor
     *
     * @param numForGCD1
     * @param numForGCD2
     * @return
     */
    public int gcd(int numForGCD1, int numForGCD2) {
        int finalResult = 0, case1Greater, case2Smaller;
        case1Greater = (numForGCD1 > numForGCD2) ? numForGCD1 : numForGCD2;
        case2Smaller = (numForGCD1 < numForGCD2) ? numForGCD1 : numForGCD2;

        finalResult = case2Smaller;
        while (case1Greater % case2Smaller != 0) {
            finalResult = case1Greater % case2Smaller;
            case1Greater = case2Smaller;
            case2Smaller = finalResult;
        }
        return finalResult;
    }
}
