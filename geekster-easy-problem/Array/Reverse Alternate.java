/*
Print Reverse Alternate

Given an integer n, the task is to define an array arr[] of size n & Print only the alternate elements in reverse order staring from the nth index, last element i.e,

print elements at index ->(n-1), (n-3), (n-5), (n-7)...... and so on till the end.

Note :- n is the size of the array and last element of the array is at index, n - 1.

Input Format

An integer n, which is the size of the array arr[]
n integers each in a new line, depicting the elements of the array arr[]
Constraints

0 <= arr.length <= 1000
0 <= arr[i] <= 1000
Output Format

Multiple line of outputs

Alternate elements of the array in reverse order with each in new line
Sample Input 0

5
1
3
4
5
2
Sample Output 0

2
4
1
Explanation 0

Since the array is of length 5 and it's elements are {1, 3, 4, 5, 2} therefore, output will be :- 2 4 1 , with each integer in one line, as this represents alternate elements in reverse order i.e elements at index n-1, n-3 & n-5.
*/


import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int [] arr = new int[size];
        for(int i=0; i<size; i++){
            arr[i]= sc.nextInt();
        }
        for(int i= arr.length-1; i>=0; i=i-2){
            System.out.println(arr[i]);
        }
        
    
   
    }
}