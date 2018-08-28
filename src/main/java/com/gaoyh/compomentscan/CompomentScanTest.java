package com.gaoyh.compomentscan;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CompomentScanTest {

    @Test
    public void scanAll() {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(Config.class);
        print(applicationContext);
    }

    @Test
    public void scanIncludeFilters() {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(IncludeFiltersConfig.class);
        print(applicationContext);
    }

    @Test
    public void scanExcludeFilters() {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(ExcludeFiltersConfig.class);
        print(applicationContext);
    }
    @Test
    public void scanCustomFilters() {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(CustomFiltersConfig.class);
        print(applicationContext);
    }

    private void print(AnnotationConfigApplicationContext applicationContext) {
        for (String s : applicationContext.getBeanDefinitionNames()) {
            System.out.println(s);
        }
    }
}
