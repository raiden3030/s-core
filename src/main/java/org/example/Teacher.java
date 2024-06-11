package org.example;

public class Teacher implements School {
    private int age;
    private String name;

    @Override
    public void learning() {
        System.out.println("Teacher is learning ...");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
