package com.gaoyh.beaninit;

import com.gaoyh.beaninit.bean.Dog;
import org.springframework.beans.factory.FactoryBean;

public class GaoyiheFactoryBean implements FactoryBean<Dog> {
    @Override
    public Dog getObject() throws Exception {
        return new Dog();
    }

    @Override
    public Class<?> getObjectType() {
        return Dog.class;
    }
}
