package com.stackroute.pe1;
import java.util.*;

public class Total {

    /* method to calculate the sum of the numbers that were entered */
    public int calculateTotal(String input) {
        String[] numbersStr = input.split(" ");

        int[] numbers = new int[ numbersStr.length ];

        int total = 0;


        for ( int i = 0; i < numbersStr.length; i++ )
        {

            numbers[i] = Integer.parseInt( numbersStr[i] );
            total += numbers[i];

        }

        return total;
    }

    /*main method*/

}
