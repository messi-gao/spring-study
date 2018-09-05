package com.gaoyh.aop;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestAop {
    @Test
    public void test() {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(HahaAspect.class);
        Hello bean = annotationConfigApplicationContext.getBean(Hello.class);

        bean.haha("123");
    }
}
