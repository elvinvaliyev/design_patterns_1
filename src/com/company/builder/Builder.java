package com.company.builder;

public interface Builder {
    UserBuilder name(String name);

    UserBuilder surname(String surname);

    UserBuilder role(String role);

    UserBuilder age(int age);

    User build();
}
