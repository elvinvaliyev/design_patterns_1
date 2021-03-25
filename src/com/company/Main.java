package com.company;

import com.company.builder.User;
import com.company.builder.UserBuilder;
import com.company.factory.Shape;
import com.company.factory.ShapeFactory;
import com.company.singleton.Singleton;

public class Main {

    public static void main(String[] args) {
        //object of Singleton class
        Singleton object1 = Singleton.getInstance();
        object1.messageFromSingleton();


        //builder design pattern
        UserBuilder userBuilder = new UserBuilder(5);
        User user = userBuilder.age(15).name("John").build();
        System.out.println(user.toString());


        //Factory pattern design
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shapeObject = shapeFactory.getShape("Circle");
        shapeObject.draw();
    }
}
