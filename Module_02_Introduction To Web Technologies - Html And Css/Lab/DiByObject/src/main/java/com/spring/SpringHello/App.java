package com.spring.SpringHello;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.SpringHello.bean.Person;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    { 
        AbstractApplicationContext a = new ClassPathXmlApplicationContext("Beans.xml");
        Person p1 = a.getBean("person",Person.class);
       p1.cellPhone();
    }
}
 