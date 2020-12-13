package spring.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggerAspect {

    public LoggerAspect(){
        System.out.println("in constructor: LoggerAspect");
    }

    @Pointcut("execution(* spring.aop.HelloAop.*(..))")
//    @Pointcut("execution(* *(*))")
    private void log(){}

    @Before("log()")
    public void logBefore(){
        System.out.println("aop: in method logBefore");
    }

    @After("log()")
    public void logAfter(){
        System.out.println("aop: in method logAfter");
    }
}
