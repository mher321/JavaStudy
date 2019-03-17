package auditorium.inheritance;

public class A {
    public static void main(String[] args) {
        A a = new A();
        a.print("Hello polimorphizm.");
        a  = new B();
        a.print("Hello polimorphizm.");
        a= new C();
        a.print("Hello polimorphizm.");
    }
    void print(String s){
        System.out.println(s+" In class A");
    }
}
class B extends A{
    @Override
    void print(String s) {
        System.out.println(s + " In class B" );
    }
}

class C extends A{
    @Override
    void print(String s) {
        System.out.println(s + " In class c" );
    }
}
