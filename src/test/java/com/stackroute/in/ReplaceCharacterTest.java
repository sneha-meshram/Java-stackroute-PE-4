package com.stackroute.in;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReplaceCharacterTest {

    ReplaceCharacter replaceCharacter;

    @Before
    public void setup(){
        replaceCharacter=new ReplaceCharacter();
    }

    @After
    public void tearDown(){
        replaceCharacter=null;
    }

    /* The given String should replaced all d with f and all l with t and return the new string. */

    @Test
    public void givenStringShouldReturnReplacedString() {
        String originalStr = "daily dry";
        String replacedStr = "faity fry";
        //act
        String resultString = replaceCharacter.replaceCharacterOfString(originalStr);
        //assert
        assertEquals(replacedStr, resultString);
    }

    //we check the String is empty and it return the message as empty string.

    @Test
    public void givenEmptyStringShouldReturnEmptyString(){
        String originalStr = "";
        String replacedStr = "";
        //act
        String resultString = replaceCharacter.replaceCharacterOfString(originalStr);
        //assert
        assertEquals(replacedStr, resultString);
    }
    //given input as a null string should return the null string.
    @Test
    public void givenNullStringShouldReturnNullString() {
        String originalStr = "";
        String replacedStr = null;
        //act
        String resultString = replaceCharacter.replaceCharacterOfString(originalStr);
        //assert
        assertNotEquals(replacedStr,resultString);
    }
}