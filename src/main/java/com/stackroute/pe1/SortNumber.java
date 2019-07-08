package com.stackroute.pe1;
import java.net.SocketOption;
import java.util.*;

public class SortNumber {

    /* method to count the number of digits */
    public int countDigits(int num) {
        int count = 0;
        while(num != 0) {
            int rem = num % 10;
            count++;
            num /= 10;

        }
        return count;
    }

    /* method to sort the digits in decending order */
    public String sortDigits(int[] array) {

        String value = "";

        for (int i=0; i<array.length-1; i++){
            for(int j=i+1; j<array.length; j++){
                if(array[i] < array[j]){
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }

        for(int i=0;i<array.length; i++) {
            value += String.valueOf(array[i]);
        }
       return value;
    }

    /* method to calulate the sum of the even digits */
    public int evenSum(int[] array){
        int sum = 0;
        for(int i=0; i<array.length; i++) {
            if(array[i] % 2 == 0){
                sum += array[i];
            }
        }
        return sum;
    }

    /* main method */


}
