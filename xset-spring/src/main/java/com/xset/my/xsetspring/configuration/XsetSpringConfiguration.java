package com.xset.my.xsetspring.configuration;

import com.xset.my.xsetspring.data.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class XsetSpringConfiguration {

    @Bean
    public Wheel wheel() {
        return new Wheel("Michlenn");
    }

    @Bean
    public Starter starter() {
        return new Starter("Renault");
    }

    @Bean
    public SparkPlug sparkPlug() {
        return new SparkPlug("SparkPlug");
    }

    @Bean
    public Accumulator accumulator() {
        return new Accumulator("New Accumulator");
    }

    @Bean
    public Engine engine() {
        return new Engine(starter());
    }

    @Bean
    public Hinge hinge() {
        return new Hinge("Good");
    }

    @Bean
    public Differential differential() {
        return new Differential("Normal");
    }

    @Bean
    public Suspension suspension() {
        return new Suspension(hinge());
    }

    @Bean
    public Car car() {
        return new Car(wheel(), engine(), sparkPlug(), accumulator(), differential(), suspension());
    }

}
