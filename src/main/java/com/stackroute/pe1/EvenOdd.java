package com.stackroute.pe1;
public class EvenOdd {

    /* function to check whether the entered number is even or odd and to display the output accordingly */
    public String tomJerry(int num) {

        String value="";

        if(num%2==0 && (num >= 20 && num <= 30)){
            value += "Jerry" ;/* print Jerry if even */
        } else if (num >= 20 && num <= 30) {

            value += "Tom"; /* print Tom if odd */
        } else {
            value += "Neither Tom nor Jerry";
        }

        return value;
    }

    /* main method */

}
