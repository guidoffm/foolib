package com.mycompany;

import org.junit.Before;

import com.google.inject.AbstractModule;
import com.google.inject.Guice;
import com.google.inject.Injector;
import com.mycompany.foo.Greeting;
import com.mycompany.foo.GreetingImpl;

public class TestBase {
    protected Injector injector = Guice.createInjector(new AbstractModule() {
        @Override
        protected void configure() {
            bind(Greeting.class).to(GreetingImpl.class);
        }
    });

    @Before
    public void setup () {
        injector.injectMembers(this);
    }
}
