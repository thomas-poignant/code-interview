# Task In Order

Suppose you have a list of tasks which need to be executed.
Some of these tasks have dependencies which must be executed before they are.
 Please provide a method which, when given a list of tasks, will provide a valid ordering in return. 

## Example:
``` 
Input: [ A, B, C, D ] 
A <- B, C 
B <- C, D 
D <- C 
Return: [ C, D, B, A ]
```
