package spring.springcorecode;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("config_springcorecode.xml");
        A a = (A)context.getBean("a_in_xml");
        System.out.println(a.bInstance1);
        System.out.println(a.bInstance2);

        B b = (B)context.getBean("b_in_xml");
        System.out.println(b.aInstance);

        C c = (C) context.getBean("c_in_xml");
        System.out.println(c.aInstance);

        b.aInstance.name = "changed";
        System.out.println(b.aInstance.name);
        System.out.println(c.aInstance.name);

    }

}