package OOPS.Polymorphism.CompileTime;

public class Main {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        System.out.println(c.add(1,2));
        System.out.println( c.add(3, 4, 6));
    }
}
