package com.xset.my.xsetspring;

import com.xset.my.xsetspring.configuration.XsetSpringConfiguration;
import com.xset.my.xsetspring.data.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XsetSpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(XsetSpringApplication.class, args);

        ApplicationContext contextXml = new ClassPathXmlApplicationContext("beans.xml");
        Car carXml = (Car) contextXml.getBean("car");
        System.out.println("XML Config: " + carXml);

        ApplicationContext contextAnnotation = new ClassPathXmlApplicationContext("annotation-beans.xml");
        Car carAnnotation = contextAnnotation.getBean(Car.class);
        System.out.println("XML + Annotations Config: " + carAnnotation);

        ApplicationContext contextJava = new AnnotationConfigApplicationContext(XsetSpringConfiguration.class);
        Car carJava = contextJava.getBean(Car.class);
        System.out.println("Java Config: " + carJava);
    }

}
