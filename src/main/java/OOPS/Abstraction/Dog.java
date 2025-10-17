package OOPS.Abstraction;

public class Dog extends Animal {

    @Override
    void  eat() {
        System.out.println("Dog is eating");
    }

    @Override
    void bark() {
        System.out.println("Dog is Barking");
    }
}
