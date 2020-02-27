package org.example;

import java.util.Arrays;

public class MergeSort implements SortManager {

    @Override
    public int[] run(int[] array) {

        int arrayLength = array.length;
        int mid = arrayLength / 2;
        int[] leftArray = new int[mid];
        int[] rightArray = new int[arrayLength - mid];

        if (arrayLength < 2) {
            return array;
        }

        for (int i = 0; i < mid; i++) {
            leftArray[i] = array[i];
        }
        for (int i = mid; i < arrayLength; i++) {
            rightArray[i - mid] = array[i];
        }

        run(leftArray);
        run(rightArray);
        Merge.merger(array, leftArray, rightArray, mid, arrayLength - mid);

        //System.out.println("Merge Sorted: \n"+ Arrays.toString(array));
        //System.out.println("\n");

        return array;
    }


}
