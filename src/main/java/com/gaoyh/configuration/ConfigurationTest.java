package com.gaoyh.configuration;

import com.gaoyh.configuration.bean.Person;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConfigurationTest {

    @Test
    public void testXml() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        System.out.println(context.getBean("personXml"));
        for (String bean : context.getBeanDefinitionNames()) {
            System.out.println(bean);
        }
    }

    @Test
    public void testAnnotation() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        System.out.println(context.getBean(Person.class));
        for (String bean : context.getBeanDefinitionNames()) {
            System.out.println(bean);
        }
    }
}
