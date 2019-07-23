package com.stackroute.in;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSorting {


    public String sortTheList(String unsortedStr) {

        /*
         program that sets up a String variable containing a paragraph of text of your choice.
        a. Extract the words from the text and sort them into alphabetical order.
        b. Display the sorted list of words.
        */


        if (unsortedStr == null) {
            List<String> sortedList = new ArrayList();
            String[] unsortedStrArray = unsortedStr.split(" ");
            for (int i = 0; i < unsortedStrArray.length; i++) {
                sortedList.add(unsortedStrArray[i]);
            }
            Collections.sort(sortedList);
            StringBuilder finalList = new StringBuilder();
            for (String s : sortedList) {
                finalList.append(s);
                finalList.append(" ");
            }
            return finalList.toString().trim();
        } else {
            return "null string";
        }
    }
}

