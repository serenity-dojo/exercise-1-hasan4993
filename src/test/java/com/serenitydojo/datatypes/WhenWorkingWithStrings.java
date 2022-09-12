package com.serenitydojo.datatypes;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class WhenWorkingWithStrings {

    //TODO: Exercise 1 - Converting to lower case
    @Test
    public void convertingToLowerCase() {
        String uppercaseFirstname = "ALI UL HASAN";
        String lowerCaseFirstname = uppercaseFirstname.toLowerCase();
        assertThat(lowerCaseFirstname, equalTo("ali ul hasan"));
    }

    //TODO: Exercise 2 - Converting to upper case
    @Test
    public void convertingToUpperCase() {
        String lowerCaseCountry = "pakistan";
        assertThat(lowerCaseCountry.toUpperCase(), equalTo("PAKISTAN"));
    }

    //TODO: Exercise 3 - Trim extra space
    @Test
    public void trimmingExtraSpace() {
        String color = " Violet ";
        assertThat(color.trim(), equalTo("Violet"));
    }

    //TODO: Exercise 4 - Finding the length of a string
    @Test
    public void findingStringLength() {
        String cityName = "Amsterdam";
        assertThat(cityName.length(), equalTo(9));
    }

    //TODO: Exercise 5 - Replacing text in a string
    @Test
    public void replacingTextInAString(){
        String famousBoxer = "Hike Tyson";
        assertThat(famousBoxer.replaceFirst("H","M"),equalTo("Mike Tyson"));
    }
}
