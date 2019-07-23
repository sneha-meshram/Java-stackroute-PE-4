package com.stackroute.in;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MultipleOccurrencesTest {

    MultipleOccurrences multipleOccurrences;

    @Before
    public void setup(){
        multipleOccurrences=new MultipleOccurrences();
    }

    @After
    public  void tearDown(){
        multipleOccurrences=null;
    }

    //It return the index value of a given input word in a string.

    @Test
    public void givenWordReturnTheIndexOfOccurence() {
        String inputStr = "She sells seashells by the seashore";
        String word = "se";
        String actualResult = multipleOccurrences.wordOccurrence(inputStr, word);
        String expectedResult = "Found at: 4 - 6\n" +
                "Found at: 10 - 12\n" +
                "Found at: 27 - 29";
        //assert
        assertEquals(expectedResult, actualResult);
    }

    //the given null string return the null string message.

    @Test
    public void givenInputStringShouldNull(){
        String expectedResult="input string is null";
        String actualResult=multipleOccurrences.wordOccurrence(null,"sn");
        assertEquals(expectedResult,actualResult);
    }
}