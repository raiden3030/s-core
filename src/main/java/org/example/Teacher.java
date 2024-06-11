package org.example;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(scopeName = "prototype")
public class Teacher implements School, BeanNameAware {

    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void learning() {
        System.out.println("teacher is learning.");
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "age=" + age +
                '}';
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("hellow this been called before the use of this bean");
    }
}
