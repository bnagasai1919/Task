package com.jpmc.application.Aop;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component

public class Logging
 
{
    private final Logger log =  LoggerFactory.getLogger(this.getClass());


    @Before("execution(* com.jpmc.application.Controller.Studentc.saveStudent(..))")
    public void LogBeforeMethodCall(JoinPoint joinPoint) throws Throwable{

        log.info("Object is being saved " + joinPoint.getSignature().getName());//method name

    }

    @After("execution(* com.jpmc.application.Controller.Studentc.getStudents(..))")
    public void LogAfterMethodCall(JoinPoint joinPoint) throws Throwable{

        log.info("Got all the students " + joinPoint.getSignature().getName());//method name

    }
    
}
