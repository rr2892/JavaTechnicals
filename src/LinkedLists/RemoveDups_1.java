package LinkedLists;

import sun.awt.image.ImageWatched;

import java.util.LinkedList;
import java.util.HashSet;
import java.util.ListIterator;

public class RemoveDups_1 {



    public static void main(String[] args){
        int[] nums = {1,3,4,5,6,7,1,9,9};
        Node root = new Node(0);
        Node n = root;
        for(int i = 0; i < nums.length; i++) {
            n.next = new Node(nums[i]);
            n = n.next;
        }

        printNode(root);

        removeDupsNoBuffer(root);

        printNode(root);
    }

    static void removeDups(Node n){
        HashSet<Integer> duplicates = new HashSet<Integer>();
        Node previous = null;

        while(n != null) {
            if (duplicates.contains(n.data))
                previous.next = n.next;
            else{
                duplicates.add(n.data);
                previous = n;
            }

            n = n.next;
        }
    }

    static void removeDupsNoBuffer(Node n){
        Node current = n;
        while(current != null){
            Node runner = current;
            while(runner.next != null){
                if(runner.next.data == current.data)
                    runner.next = runner.next.next;
                else
                    runner = runner.next;
            }
            current = current.next;
        }
    }


    static void printNode(Node n){
        while(n != null){
            System.out.print(n.data + " ");
            n = n.next;
        }
        System.out.println();
    }
}
