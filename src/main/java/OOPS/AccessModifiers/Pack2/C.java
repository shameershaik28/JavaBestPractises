package OOPS.AccessModifiers.Pack2;

import OOPS.AccessModifiers.Pack1.A;

public class C extends A {
    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.publicVar);
//        System.out.println(a.protectedVar);
//        System.out.println(a.defaultVar);
//        System.out.println(a.privateVar);

        C c = new C();
        System.out.println(c.publicVar);
        System.out.println(c.protectedVar);
    }

}
