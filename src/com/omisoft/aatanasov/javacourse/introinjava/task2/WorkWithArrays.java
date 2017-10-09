package com.omisoft.aatanasov.javacourse.introinjava.task2;

/**
 * This class is designed to work with arrays
 */
public class WorkWithArrays {

    //method that find and output the smallest number from the array
    public int getMinValue(int[] array) {
        int minValue = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
            }
        }

        return minValue;
    }

    /**
     *
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

    //method that process the array and order it from smallest to biggest number if it's mixed
    public void printArray(int array[]) {
        int n = array.length;

        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
    }
}

