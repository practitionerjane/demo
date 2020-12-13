package spring.corecode;

public class C {
    A aInstance;

    public C() {
        System.out.println("C constructor");
    }

    public A getaInstance() {
        return aInstance;
    }

    public void setaInstance(A aInstance) {
        this.aInstance = aInstance;
    }
}
