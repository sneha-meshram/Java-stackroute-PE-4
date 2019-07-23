package com.stackroute.in;

public class ReplaceCharacter {
    public String replaceCharacterOfString(String originalStr) {

        /* program to replace all d with f and all l with t */
      if(originalStr==null){
          return null;
      }
        String replaceD=originalStr.replace("d","f");
        String replacedStr=replaceD.replace("l","t");
        return replacedStr;
    }
}
