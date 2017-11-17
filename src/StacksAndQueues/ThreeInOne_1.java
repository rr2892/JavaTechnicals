package StacksAndQueues;

import com.sun.org.apache.xpath.internal.operations.Mult;

public class ThreeInOne_1 {
    public static void main(String[] args){
        MultiStack stack = new MultiStack(3, 4);
        stack.push(1, 1);
        stack.push(1, 2);
        stack.push(1, 3);
        stack.push(1, 4);
        stack.printStacks();
        stack.push(2, 6);
        stack.push(2, 7);
        stack.push(2, 8);
        stack.push(2, 9);
        stack.printStacks();
        stack.push(3, 3);
        stack.push(3, 3);
        stack.push(3, 3);
        stack.push(3, 4);
        stack.push(3, 7);
        stack.printStacks();
        stack.pop(1);
        stack.pop(1);
        stack.pop(1);
        stack.printStacks();
        stack.pop(1);
        stack.pop(1);
        stack.push(1, 2);
        stack.push(1, 3);
        stack.printStacks();;

    }
}
