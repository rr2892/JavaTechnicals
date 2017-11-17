package TreesAndGraphs;

import java.util.ArrayList;

public class TestTreeNode {

    public static void main(String[] args){
        TreeNode node = new TreeNode(5);
        node.leftChild = new TreeNode(1);
        node.leftChild.leftChild = new TreeNode(3);
        node.leftChild.leftChild.leftChild = new TreeNode(11);
        node.leftChild.leftChild.rightChild = new TreeNode(12);
        node.leftChild.rightChild = new TreeNode(4);
        node.leftChild.rightChild.leftChild = new TreeNode(13);
        node.leftChild.rightChild.rightChild = new TreeNode(14);
        node.rightChild = new TreeNode(2);
        node.rightChild.rightChild = new TreeNode(7);

        System.out.println("IN ORDER");
        node.inOrderTraversal(node);
        System.out.println("PRE ORDER");
        node.preOrderTraversal(node);
        System.out.println("POST ORDER");
        node.postOrderTraversal(node);
    }
}
