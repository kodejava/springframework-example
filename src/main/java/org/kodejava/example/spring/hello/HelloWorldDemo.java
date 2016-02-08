package org.kodejava.example.spring.hello;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloWorldDemo {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("ApplicationContext-HelloWorld.xml");

        Hello hello = (Hello) context.getBean("hello");
        hello.sayHello();
    }
}