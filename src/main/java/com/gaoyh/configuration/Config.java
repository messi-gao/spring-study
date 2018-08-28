package com.gaoyh.configuration;

import com.gaoyh.configuration.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
    @Bean(name = "personAnnotation")
    public Person person() {
        return new Person("gaoyihe", 18);
    }
}
