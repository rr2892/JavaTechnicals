package StacksAndQueues;

public class QueueWithTwoStacks_4 {
    public static void main(String[] args){
        MyQueue<Integer> queue = new MyQueue<Integer>();
        for(int i = 1; i <= 5; i++) queue.enqueue(i);
        System.out.println(queue.stackNewest.toString());
        System.out.println(queue.stackOldest.toString());
        queue.printQueue();
        System.out.println(queue.dequeue());
        System.out.println(queue.stackNewest.toString());
        System.out.println(queue.stackOldest.toString());
        queue.printQueue();
        queue.enqueue(6);
        queue.enqueue(7);
        System.out.println(queue.stackNewest.toString());
        System.out.println(queue.stackOldest.toString());
        queue.printQueue();
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        queue.printQueue();

    }
}
