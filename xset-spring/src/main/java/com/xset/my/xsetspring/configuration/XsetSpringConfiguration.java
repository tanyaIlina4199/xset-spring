package com.xset.my.xsetspring.configuration;

import com.xset.my.xsetspring.data.Car;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class XsetSpringConfiguration {

    @Bean
    public Car car() {
        return new Car();
    }
}
