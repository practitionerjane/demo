package spring.springmixedconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("config_springmixedconfig.xml");
        A a = (A)context.getBean("a_in_xml");
        System.out.println(a.bInstance1);
        System.out.println(a.bInstance2);

        B b = (B)context.getBean("b");
        System.out.println(b.aInstance);


    }

}