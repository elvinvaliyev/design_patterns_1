package com.company.builder;

public class User {
    private final int id;
    private String name;
    private String surname;
    private String role;
    private int age;

    public User(UserBuilder user) {
        this.id = user.id;
        this.name = user.name;
        this.surname = user.surname;
        this.role = user.role;
        this.age = user.age;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", role='" + role + '\'' +
                ", age=" + age +
                '}';
    }

}
