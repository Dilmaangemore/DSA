/*
Let's call an array arr a mountain if the following properties hold:

arr.length >= 3
There exists some i with 0 < i < arr.length - 1 such that: arr[0] < arr[1] < ... arr[i-1] < arr[i] > arr[i] > arr[i+1] > ... > arr[arr.length - 1]
Given an integer array arr that is guaranteed to be a mountain, return any i such that arr[0] < arr[1] < ... arr[i - 1] < arr[i] > arr[i + 1] > ... > arr[arr.length - 1].

Input Format

integer n , that is length of the array

Array of length n

Constraints

3 <= arr.length <= 104
0 <= arr[i] <= 106
arr is guaranteed to be a mountain array.
Output Format

Return the index , that form mountain

Sample Input 0

3
0 1 0 
Sample Output 0

1
Sample Input 1

3
0 2 1 0
Sample Output 1

1
*/


import java.io.*;
import java.util.*;

public class Solution {
static int findPeakIndex(int [] arr){
    for(int i=1; i<=arr.length; i++){
        if(arr[i] > arr[i-1] && arr[i]>arr[i+1])
            return i;
    }
    return -1;
}
    public static void main(String[] args) {
         
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr= new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(findPeakIndex(arr));
    }
}