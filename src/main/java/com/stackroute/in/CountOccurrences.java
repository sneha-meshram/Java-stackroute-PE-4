package com.stackroute.in;

public class CountOccurrences {


    public String calculateOccurrences(String str, String character) {


        /*
        java program to count the total number of occurrences of a given character in a string
        without using any loop
        */

        int strlength=str.length();
        int charcount=strlength-str.replaceAll(character,"").length();
        String countChar="character is " +charcount;
        return countChar;
    }
}
