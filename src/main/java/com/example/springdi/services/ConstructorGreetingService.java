package com.example.springdi.services;

public class ConstructorGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {

        return "Hello World - Constructor";

    }
}
