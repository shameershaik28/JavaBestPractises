package OOPS.Polymorphism.RunTime;

public class Main {
    public static void main(String[] args) {
        User u = new Student();
        u.read();
        u = new Mentor();
        u.read();
        Student s = new Student();
        s.read();


    }
}
