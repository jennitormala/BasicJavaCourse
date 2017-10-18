package com.omisoft.aatanasov.javacourse.introinjava.task3;

/**
 * This class is designed to find the weight in number array
 */
public class WeightOfArray {

    /**
     * This method is used to find the weight using the following parameter :
     *
     * @param array
     * @return
     */
    public int findWeight(int[] array) {
        int arrayLength = array.length;
        if (arrayLength < 2) {
            throw new IllegalArgumentException("The array you entered is too short!");
        }

        // Intersecting left side of the array and showing to which element it has reached
        int currentLeftValue = array[0];
        // Intersecting right side of the array and showing to which element it has reached
        int currentRightValue = array[arrayLength - 1];
        int answer = -1;

        for (int leftElement = 0, rightElement = array.length - 1; leftElement <= rightElement; ) {
            System.out.println("leftElement: " + leftElement + "; rightElement: " + rightElement);

            /*
            Check if the left index is side by side to right index
            or if there are another elements between them
            */
            if (leftElement + 1 == rightElement) {
                if (currentLeftValue > currentRightValue) {
                    answer = currentLeftValue;
                }
                if (currentLeftValue < currentRightValue) {
                    answer = currentRightValue;
                }
                if (currentLeftValue == currentRightValue) {
                    answer = 0;
                }
                break;
            }

            /*
            Check which elements from one of the sides is bigger and which is smaller
             */
            if (currentLeftValue >= currentRightValue) {
                currentRightValue = currentRightValue + array[rightElement - 1];
                rightElement--;

            } else {
                if (currentLeftValue < currentRightValue) {
                    currentLeftValue = currentLeftValue + array[leftElement + 1];
                    leftElement++;
                }
            }
        }
        return answer;


    }
}


