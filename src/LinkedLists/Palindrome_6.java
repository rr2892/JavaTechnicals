package LinkedLists;

public class Palindrome_6 {
    public static void main(String[] args){
        int[] nums = {1,3,4,5,6,7,6,5,4,3,1,0};
        Node root = new Node(0);
        Node n = root;
        for(int i = 0; i < nums.length; i++) {
            n.next = new Node(nums[i]);
            n = n.next;
        }

        printNode(root);
        System.out.println(isPalindrome(root));
    }


    static boolean isPalindrome(Node head){
        Node n = head;
        Node previous = null;
        while(n != null){
            Node next  = n.next;
            n.next = previous;
            previous = n;
            n = next;
        }
        n = head;
        Node reversed = previous;
        while(n != null && reversed != null){
            if(n.data != reversed.data) return false;
            n = n.next;
            reversed = reversed.next;
        }
        return true;
    }


    static void printNode(Node n){
        while(n != null){
            System.out.print(n.data + " ");
            n = n.next;
        }
        System.out.println();
    }

}
