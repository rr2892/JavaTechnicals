package StacksAndQueues;

import java.util.Stack;

public class MyQueue<T> {

    Stack<T> stackNewest, stackOldest;

    public MyQueue(){
        stackNewest = new Stack<T>();
        stackOldest = new Stack<T>();
    }

    public int size(){
        return stackNewest.size() + stackOldest.size();
    }

    public void enqueue(T value){
        stackNewest.push(value);
    }

    private void shiftStacks(){
        if(stackOldest.isEmpty()){
            while(!stackNewest.isEmpty()) {
                stackOldest.push(stackNewest.pop());
            }
        }
    }

    public T dequeue(){
        shiftStacks();
        return stackOldest.pop();
    }

    public T getFirst(){
        shiftStacks();
        return stackOldest.peek();
    }

    public void printQueue(){
        String str = "FRONT [ ";
        Stack<T> temp = new Stack<T>();
        while(!stackOldest.isEmpty()){
            T next = stackOldest.pop();
            str += next.toString() + " ";
            temp.push(next);
        }

        while(!temp.isEmpty()) stackOldest.push(temp.pop());

        while(!stackNewest.isEmpty()) temp.push(stackNewest.pop());

        while(!temp.isEmpty()){
            T next = temp.pop();
            str += next.toString() + " ";
            stackNewest.push(next);
        }

        str += "] BACK\n";
        System.out.println(str);
    }



}
