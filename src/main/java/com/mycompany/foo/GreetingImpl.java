package com.mycompany.foo;

public class GreetingImpl implements Greeting {
    
    public String sayHello() {
        return "Hello World!";
    }

    public String sayHello(String name) {
        return "Hello " + name + "!";
    }

    public String sayHello(String name, String surname) {
        return "Hello " + name + " " + surname + "!";
    }
}
