package com.mycompany.foo;

import org.junit.Test;

import com.google.inject.Inject;
import com.mycompany.TestBase;

public class GreetingTest extends TestBase {
    @Inject
    Greeting greeting;

    @Test
    public void testGreeting() {

        this.greeting.sayHello();
        assert true;
    }
}
