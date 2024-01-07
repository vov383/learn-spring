package com.in28minites.learnspringframework.helloworld;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

record Person(String name, int age, Address address) { }; //record : lombok 이랑 비슷한듯? java 16 도입
record Address(String firstLine, String city) { }; //record : lombok 이랑 비슷한듯? java 16 도입


@Configuration
public class HelloWorldConfiguration {

    @Bean
    public String name() {
        return "Ranga";
    }

    @Bean
    public int age() {
        return 15;
    }
    @Bean
    public Person person() {
        return new Person("Ravi", 20, new Address("wangsimli", "Seoul"));
    }
    @Bean
    public Person person2MethodCall() {
        return new Person(name(), age(), address()); //name, age
    }
    @Bean
    @Primary
    public Person person3Parameters(String name, int age,Address address3) {
        //name, age, address2
        return new Person(name, age, address3);
    }

    @Bean
    public Person person5Parameters(String name, int age, @Qualifier("address3qualifier") Address address) {
        //name, age, address2
        return new Person(name, age, address);
    }

    @Bean(name="address2")
    @Primary
    public Address address() {
        return new Address("NoRyang", "Seoul");
    }
    @Bean(name="address3")
    @Qualifier("address3qualifier")
    public Address address3() {
        return new Address("Sibuya", "Tokyo");
    }


}
