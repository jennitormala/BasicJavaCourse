package com.omisoft.aatanasov.javacourse.introinjava.task1;

/**
 * This class is designed to work with LCM of two numbers

 */

public class LeastCommonMultiple {
    /**
     * This method finds the least common multiple
     *
     * @param num1ForLCM
     * @param num2ForLCM
     * @return lcmInput of the LCM
     */
    public int lcm(int num1ForLCM, int num2ForLCM) {
        int lcmInput;
        lcmInput = (num1ForLCM > num2ForLCM) ? num1ForLCM : num2ForLCM;
        while (true) {
            if (lcmInput % num1ForLCM == 0 && lcmInput % num2ForLCM == 0)
                return lcmInput;
            ++lcmInput;
        }
    }
}
