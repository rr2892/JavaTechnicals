package LinkedLists;

public class CycleDetection_8 {
    public static void main(String[] args){

        Node head = new Node(0);
        Node n = head;
        n.next = new Node(1);
        n = n.next;
        n.next = new Node(2);
        n = n.next;
        n.next = new Node(3);
        n = n.next;
        n.next = new Node(4);
        n = n.next;
        n.next = new Node(5);
        n = n.next;
        Node loopStart = new Node(6);
        n.next = loopStart;
        n = n.next;
        n.next = new Node(7);
        n = n.next;
        n.next = new Node(8);
        n = n.next;
        n.next = new Node(9);
        n = n.next;
        n.next = new Node(10);
        n = n.next;
        n.next = new Node(11);
        n = n.next;
        n.next = loopStart;
        n = n.next;

        System.out.println(getLoopBeginning(head).data);

    }

    static Node getLoopBeginning(Node head){
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast)
                break;
        }

        if(fast == null || fast.next == null)
            return null;

        slow = head;
        while(slow != fast){
            slow = slow.next;
            fast = fast.next;
        }

        return slow;
    }

    static void printNode(Node n){
        while(n != null){
            System.out.print(n.data + " ");
            n = n.next;
        }
        System.out.println();
    }


}
