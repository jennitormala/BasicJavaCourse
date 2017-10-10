package com.omisoft.aatanasov.javacourse.introinjava.task4;

/**
 * * This is class is designed to work with QuickSort Algorithm
 */
public class QuickSort {

    /**
     * This method is used to find number from the start of the array that is higher than the middle number
     *
     * @param array
     * @param startOfArray
     * @param middleNumberValue
     * @return
     */

    /*Starts the search from startOfArray and increment it  until it finds
    an element greater than element at middleNumber */
    public int findNumberHigherThanMiddleNumber(int array[], int startOfArray, int middleNumberValue) {
        while (array[startOfArray] < middleNumberValue) {
            startOfArray++;
        }
        return startOfArray;
    }

    /**
     * This method is used to find number from the end of the array that is lower than the middle number
     *
     * @param array
     * @param endOfArray
     * @param middleNumberValue
     * @return
     */

    /*Starts the search from endOfArray and increment it  until it finds
    an element lower than element at middleNumber */
    public int findNumberLowerThanMiddleNumber(int array[], int endOfArray, int middleNumberValue) {
        while (array[endOfArray] > middleNumberValue) {
            endOfArray--;
        }
        return endOfArray;
    }

    /**
     * This is method is used to determine the middle number of the array by separating it
     *
     * @param array
     * @param lowerNumberOfArray
     * @param higherNumberOfArray
     * @return
     */

    // choose the middle number of the array
    public int separateArray(int array[], int lowerNumberOfArray, int higherNumberOfArray) {
        int i = lowerNumberOfArray;
        int j = higherNumberOfArray;

        int middleNumberOfArray = (lowerNumberOfArray + higherNumberOfArray) / 2;
        int middleNumberValue = array[middleNumberOfArray];

        //As long as the lowerNumberOfArray is less than higherNumberOfArray
        while (i <= j) {
            //Find the element that is higher than middleNumber from lowerNumberOfArray
            i = findNumberHigherThanMiddleNumber(array, i, middleNumberValue);
            //Find the element that is lower than middleNumber from higherNumberOfArray
            j = findNumberLowerThanMiddleNumber(array, j, middleNumberValue);

            if (i <= j) {
                int swap = array[i];
                array[i] = array[j];
                array[j] = swap;

                i++;
                j--;
            }
        }


        return i;
    }

    /**
     * This method implements the quickSort algorithm by using the following parameters
     *
     * @param array
     * @param lowerNumberOfArray
     * @param higherNumberOfArray
     */
    public void quickSortNumbers(int array[], int lowerNumberOfArray, int higherNumberOfArray) {
        if (lowerNumberOfArray < higherNumberOfArray) {
            int middleNumber = separateArray(array, lowerNumberOfArray, higherNumberOfArray);
            //Sorting of the lower part of the array
            quickSortNumbers(array, lowerNumberOfArray, middleNumber - 1);
            //Sorting of the higher part of the array
            quickSortNumbers(array, middleNumber + 1, higherNumberOfArray);
        }
    }

    /**
     * This method is used to dump the array when completely quick sorted
     *
     * @param array
     */
    public void dumpArray(int array[]) {

        StringBuilder output = new StringBuilder();
        for (int value : array) {
            output.append(value).append(",");
        }
        System.out.println("Array as string : " + output);
    }

}
