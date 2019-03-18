package auditorium.inheritance;

public class InheritanceDemo {

}

class Base {
    public static final int A_BASE_DEFAULT_VALUE = 2;
    int aBase;

    Base(int aBase) {
        this.aBase = aBase;
    }

//    Base(){}

}

class Child extends Base {
    public static final int C_DEFAULT_VALUE = 2;
    int c;

    Child(int aBase, int c) {
        super(aBase);
        this.c = c;
    }

    Child() {
        this(Base.A_BASE_DEFAULT_VALUE, C_DEFAULT_VALUE);
    }

}