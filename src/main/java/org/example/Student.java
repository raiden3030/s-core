package org.example;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.function.DoubleToIntFunction;

@Component
@Scope(scopeName = "prototype")
public class Student implements School {

    @Override
    public void learning() {
        System.out.println("student is learning ...");
    }
}
