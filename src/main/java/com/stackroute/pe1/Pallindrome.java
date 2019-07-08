package com.stackroute.pe1;

public class Pallindrome {

    /* function to check whether the number entered by the user is a pallindrome or not */
    public String pallindromeCheck(int num) {


        if(num < 0) {
            return "Invalid Input!";
        }



        int number = num;

        int sum=0;

        int sum_even=0;

        String value = "";

        while(num!=0){
            int rem = num%10;
            sum=(sum*10)+rem;
            num/=10;
        }

        int final_num = number;

        if(number==sum){
            while(number!=0) {
                int r = number % 10;
                if (r % 2 == 0) {
                    sum_even += r;
                }
                number /= 10;
            }
                if(sum_even >= 25){
                    value += "The number is a pallindrome and the sum of even digits is greater than 25";
                } else {
                    value += "The number is a pallindrome and the sum of even digits is lesser than 25";
                }

        } else {
            value += "The number is not a pallindrome";
        }

        return value;
    }

    /* main method */




}
