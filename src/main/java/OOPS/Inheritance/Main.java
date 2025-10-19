package OOPS.Inheritance;

public class Main {
    public static void main(String[] args) {
        Animal a = new Dog();
        a.eat();
        Dog d = new Dog();
        d.eat();
        d.run();
        Horse h = new Horse();
        h.run();
        h.eat();
        h.sleep();
    }
}
