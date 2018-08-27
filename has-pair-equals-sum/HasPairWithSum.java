package com.tpoi.sandbox.interview;

import java.security.InvalidParameterException;
import javafx.util.Pair;

public class HasPairWithSum
{
  //the tables of numbers is suposed to be already sort
  private static final int[] NUMBERS_CASE_1 = new int[]{1,2,4,4};
  private static final int[] NUMBERS_CASE_2 = new int[]{1,2,3,9};

  //the sum of the pair needs to be 8
  private static final int SUM = 8;

  public static void main (String... args)
  {
    hasPairWithSum(NUMBERS_CASE_1,SUM); // return (4,4)
    hasPairWithSum(NUMBERS_CASE_2,SUM); // return RuntimeException "no pair found"
  }

  public static Pair<Integer,Integer> hasPairWithSum(int[] numbers, int sum)
  {
    if(numbers.length<2)
    {
      throw new InvalidParameterException("To make a pair we need to have at least 2 numbers");
    }

    int firstPairIndex = 0;
    int lastPairIndex = numbers.length-1;

    while(firstPairIndex!=lastPairIndex)
    {
      int firstPairValue = numbers[firstPairIndex];
      int lastPairValue = numbers[lastPairIndex];
      int currentSum = firstPairValue + lastPairValue;

      if(currentSum==sum)
      {
        return new Pair<>(firstPairValue,lastPairValue);
      }
      else if(currentSum<sum)
      {
        firstPairIndex++;
      }
      else
      {
        lastPairIndex--;
      }
    }
    throw new RuntimeException("No pair found");
  }
}
