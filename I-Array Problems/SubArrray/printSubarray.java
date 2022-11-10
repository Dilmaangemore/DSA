/*
Take an array of size n from the user. Array contains only the unique elements. You need to print all the subarrays of the array where each subarray should be printed in a line.

Input Format

An Integer input n representing size of array
N integer input representing elements of an array
All the numbers of array are unique.
Constraints

1<=N<=100
-10^6<=arr[i]<=10^6
Output Format

Print all subarrays
Sample Input 0

5
1 2 3 4 5
Sample Output 0

1 
1 2 
1 2 3 
1 2 3 4 
1 2 3 4 5 
2 
2 3 
2 3 4 
2 3 4 5 
3 
3 4 
3 4 5 
4 
4 5 
5 
Explanation 0

array of length n has n*(n+1)/2 subarrays. here n = 5 and it has 15 subarrays.
*/

import java.io.*;
import java.util.*;

public class Solution {
static void subarray(int [] arr){
    for(int i=0; i<arr.length; i++){
        for(int j=i; j<arr.length; j++){
        // System.out.print(arr[j]+" ");
            for(int k=i; k<=j; k++){
                System.out.print(arr[k]+" "); 
               
            }
             System.out.println();
        }
   
      }
}
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]= sc.nextInt();
        }
        
    subarray(arr);
    }
}