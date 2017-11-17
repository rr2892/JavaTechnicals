package StacksAndQueues;

import java.util.Stack;

public class SortStack_5 {
    public static void main(String[] args){
        Stack<Integer> stack = new Stack<Integer>();
        int[] nums = {3,6,5,1,4,2};
        for(int i = 0; i < nums.length; i++) stack.push(nums[i]);
        System.out.println(stack.toString());
        sortStack(stack);
        System.out.println(stack.toString());
        System.out.println(stack.pop());
    }

    static void sortStack(Stack<Integer> stack){
        Stack<Integer> sorted = new Stack<Integer>();

        while(!stack.isEmpty()){
            int next = stack.pop();

            while(!sorted.isEmpty() && next < sorted.peek())
                stack.push(sorted.pop());

            sorted.push(next);
        }

        while(!sorted.isEmpty())
            stack.push(sorted.pop());
    }
}
