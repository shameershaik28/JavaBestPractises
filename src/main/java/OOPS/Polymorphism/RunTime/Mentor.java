package OOPS.Polymorphism.RunTime;

public class Mentor extends Student{
    @Override
    void read(){
        super.read();
        System.out.println("Mentor is reading");
    }
}
