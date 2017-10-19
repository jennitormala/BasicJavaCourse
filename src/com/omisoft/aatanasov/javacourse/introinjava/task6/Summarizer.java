package com.omisoft.aatanasov.javacourse.introinjava.task6;

import java.util.Arrays;

/**
 * This class is designed to summarize numbers in string
 */
public class Summarizer {


    /**
     * This method is used to summarize two string numbers
     *
     * @param first
     * @param second
     * @return
     */
    public String summarizeNumberStrings(String first, String second) {
        String finalValue = "";
        if (first.length() == second.length()) {
            finalValue = summarizeChars(first.toCharArray(), second.toCharArray());
        }
        if (first.length() > second.length()) {
            second = equalize(first, second);
            finalValue = summarizeChars(first.toCharArray(), second.toCharArray());
        } else {
            first = equalize(second, first);
            finalValue = summarizeChars(first.toCharArray(), second.toCharArray());
        }
        if (finalValue.toCharArray()[0] == '+') {
            finalValue = finalValue.substring(1);
            finalValue = "1" + finalValue;

        }
        return finalValue;
    }

    /**
     * This method is used to summarize two chars
     *
     * @param firstNumber
     * @param secondNumber
     * @return
     */
    private String summarizeChars(char[] firstNumber, char[] secondNumber) {
        String value = "";
        if (firstNumber.length == 1) {
            int firstInt = Character.getNumericValue(firstNumber[0]);
            int secondInt = Character.getNumericValue(secondNumber[0]);
            int sum = firstInt + secondInt;
            if (sum > 9) {
                value = "+" + (sum - 10);
            } else {
                value = String.valueOf(sum);
            }
        } else {


            String currentValue = summarizeChars(Arrays.copyOfRange(firstNumber, 1, firstNumber.length), Arrays.copyOfRange(secondNumber, 1, secondNumber.length));
            int firstInt = Character.getNumericValue(firstNumber[0]);
            int secondInt = Character.getNumericValue(secondNumber[0]);
            if (currentValue.toCharArray()[0] == '+') {
                firstInt++;
                currentValue = currentValue.substring(1);
            }
            int sum = firstInt + secondInt;
            if (sum > 9) {
                value = "+" + (sum - 10);
            } else {
                value = String.valueOf(sum);
            }
            value = value + currentValue;
        }
        return value;
    }

    /**
     * This string method is used to equalize the two numbers
     *
     * @param bigger
     * @param smaller
     * @return
     */

    private String equalize(String bigger, String smaller) {
        int moreChars = bigger.length() - smaller.length();
        while (moreChars != 0) {
            smaller = "0" + smaller;
            moreChars = moreChars - 1;
        }
        return smaller;
    }
}