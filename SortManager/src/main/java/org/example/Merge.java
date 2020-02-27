package org.example;

public class Merge {
    public static void merger(int[] array, int[] leftArray, int[] rightArray, int leftIndex, int rightIndex) {
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < leftIndex && j < rightIndex) {
            if (leftArray[i] <= rightArray[j]) {
                array[k++] = leftArray[i++];
            } else {
                array[k++] = rightArray[j++];
            }
        }

        while (i < leftIndex) {
            array[k++] = leftArray[i++];
        }
        while (j < rightIndex) {
            array[k++] = rightArray[j++];
        }
    }
}
