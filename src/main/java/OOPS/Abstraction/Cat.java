package OOPS.Abstraction;

public class Cat extends Animal {

    @Override
    void eat() {
        System.out.println("Cat is eating");
    }

    @Override
    void bark()
    {
        System.out.println("Meow Meow...");
    }
}
