package OOPS.AccessModifiers.Pack1;

public class A {
    private int privateVar =1;
    public int publicVar= 2;
    protected int protectedVar=3;
    int defaultVar =4;


    public void print()
    {
        System.out.println(privateVar);
        System.out.println(publicVar);
        System.out.println(protectedVar);
        System.out.println(defaultVar);
    }
}
