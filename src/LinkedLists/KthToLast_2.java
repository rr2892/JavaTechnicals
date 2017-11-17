package LinkedLists;

public class KthToLast_2 {
    public static void main(String[] args){
        int[] nums = {1,3,4,5,6,7,1,9,10};
        Node root = new Node(0);
        Node n = root;
        for(int i = 0; i < nums.length; i++) {
            n.next = new Node(nums[i]);
            n = n.next;
        }

        System.out.println(kthToLast(root, 3));
        System.out.println(kthToLast(root, 1));
        System.out.println(kthToLast(root, 9));

    }

    public static int kthToLast(Node head, int k){
        Node current = head;
        Node runner = current;
        for(int i = 0; i < k-1; i++)
            if(runner == null) return -1;
            else               runner = runner.next;
        while(runner.next != null){
            current = current.next;
            runner = runner.next;
        }
        return current.data;
    }


}
