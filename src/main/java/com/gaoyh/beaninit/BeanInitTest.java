package com.gaoyh.beaninit;

import com.gaoyh.beaninit.bean.Cat;
import com.gaoyh.beaninit.bean.Dog;
import com.gaoyh.beaninit.bean.Monkey;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BeanInitTest {
    @Test
    public void test() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BeanInitConfig.class);

        System.out.println("容器加载完毕");

        Dog dog1 = context.getBean(Dog.class);
        Dog dog2 = context.getBean(Dog.class);
        System.out.println(dog1 == dog2);

        Cat cat1 = context.getBean(Cat.class);
        Cat cat2 = context.getBean(Cat.class);
        System.out.println(cat1 == cat2);

        Monkey monkey = context.getBean(Monkey.class);
        System.out.println(monkey);

    }

    @Test
    public void test2() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BeanInitConfig2.class);
        for (String s : context.getBeanDefinitionNames()) {
            System.out.println(s);
        }

    }

    @Test
    public void testCondition() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BeanInitConditionalConfig.class);
        for (String s : context.getBeanDefinitionNames()) {
            System.out.println(s);
        }

    }
}
