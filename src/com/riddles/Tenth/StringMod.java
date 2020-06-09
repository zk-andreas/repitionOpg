package com.riddles.Tenth;

public class StringMod {

    public String runModString(String s, String d, char c, char k){
        String retVal = "";
        String newStr = s + " " + d;

        if(newStr.length()<1){
            throw new IllegalArgumentException("Null Length");

        }else {
            retVal = newStr.replace(c,k);
            return retVal;
        }
    }
}
