package com.company;

import java.nio.file.FileAlreadyExistsException;

public class Student {
    private int age;
    private String name;

    public Student() {
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Таких законов физики еще не изобрели, пока что");
        }
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.equals("")) {
            throw new IllegalArgumentException("И как к нему предлагаешь обращаться?");
        }
        this.name = name;
    }

    public Student deseriliaze(String student) throws MyDomainException {
        throw new MyDomainException("NOOOOOOOOOOO", new MyDomainException("Yees"));
    }
}
