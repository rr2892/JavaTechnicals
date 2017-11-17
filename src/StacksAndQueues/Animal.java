package StacksAndQueues;

public class Animal {
    private String type;
    private int order;

    public Animal(String type){
        this.type = type;
    }

    public void printType(){
        System.out.println(type);
    }

    public String getType(){
        return type;
    }

    public int getOrder(){
        return order;
    }

    public void setOrder(int order){
        this.order = order;
    }

    public boolean isOlderThan(Animal a){
        if(this.order <= a.getOrder())
            return true;
        return false;
    }
}
