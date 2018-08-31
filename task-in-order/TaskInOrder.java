package com.tpoi.sandbox.interview;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

public class TaskInOrder
{

  public static void main(String ... args)
  {
    //inputs
    char[] tasks = { 'A', 'B','C', 'D' };
    Map<Character,char[]> depedencies = new HashMap<>();
    depedencies.put('A',new char[]{'B','C'});
    depedencies.put('B',new char[]{'C','D'});
    depedencies.put('D',new char[]{'C'});

    getTasksInOrder(tasks,depedencies); // return [C, D, B, A]
  }


  public static Set<Character> getTasksInOrder(char[] tasks, Map<Character,char[]> depedencies)
  {
    Stack<Character> stack = new Stack<>();
    Set<Character> results = new LinkedHashSet<>();

    for(char task: tasks)
    {
      stack.push(task);
      char[] currentDepedencies = depedencies.get(Character.valueOf(task));
      if(currentDepedencies!=null)
      {
        for(Character depedency:currentDepedencies)
        {
          stack.push(depedency);
        }
      }
    }

    while(!stack.empty())
    {
      results.add(stack.pop());
    }
    return results;
  }
}
