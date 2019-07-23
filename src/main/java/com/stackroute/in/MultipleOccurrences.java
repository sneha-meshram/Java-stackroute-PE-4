package com.stackroute.in;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MultipleOccurrences {

    public String wordOccurrence(String inputStr, String word) {

        /*
        program to find out the multiple occurrences of the given word in a string using Matcher
        methods.
        Input : She sells seashells by the seashore
        */

        if (inputStr == null) {
            return "input string is null";
        }

        if (inputStr.contains(word)) {
            String sendBack = "";

            StringBuffer stringBuffer = new StringBuffer();

            Pattern pattern = Pattern.compile(word);
            Matcher matcher = pattern.matcher(inputStr);
            while (matcher.find()) {
                stringBuffer.append("Found at: ").append(matcher.start()).append(" - ").append(matcher.end()).append("\n");
            }


            return stringBuffer.toString().trim();
        }
        return null;
    }
}

