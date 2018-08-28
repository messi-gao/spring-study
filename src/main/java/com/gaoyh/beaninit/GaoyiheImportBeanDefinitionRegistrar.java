package com.gaoyh.beaninit;

import com.gaoyh.beaninit.bean.Monkey;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

public class GaoyiheImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {
    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
        if(registry.containsBeanDefinition("com.gaoyh.beaninit.bean.Cat")){
            registry.registerBeanDefinition("monkey", new RootBeanDefinition(Monkey.class));
        }
    }
}
