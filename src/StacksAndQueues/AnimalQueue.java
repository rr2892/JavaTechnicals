package StacksAndQueues;

import java.util.LinkedList;
import java.util.Stack;

public class AnimalQueue {

    private LinkedList<Animal> dogs;
    private LinkedList<Animal> cats;
    private int order;

    public AnimalQueue(){
        dogs = new LinkedList<Animal>();
        cats = new LinkedList<Animal>();
        order = 0;
    }

    public void enqueue(Animal a){
        a.setOrder(order++);
        if(a.getType().equals("dog"))
            dogs.addLast(a);
        else
            cats.addLast(a);
    }

    public Animal dequeueAny(){
        if(cats.isEmpty())
            return dequeueDog();
        else if(dogs.isEmpty())
            return dequeueCat();
        else
            if(dogs.getFirst().isOlderThan(cats.getFirst()))
                return dequeueDog();
            else
                return dequeueCat();
    }

    public Animal dequeueDog(){
        if(!dogs.isEmpty()){
            return dogs.removeFirst();
        }
        else
            return null;
    }

    public Animal dequeueCat(){
        if(!cats.isEmpty()){
            return cats.removeFirst();
        }
        else
            return null;
    }
}
