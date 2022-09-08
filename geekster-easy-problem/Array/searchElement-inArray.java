/*
Find an element 1

Given an array, the task is to write a Java program to check whether a specific element is present in this Array or not.

Input Format

 first line n 
 second line is n element 
 element that will be searched 
Constraints

1

Output Format

True or False

Sample Input 0

5
1 2 3 4 5
3
Sample Output 0

True
*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] a= new int[n];
        for(int i=0; i<n; i++){

            a[i]=sc.nextInt();
        }
        int find = sc.nextInt();
        
        
       if(searchElement(a,find)){
           System.out.println("True");
       }else{
           System.out.println("False");
       }
    }
    static boolean searchElement(int [] a, int find){
        
        for(int i=0; i<a.length; i++){
           if(a[i] == find) return true;
        }
        return false;
    }
}