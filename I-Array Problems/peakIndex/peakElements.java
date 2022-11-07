/*
Take an array of size N as input.

Print all the peak elements present in the array.

arr[i] is a peak element only if arr[i-1] < arr[i] > arr[i+1].

Input Format

An integer N, which is the size of the array.
N integers, depicting the elements of the array.
Constraints

0 <= arr.length <= 1000
0 <= arr[i] <= 1000
Output Format

All the peak elements.

Sample Input 0

6
4 5 3 8 6 1
Sample Output 0

5 8
Explanation 0

5 is a peak element arr[0] < arr[1] > arr[2].

8 is a peak element arr[2] < arr[3] > arr[4].
*/

import java.io.*;
import java.util.*;

public class Solution {
static void peakElement(int [] arr){
    int peak =0;
    for(int i=1; i<arr.length-1; i++){
        if(arr[i] > arr[i-1] && arr[i] > arr[i+1]){
           System.out.print(arr[i] + " ");
        }
    }
    //return peak;
}
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        peakElement(arr);
        
      
//       for(int i=0; i<2; i++){
//           System.out.print(peak[i] +" ");
//       }
    }
  
}