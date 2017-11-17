package StacksAndQueues;

public class AnimalShelter_6 {
    public static void main(String[] args){
        AnimalQueue shelter = new AnimalQueue();

        shelter.enqueue(new Animal("dog"));
        shelter.enqueue(new Animal("dog"));
        shelter.enqueue(new Animal("dog"));
        shelter.enqueue(new Animal("dog"));
        shelter.enqueue(new Animal("cat"));
        shelter.enqueue(new Animal("cat"));
        shelter.dequeueDog().printType();
        shelter.dequeueAny().printType();
        shelter.dequeueAny().printType();
        shelter.dequeueAny().printType();
        shelter.dequeueAny().printType();

    }
}
