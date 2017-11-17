package StacksAndQueues;

public class MultiStack{
    int numStacks;
    int sizePerStack;
    int[] data;
    int[] tops;

    public MultiStack(int numStacks, int sizePerStack){
        this.numStacks = numStacks;
        this.sizePerStack = sizePerStack;
        data = new int[numStacks * sizePerStack];
        tops = new int[numStacks];
        for(int i = 0; i < numStacks; i++){
            tops[i] = i * sizePerStack;
        }
    }

    public void push(int stackNumber, int value){
        stackNumber--;
        if(tops[stackNumber] == (stackNumber+1) * sizePerStack){
            System.out.println("No room in Stack #" + (++stackNumber));
        }else{
            data[tops[stackNumber]++] = value;
        }
    }

    public int pop(int stackNumber){
        stackNumber--;
        if(!isEmpty(stackNumber))   return data[tops[stackNumber]--];
        else                        return -1;
    }

    public int peek(int stackNumber){
        stackNumber--;
        if(!isEmpty(stackNumber))   return data[tops[stackNumber]];
        else                        return -1;
    }

    public boolean isEmpty(int stackNumber){
        if(tops[stackNumber] == stackNumber * sizePerStack){
            System.out.println("Stack #" + (++stackNumber) + " is empty.");
            return true;
        }else{
            return false;
        }
    }

    public void printStacks(){
        String str = "";
        for(int i = 0; i < numStacks; i++){
            String str2 = "";
            for(int j = i * sizePerStack; j <= tops[i]-1; j++){
                str2 = data[j] + " " + str2;
            }
            str2 = "\nStack #" + (i+1) + " TOP [ " + str2 + "] BOTTOM";
            str = str + str2;
        }
        System.out.println(str);
    }
}