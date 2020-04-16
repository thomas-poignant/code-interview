package com.tpoi.interview.reverse_words;

public class ReverseWords {
    public static void main(String[] args) {
        System.out.println(reverseSettence("Hi how are you ?"));
    }

    public static String reverseSettence(final String settence) {
        String[] words = settence.split(" ");
        String result = "";
        for(final String word : words) {
            if(!"".equals(result)) {
                result += " ";
            }

            result += reverseWords(word);
        }
        return result;
    }


    public static String reverseWords(final String word) {
        char[] letters = word.toCharArray();
        String results = "";
        for(int i = letters.length -1; i>=0; i-- ) {
            results += letters[i];
        }
        return results;
    }
}
