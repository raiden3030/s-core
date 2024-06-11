package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfigure.class);
        Teacher t1 = (Teacher) context.getBean(Teacher.class);
        t1.setAge(20);

        Teacher t2 = (Teacher) context.getBean(Teacher.class);
        t2.setAge(30);

        System.out.println(t1);
        System.out.println(t2);
    }
}
