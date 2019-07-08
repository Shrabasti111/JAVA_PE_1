package com.stackroute.pe1;
import java.util.*;

public class VowelConsonant {


    /* method to determine whether each character in the entered string is a vowel or consonant  */
    public String determineVowelConsonants(String word) {

        String value = "";
        for(int i=0; i<word.length(); i++) {


            if ((word.charAt(i) >= 'a' && word.charAt(i) <= 'z') ||(word.charAt(i) >= 'A' && word.charAt(i) <= 'Z')) {



                if (word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i' || word.charAt(i) == 'o' || word.charAt(i) == 'u') {

                    value+="vowel";

                } else {
                    value+="consonant";
                }

            } else {
                    value+="Invalid Input! ";
            }
        }
        return value;
    }

    /* main method */

}
