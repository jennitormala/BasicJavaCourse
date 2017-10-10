package com.omisoft.aatanasov.javacourse.introinjava.task4;

public class Test {
    public static void main(String[] args) {

        QuickSort quickSort = new QuickSort();

        int randomArray1[] = {9, 4, 2, 6, 5, 8, 3, 11, 0};
        int sampleArray2[] = {9, 3, 1, 2, 1, 0, 8, 7, 6, 5};


        System.out.println("\n\n****** Test 1 - Demonstrate Partition ****  ");
        quickSort.dumpArray(randomArray1);
        quickSort.separateArray(randomArray1, 0, (randomArray1.length - 1));
        quickSort.dumpArray(randomArray1);

        System.out.println("\n\n****** Test 2 - Demonstrate QuickSort ****  ");
        quickSort.dumpArray(sampleArray2);
        quickSort.quickSortNumbers(sampleArray2, 0, (sampleArray2.length - 1));
        quickSort.dumpArray(sampleArray2);


    }


}
