package com.company.builder;

public class UserBuilder implements Builder {
    final int id;
    String name;
    String surname;
    String role;
    int age;

    //constructor is created to define index at the beginning
    //other parameters is optional
    public UserBuilder(int id) {
        this.id = id;
    }

    //created methods for definening params to builder class object
    @Override
    public UserBuilder name(String name) {
        this.name = name;
        return this;
    }

    @Override
    public UserBuilder surname(String surname) {
        this.surname = surname;
        return this;
    }

    @Override
    public UserBuilder role(String role) {
        this.role = role;
        return this;
    }

    @Override
    public UserBuilder age(int age) {
        this.age = age;
        return this;
    }

    @Override
    public User build() {
        return new User(this);
    }


}
