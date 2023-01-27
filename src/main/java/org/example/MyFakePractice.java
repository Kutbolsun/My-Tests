package org.example;

import com.github.javafaker.Faker;

public class MyFakePractice {
    static Faker faker = new Faker();

    public static void main(String[] args) {
        System.out.println(generateName());
        System.out.println(generateLastName());
        System.out.println(numbers());
        System.out.println(generateEmailAddress());


    }

    public static String generateName(){
        return faker.name().lastName().toString();
    }

    public static String generateLastName(){
        return faker.name().nameWithMiddle().toString();
    }

    public static int numbers(){
        return faker.idNumber().invalid().length();
    }
    public static String generateEmailAddress(){
        return faker.internet().emailAddress().toString();
    }

}

