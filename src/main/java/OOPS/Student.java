package OOPS;

public class Student {
    int id;
    String name;
    int age;

    //Constructor
    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    //Method
    public void displayInfo()
    {
        System.out.println("Student id : " + id);
        System.out.println("Student name : " + name);
        System.out.println("Student age : " + age);
    }
}
