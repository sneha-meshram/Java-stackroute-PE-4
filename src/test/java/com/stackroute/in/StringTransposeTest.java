package com.stackroute.in;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringTransposeTest {

    StringTranspose stringTranspose;

    @Before
    public void setup(){
        stringTranspose=new StringTranspose();
    }

    @After
    public void tearDown(){
        stringTranspose=null;
    }

    //the given input string should return the transpose of that string.

    @Test
    public void givenStringShouldReturnTheTransposeOfString(){
        String originalStr="sneha meshram";
        String transposeStr="ahens marhsem";
        //act
        String result=stringTranspose.transposeTheString(originalStr);
        //assert
        assertEquals(transposeStr,result);
    }

    //the given null string should return the null message.

    @Test
    public void givenNullStringShouldReturnNullMessage() {
        String expectedStr = "input string is null";
        String actualStr = stringTranspose.transposeTheString(null);
        assertEquals(expectedStr, actualStr);
    }
}