package com.omisoft.aatanasov.javacourse.introinjava.task2;

/**
 * This class is designed to work with arrays
 */
public class WorkWithArrays {

    /**
     * Method that find the smallest number in array
     * @param array
     * @return the minValue of array
     */
    public int getMinValue(int[] array) {
        int minValue = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
            }
        }

        return minValue;
    }

    /**
     *Method that sum all numbers in array
     * @param array
     * @return the sum of the array
     */
    public int getSum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    /**
     * Method that order the numbers in the array from smallest to biggest
     * @param array
     */
    public void printArray(int array[]) {

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}

