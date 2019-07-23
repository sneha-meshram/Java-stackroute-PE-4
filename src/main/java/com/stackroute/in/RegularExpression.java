package com.stackroute.in;

import java.util.regex.Pattern;

public class RegularExpression {


    /*
    a program with the implementation of Regular Expression to find the presence of the name
    Harry in a string.
    Input: This is Harry.
    */

    public String checkRegularExpression(String input) {
     String actualResult="";
     String pattern=".*harry*";
     boolean value= Pattern.matches(pattern,input);
     actualResult+="Is harry there?"+value;
     return actualResult;

    }
}
