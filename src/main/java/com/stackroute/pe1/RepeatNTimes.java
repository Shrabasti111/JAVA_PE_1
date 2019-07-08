package com.stackroute.pe1;

import java.util.*;

/* method to display the last n characters of the inputed string n number of times */
public class RepeatNTimes {

    public String repeat(String str, int n) {
        int length = str.length();
        String value = str;
        char[] repeatArray = new char[n];
        int j=0;
        for(int i=(length-n); i<length ; i++) {

            repeatArray[j] = str.charAt(i);
            j++;
        }



        String repeatValue = new String(repeatArray);


        for(int i=1;i<=n;i++) {
            value+=repeatValue;
        }

        return value;
    }

    /* main method */

}
