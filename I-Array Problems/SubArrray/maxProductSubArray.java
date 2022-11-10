/*
Given an integer array nums, find the contiguous subarray within an array (containing at least one number) which has the largest product.

Note: According to testcases answer will not overflow long

Input Format

First line contain N, number of elements in an array. Second line contain array elements.

Constraints

1<=N<=100000
-100<=Ai<=100
Output Format

Print desired output

Sample Input 0

4
2 3 -2 4 
Sample Output 0

6
*/

import java.io.*;
import java.util.*;

public class Solution {
static int maxProductSubArray(int [] arr){
    int maxProduct=Integer.MIN_VALUE;
    for(int i=0; i<arr.length; i++){
        int p=1;
        for(int j=i; j<arr.length; j++){
          p=p*arr[j]; 
         maxProduct=  Math.max(maxProduct, p);
        }
    }
    return maxProduct;
}
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr= new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(maxProductSubArray(arr));
    }
}