package com.gaoyh.beaninit;

import com.gaoyh.beaninit.bean.Cat;
import com.gaoyh.beaninit.bean.Dog;
import com.gaoyh.beaninit.bean.Monkey;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.*;

@Configuration
public class BeanInitConditionalConfig {
    @Bean
    @Conditional(value = WindowCondition.class)
    public Cat cat(){
        System.out.println("加载cat");
        return new Cat();
    }

    @Bean
    @Conditional(value = LinuxCondition.class)
    public Dog dog(){
        System.out.println("加载dog");
        return new Dog();
    }


}
