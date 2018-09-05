package com.gaoyh.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.gaoyh.aop")
@EnableAspectJAutoProxy
@Aspect
public class HahaAspect {
    @Pointcut("execution(* com.gaoyh.aop.Hello.*(..))")
    public void pointcut() {

    }

    @Around(value = "pointcut()")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("方法执行前");
        String s = joinPoint.getArgs().toString();
        System.out.println("参数:" + s);
        Object proceed = joinPoint.proceed();
        System.out.println("方法执行后");
        return proceed;
    }
}
