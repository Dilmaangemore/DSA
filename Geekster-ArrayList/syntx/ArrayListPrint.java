/*Declare an ArrayList as arr.
Take  as an integer input.
Take  elements inside the ArrayList.
Print the ArrayList from the starting using for loop and for-each loop.
Input Format

Single Integer .
 Integers
Constraints

1 <= N <=10^5 
 
Output Format

 Integers (using for loop)
 Integers (using for-each loop)
Sample Input 0

5
1 2 3 4 5
Sample Output 0

1 2 3 4 5 
1 2 3 4 5 
Explanation 0

 Arr= [1, 2, 3, 4, 5]*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        
        Scanner scn = new Scanner(System.in);
        int size = scn.nextInt();
        
        for(int idx = 0; idx < size; idx++){
            int val = scn.nextInt();
            arr.add(val);
        }
        
        // For Loop: Forward Traveral: Indices
        for(int idx = 0; idx < arr.size(); idx++){
            System.out.print(arr.get(idx) + " ");
        }
        
        System.out.println();
        
        // For Each Loop: Forward Traversal: Values
        for(int val : arr){
            System.out.print(val + " ");
        }
    }
}