package spring.springcorecode;

public class A {
    B bInstance1;
    B bInstance2;
    public A(){
        System.out.println("in a constructor");
    }

    public B getbInstance1() {
        return bInstance1;
    }

    public void setbInstance1(B bInstance1) {
        this.bInstance1 = bInstance1;
    }

    public B getbInstance2() {
        return bInstance2;
    }

    public void setbInstance2(B bInstance2) {
        this.bInstance2 = bInstance2;
    }
}
