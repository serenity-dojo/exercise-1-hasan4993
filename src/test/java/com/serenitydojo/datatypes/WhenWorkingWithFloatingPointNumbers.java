package com.serenitydojo.datatypes;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class WhenWorkingWithFloatingPointNumbers {
    //TODO: Exercise 1 - Converting a number from celsius to fahrenheit
    @Test
    public void convertingCelsiusToFahrenheit() {

        float celsius = 40.5F;
        float fahrenheit = (celsius * 9 / 5) + 32;
        assertThat(fahrenheit, equalTo(104.9F));
    }


    //TODO: Exercise 2 - Convert kilograms to pounds
    @Test
    public void convertingKilogramToPounds() {

        double kilograms = 89;
        double pounds = kilograms * 2.20462;

        assertThat(pounds, equalTo(196.21117999999998));


    }
}
