/*
Given an array arr[] of N integers. Find the contiguous sub-array(containing at least one number) which has the maximum sum and print its sum.

Input Format

Line 1 : Take input n size of array
Line 2 : Take input array elements
Constraints

1 ≤ N ≤ 10^4
-10^4 ≤ A[i] ≤ 10^4
Output Format

Single Line Output (max sum of subarray)

Sample Input 0

5
-1 2 3 -2 1
Sample Output 0

5
Explanation 0

Max subarray sum is 5 which is {2,3}
*/


import java.io.*;
import java.util.*;

public class Solution {
public static int MaxSumSubArray(int [] arr){
    int maxSum =0;
      for(int i=0; i<arr.length; i++){
          
          int sum =0;
          for(int j=i+1; j<arr.length; j++){
             sum = sum+arr[j]; 
              if(maxSum<sum){
                  maxSum = sum;
              }
          }
      }
    return maxSum;
}
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]= sc.nextInt();
        }
      int re =  MaxSumSubArray(arr);
        System.out.println(re);
    }
}