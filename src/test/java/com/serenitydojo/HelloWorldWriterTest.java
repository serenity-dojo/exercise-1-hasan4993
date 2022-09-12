package com.serenitydojo;

import org.junit.Test;

public class HelloWorldWriterTest {

    @Test
    public void shouldWriteHelloWorldToTheConsole() {
        //Getting Method from main\java\com.serenitydojo\HelloWorldWriter to be reused in the future.
        HelloWorldWriter writer = new HelloWorldWriter();
        writer.writeHelloWorld();
    }

  /*  @Test
    public void declareingVariable() {
        //Final keyword makes the variable not ab;e to change the Value of the Variables

        final int ageThisYear = 26;
        int ageNextYear = ageThisYear + 1;
        System.out.println("The Age of a Person Next Year will Be " + ageNextYear);

        double weight = 12.3;
        System.out.printf("double" + weight);
    }


    @Test
    public void wrokingWithStrings() {
        String firstName = " Ali Ul Hasan ";
        System.out.println("My name is " + firstName);

        String organization = " impetus system ";
        String tempOrg = firstName + " " + organization;
        System.out.println("My Organization Name is " + organization.toUpperCase());
        System.out.println("My Organization name length is " + organization.length());
        System.out.println("My Organization Name is Replaced with " + organization.replace("impetus", "flowhcm"));
        System.out.println("My Organization Name is " + organization.replaceFirst("i", "X"));
        System.out.println("My Organization Name is " + organization.trim());
        //trim is used to remove spaces from first & Last positon
        System.out.println("My trim temOrganization Name is " + tempOrg.trim());


    }*/
}
