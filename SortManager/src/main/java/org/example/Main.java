package org.example;

import java.util.Arrays;

public class Main
{
    public static void main( String[] args ) {
        int [] array = {2, 7, 1, 9};
        BubbleSort bubbleSort = new BubbleSort();
        MergeSort mergeSort = new MergeSort();
        BinaryTreeSort binaryTreeSort = new BinaryTreeSort(array[0]);

        bubbleSort.run(array);
        System.out.println("Merge Sorted: \n"+ Arrays.toString(mergeSort.run(array)) + "\n");

        for (int num: array) {
            binaryTreeSort.insert(binaryTreeSort.node, num);
        }
        System.out.println("Binary Tree Sorted: ");
        binaryTreeSort.treeSorter(binaryTreeSort.node);
    }
}
