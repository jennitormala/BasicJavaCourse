package com.omisoft.aatanasov.javacourse.introinjava.task2;

public class Test {


    public static void main(String[] args) {
        int array[] = {1, 2, 3, 4, 5};
        WorkWithArrays workWithArrays = new WorkWithArrays();
        System.out.println(workWithArrays.getMinValue(array));
        System.out.println(workWithArrays.getSum(array));
        workWithArrays.printArray(array);
    }


}

