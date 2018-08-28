package com.gaoyh.beaninit;

import com.gaoyh.beaninit.bean.Cat;
import com.gaoyh.beaninit.bean.Dog;
import com.gaoyh.beaninit.bean.Monkey;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

@Configuration
public class BeanInitConfig {
    @Bean
    @Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Cat cat(){
        System.out.println("加载cat");
        return new Cat();
    }

    @Bean
    public Dog dog(){
        System.out.println("加载dog");
        return new Dog();
    }

    @Lazy
    @Bean
    public Monkey monkeyLazy(){
        System.out.println("加载monkeyLazy");
        return new Monkey();
    }

}
