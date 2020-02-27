package org.example;

public class BinaryTreeSort {
    public BinaryTreeNode node;

    BinaryTreeSort(int value) {
        node = new BinaryTreeNode(value);
    }

    public BinaryTreeNode insert(BinaryTreeNode node, int value) {
        if (node == null) {
            return new BinaryTreeNode(value);
        }

        if (value < node.value) {
            node.left = insert(node.left, value);
        } else if (value > node.value) {
            node.right = insert(node.right, value);
        }
        return node;
    }

    public void treeSorter(BinaryTreeNode node) {
        if (node != null) {
            treeSorter(node.left);
            System.out.print(node.value + " ");
            treeSorter(node.right);
        }
    }

    public void run(BinaryTreeNode Node) {
        if (node != null) {
            run(node.getLeft());
            //System.out.println(" " + node.getValue() + "(" + node.getCounter()+ ")");
            run(node.getRight());
        }
    }
}
