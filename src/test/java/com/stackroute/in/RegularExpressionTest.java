package com.stackroute.in;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RegularExpressionTest {

    RegularExpression regularExpression;

    @Before
    public void setup() {
        regularExpression = new RegularExpression();
    }

    @After
    public void tearDown() {
        regularExpression = null;
    }

    //the presence of a name in a given string returns the message as a true.

    @Test
    public void givenInputStringShouldReturnTrue() {
        String expectedResult = "Is harry there?true";
        String actualResult = regularExpression.checkRegularExpression("this is harry");
        //assert
        assertEquals(expectedResult, actualResult);
    }

    ////the absence of a name in a given string returns the message as a false.

    @Test
    public void givenInputStringShouldReturnFalse() {
        String expectedResult = "Is harry there?false";
        String actualResult = regularExpression.checkRegularExpression("this is henery");
        //assert
        assertEquals(expectedResult, actualResult);
    }
}

