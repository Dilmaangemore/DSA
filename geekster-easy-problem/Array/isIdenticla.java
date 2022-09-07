/*
Is Identical ?
Problem
Submissions
Leaderboard
Discussions
Take n as an integer input. Declare the first array of size n that stores values of int data-type. Then take n integer inputs and store them in the array one by one.

Declare the second array of size n that stores values of int data-type. Then take n integer inputs and store them in the array one by one.

Then print “true” if the arrays are equal and print “false” if the array is not equal.

Definition of Equal Arrays: Arrays whose size is equal and whose elements at the corresponding indexes are the same

Input Format

A number n denoting array1 size n numbers representing elements of array1 A number m denoting array2 size m numbers representing elements of array2

Constraints

1<=n,m<=1000000 1<=array1[i]<=1000000 1<=array2[i]<=1000000

Output Format

Boolean value

Sample Input 0

5
1 2 3 4 5
5 
1 2 3 4 5
Sample Output 0

true
Explanation 0

Since size of both arrays are same. And array1[i]==array2[i] is same for all 0<=i<=array.length.Therefore answer is true.
*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        
        int size1 = sc.nextInt();
        int [] arr1 = new int[size1];
        
        for(int i=0; i<size1; i++){
            arr1[i]= sc.nextInt();
        }
        
        // input of second array
        
        int size2 = sc.nextInt();
        int [] arr2 = new int[size2];
        
        for(int i=0; i<size2; i++){
            arr2[i] = sc.nextInt();
        }
        boolean res = isIdenticle(arr1, arr2);
        System.out.println(res);
    
    }
    public static boolean isIdenticle(int [] arr1, int [] arr2){
        if(arr1.length != arr2.length) return false;
        

        for(int i =0; i<arr1.length; i++){
            if(arr1[i] != arr2[i]) return false; 
            // at any i, if value is not identicle 
        }
        return true;
    }
}