package operators;

public class MemberAccess {

    public static void main(String[] args) {
        A a = null;
        a.f();
        
        a = new B();
        System.out.println("i: " + a.i);
        a.g();
    }

}

class A {
    int i = 1;
    
    static void f(){
        System.out.println("Called f()");
    }
    
    void g(){
        System.out.println("Called g() in A");
    }
}

class B extends A{
    int i = 2;
    
    void g(){
        System.out.println("Called g() in B");
    }
}


