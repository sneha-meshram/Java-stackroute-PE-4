package com.stackroute.in;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class ListSortingTest {

    ListSorting listSorting;

    @Before
    public void setup(){
        listSorting=new ListSorting();
    }

    @After
    public void tearDown(){
        listSorting=null;
    }

    /*
    Extract the words from the text and sort them into alphabetical order and
     Display the sorted list of words.
    */

    @Test
    public void givenStringShouldReturnTheSortedListOfWords(){
        String unsortedsStr="my name is sneha";
        String sortedStr="is my name sneha";
        //act
        String ResultStr=listSorting.sortTheList(unsortedsStr);
        //assert
        assertEquals(sortedStr,ResultStr);
    }

    /* given null string as a input should return null string message */

    @Test
    public void givenStringShouldReturnNull(){
        String unsortedsStr="";
        String sortedStr="null string";
        //act
        String ResultStr=listSorting.sortTheList(unsortedsStr);
        //assert
        assertEquals(sortedStr,ResultStr);
    }
}