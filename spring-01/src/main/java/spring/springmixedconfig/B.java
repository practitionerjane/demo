package spring.springmixedconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class B {
    @Autowired
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
