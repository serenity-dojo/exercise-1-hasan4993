package com.serenitydojo;

import org.junit.Test;

public class HelloWorldWriterTest {

    @Test
    public void shouldWriteHelloWorldToTheConsole() {
        //Getting Method from main\java\com.serenitydojo\HelloWorldWriter to be reused in the future.
        HelloWorldWriter writer = new HelloWorldWriter();
        writer.writeHelloWorld();
    }
}
