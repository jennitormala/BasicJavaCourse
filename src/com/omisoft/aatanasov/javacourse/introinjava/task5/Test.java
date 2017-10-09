package com.omisoft.aatanasov.javacourse.introinjava.task5;

public class Test {
    public static void main(String args[]) {

        System.out.println("Running mergeSort....");
        System.out.println("Running merge sort on..{7, 1, 8, 2, 0, 12, 10, 7, 5, 3}..");
        int array[] = {7, 1, 8, 2, 0, 12, 10, 7, 5, 3};

        MergeSort mergeSort = new MergeSort();
        mergeSort.sort(array);
        mergeSort.dumpArray(array);

    }

}

