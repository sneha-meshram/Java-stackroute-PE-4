package com.stackroute.in;

public class StringTranspose {

    /* program to transpose tha given string */

    public String transposeTheString(String originalStr) {
        if (originalStr == null) {
            return "input string is null";
        }
        String transpose = "";

        String[] originalStrList = originalStr.split(" ");

        for (String word : originalStrList) {
            StringBuilder sb = new StringBuilder(word);
            sb.reverse();
            transpose += sb.toString() + " ";
        }
        return transpose.trim();
    }
}

