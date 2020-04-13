package com.tpoi.interview.number_repition;

class NumberRepition {
    public static void main(String[] args) {
        System.out.println(getSequence(20));
    }

    public static String getSequence(final int input) {
        if(input < 1) {
            throw new RuntimeException("Input should be a positive int");
        }

        String result = "";
        for(int i = input; i >= 1; i--){
            if(i != input) {
                result += " , ";
            }
            result += i;
        }
        return result;
    }
}
