package org.example;

import com.github.javafaker.Faker;

public class FakeDataProvider {

    static Faker faker = new Faker();

    public static void main(String[] args) {
        System.out.println(generateFakeName());
        System.out.println("Fake Last name " + generateLastName());
        System.out.println("Fake email address " + generateEmailAddress());
        System.out.println("Chuck Norris says : " + generateFunnyWord());
    }


    public static String generateFakeName(){
        return faker.name().firstName().toString();
    }


    public static String generateLastName(){
        return faker.name().lastName().toString();
    }

    public static String generateEmailAddress(){
        return faker.internet().emailAddress();
    }

    public static String generateFunnyWord(){
        return faker.chuckNorris().fact();
    }

}
