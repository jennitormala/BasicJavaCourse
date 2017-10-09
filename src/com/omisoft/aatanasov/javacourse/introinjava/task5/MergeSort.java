package com.omisoft.aatanasov.javacourse.introinjava.task5;

public class MergeSort {

    // array that contains the begin/end parameters
    public void sort(int[] array) {
        mergeSort(array, 0, array.length - 1);
    }

    // implementing of the algorithm
    private void mergeSort(int[] array, int left, int right) {
        if (left < right) {
            //split the array in 2 pieces
            int center = (left + right) / 2;
            //sort the left and right array
            mergeSort(array, left, center);
            mergeSort(array, center + 1, right);
            //merging the results
            merge(array, left, center + 1, right);
        }
    }

    // merge method that is used from the merge algorithm above
    private void merge(int[] array, int leftArrayBegin, int rightArrayBegin, int rightArrayEnd) {
        int leftArrayEnd = rightArrayBegin - 1;
        int numElements = rightArrayEnd - leftArrayBegin + 1;
        int[] resultArray = new int[numElements];
        int resultArrayBegin = 0;

        /*
           Find the smallest element in those two arrays, EX: [1,5] [2,4]
           and add it to the final array. The final array must look like this, EX :[1,2,4,5]
         */
        while (leftArrayBegin <= leftArrayEnd && rightArrayBegin <= rightArrayEnd) {
            if (array[leftArrayBegin] <= array[rightArrayBegin]) {
                resultArray[resultArrayBegin++] = array[leftArrayBegin++];
            } else {
                resultArray[resultArrayBegin++] = array[rightArrayBegin++];
            }
        }
        /*
        After the main loop if we have more elements in the leftArray
        copy them first
         */
        while (leftArrayBegin <= leftArrayEnd) {
            resultArray[resultArrayBegin++] = array[leftArrayBegin++];
        }
         /*
        After the main loop if we have more elements in the rightArray
        copy them first
         */
        while (rightArrayBegin <= rightArrayEnd) {
            resultArray[resultArrayBegin++] = array[rightArrayBegin++];
        }
        //Copy resultArray to the main array
        for (int i = numElements - 1; i >= 0; i--, rightArrayEnd--) {
            array[rightArrayEnd] = resultArray[i];
        }

    }

    //Dumping the arrays
    public void dumpArray(int[] array) {

        for (int value : array) {
            System.out.println(value);
        }
    }
}

