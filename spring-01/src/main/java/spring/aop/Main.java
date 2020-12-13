package spring.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring.mixedconfig.A;
import spring.mixedconfig.B;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("config_aop.xml");
        HelloAop a = (HelloAop) context.getBean("helloAop");
        a.hello();
    }
}