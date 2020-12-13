package spring.corecode;

public class B {
    A aInstance;
    public B(){
        System.out.println("in B constructor");
    }

    public A getaInstance() {
        return aInstance;
    }

    public void setaInstance(A aInstance) {
        this.aInstance = aInstance;
    }
}
