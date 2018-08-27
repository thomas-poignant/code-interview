# Has Pair Equals Sum

This one is from the [official video from Google](https://www.youtube.com/watch?v=XKu_SEDAykw) about coding interview.
We have to find a pair of number in the tables equals to the sum in input (here it's 8).

You have an array of number :
```java
int[] NUMBERS_CASE_1 = new int[]{1,2,4,4}; //example one
int[] NUMBERS_CASE_2 = new int[]{1,2,3,9}; //example two

//sum to find is 8
```
We supposed that the array is already sorted.
There can be no pair equals to the sum in the array.

You need to write a efficient programm who can find a pair who is equals at 8.
My implementation is on [HasPairWithSum.java](HasPairWithSum.java).