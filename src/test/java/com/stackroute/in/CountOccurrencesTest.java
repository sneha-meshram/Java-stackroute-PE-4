package com.stackroute.in;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CountOccurrencesTest {

    CountOccurrences countOccurrences;

    @Before
    public void setup(){
      countOccurrences=new CountOccurrences();
    }

    @After
    public void tearDown(){
        countOccurrences=null;
    }

    /* count the total number of occurrences of a given character in a string */

    @Test
    public void givenStringShouldReturnTheNoOfOccurrenceOfACharacter(){
        String str="java is a java again java again";
        String character="a";
        String expected="character is 11";
        //act
        String result=countOccurrences.calculateOccurrences(str,character);
        //assert
        assertEquals(expected,result);
    }

    /* the number of character is zero in the given string */

    @Test
    public void givenStringShouldReturnTheNoOfOccurrenceOfACharacterIsZero(){
        String str="java is a java again java again";
        String character="2";
        String expected="character is 0";
        String result=countOccurrences.calculateOccurrences(str,character);
        //assert
        assertEquals(expected,result);

    }



}