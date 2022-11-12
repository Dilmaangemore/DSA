/*
Take the target as an integer input. Then print the indices of the two numbers such that they add to the target. Note that the array is not sorted here. Two pionter, answer must be unique.

Input Format

An integer number n representing size of array

N integer number representing elements of array.

An integer number k representing target.

Constraints

1 <= arr.length <= 100000
-1000000 <= arr[i] <= 1000000
-1000000 <= target <= 1000000
Output Format

All required pair in different lines.

Sample Input 0

6
-1 1 2 3 4 5
4
Sample Output 0

0 5
1 3
Explanation 0

-1 + 5 = 4 3 + 1 = 4
*/


import java.io.*;
import java.util.*;

public class Solution {
public static void targetSum(int [] arr, int target){
for(int i=0; i<arr.length; i++){
    for(int j=i+1; j<arr.length; j++){
        if(arr[j] + arr[i] == target){
            System.out.println(i+" "+j);
        }
    }
}    
}
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr= new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        int target = sc.nextInt();
        
        targetSum(arr, target);
    }
}