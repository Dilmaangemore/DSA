/*Write a Java program that takes in a list of numbers and returns only those numbers that repeat in the list along with the count of repetitions as a key-value pair. Use appropriate data structure.

Input Format

First line of input contains integer n denoting the size of input. Next line of input contains n space separated integers denoting the elements of list.

Constraints

1<=n<=10^4

Output Format

Print repeated elements with their frequency as key-value pair

Sample Input 0

6
1 2 2 3 3 3
Sample Output 0

2->2
3->3
Sample Input 1

5
1 1 1 2 2
Sample Output 1

1->3
2->2*/

import java.io.*;
import java.util.*;

public class Solution {
static HashMap<Integer, Integer> findRepeating(int []arr, int size){
    
    
     HashMap<Integer,Integer> frequency = new HashMap<Integer,Integer>();
    
      // Loop to store the frequency of
    // elements of array
    for(int i = 0; i < size; i++)
    {
        if(frequency.containsKey(arr[i]))
        {
            frequency.put(arr[i], frequency.get(arr[i]) + 1);
        }
        else
        {
            frequency.put(arr[i], 1);
        }
    }
    return frequency;
}
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
     
         Scanner scn = new Scanner(System.in);
        
         int n = scn.nextInt();
        int[] arr= new int[n];
        for(int i=0; i<n; i++){
            arr[i]=scn.nextInt();
        }
           HashMap<Integer,Integer> frequency = findRepeating(arr, n);
        for (Map.Entry<Integer,Integer> entry : frequency.entrySet())
        if (entry.getValue() > 1)
            System.out.println(entry.getKey()+ "->"+entry.getValue());
    }
}
