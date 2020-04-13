package com.tpoi.interview.digits_manipulation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DigitManipulation
{
  
  public static void main(String... args)
  {
    biggestDigit(423865); //return 865432
    nextDigit(423865); //return 425863
  }
  
  /**
   * find the biggest digit with all the digits in the number
   * @param number - initial number
   * @return the biggest number with the digits
   */
  public static int biggestDigit(int number)
  {
    String numberInString = Integer.toString(number);
    List<Integer> digits = new ArrayList<>(numberInString.length());
    for(int i = 0;i<numberInString.length();i++)
    {
      char currentDigits = numberInString.charAt(i);
      digits.add(Integer.valueOf(String.valueOf(currentDigits)));
    }
  
    Collections.sort(digits);
    Collections.reverse(digits);
    String resultInString = "";
    for(Integer digit:digits)
    {
      resultInString+=digit;
    }
    return Integer.valueOf(resultInString);
  }
  
  /**
   * find the next number with the same digits
   * @param number - initial number
   * @return the next number with the same digits
   */
  public static int nextDigit(int number)
  {
    String numberInString = Integer.toString(number);
    List<Integer> digits = new ArrayList<>(numberInString.length());
    
    digits.add(Character.getNumericValue(numberInString.charAt(numberInString.length()-1)));
    for(int i = numberInString.length()-2;i>0;i--)
    {
      int lastElement = Character.getNumericValue(numberInString.charAt(i-1));
      int currentElement = Character.getNumericValue(numberInString.charAt(i));
      
      digits.add(currentElement);
      if(lastElement<currentElement)
      {
        digits.add(lastElement);
        Collections.sort(digits);
        Collections.reverse(digits);
        
        int elementToMove = digits.get(digits.size()-2);
        digits.remove(digits.size()-2);
        
        String endOfDigit = "";
        for(Integer digit:digits)
        {
          endOfDigit+=digit;
        }
        return Integer.valueOf(numberInString.substring(0,i-1)+elementToMove+endOfDigit);
      }
    }
    return number;
  }  
}

