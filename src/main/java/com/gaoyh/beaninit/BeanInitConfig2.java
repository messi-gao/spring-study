package com.gaoyh.beaninit;

import com.gaoyh.beaninit.bean.Cat;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(value = {Cat.class, GaoyiheImportSelector.class, GaoyiheImportBeanDefinitionRegistrar.class})
public class BeanInitConfig2 {
    @Bean
    public GaoyiheFactoryBean gaoyiheFactoryBean() {
        return new GaoyiheFactoryBean();
    }
}
