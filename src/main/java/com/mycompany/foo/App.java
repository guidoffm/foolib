package com.mycompany.foo;

import com.google.inject.AbstractModule;
import com.google.inject.Guice;
import com.google.inject.Injector;

/**
 * Hello world!
 *
 */
public class App {

    public static void main(String[] args) {
        Injector injector = Guice.createInjector(new AbstractModule() {
            @Override
            protected void configure() {
                // Bindings go here
                bind(Greeting.class).to(GreetingImpl.class);
            }
        });

        // Use the injector to get an instance of a class
        Greeting myClass = injector.getInstance(Greeting.class);
        System.out.println(myClass.sayHello());
    }

}
