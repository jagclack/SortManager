package org.example;

public class BubbleSort implements SortManager {

    @Override
    public int[] run(int[] array) {
        int arrayLength = array.length;

        for (int i = 0; i < arrayLength - 1; i++)
            for (int j = 0; j < arrayLength - i - 1; j++) //run through this loop for each iteration of i
                if (array[j] > array[j + 1]) {

                    //swapping two ints in the array if integer j is greater than j+1
                    int spare = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = spare;
                }
        System.out.println("Bubble Sorted: ");

        for (int i = 0; i < arrayLength; i++)
            System.out.print(array[i] + " ");
        System.out.println("\n");

        return array;
    }
}
