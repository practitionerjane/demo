package spring.aop;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
public class HelloAop implements Hello{

    public HelloAop(){
        System.out.println("in constructor");
    }
    public void hello(){
        System.out.println("hello method...");
    }

}
