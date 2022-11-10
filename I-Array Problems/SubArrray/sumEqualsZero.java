/*
Take an array of size n from the user. Array contains both positive and negative integers. Print “true” if the array contains a subarray whose sum is zero, otherwise print “false”.

Input Format

An Integer input n representing size of array

N integer input representing elements of an array

Constraints

1<=n<=9

-10^6<=n<=10^6

Output Format

True/False

Sample Input 0

4
-1
1
2
3
Sample Output 0

true
Explanation 0

1 + (-1) = 0
*/

import java.io.*;
import java.util.*;

public class Solution {
public static boolean sumEuqalZero(int [] arr){
    for(int i=0; i<arr.length; i++){
        for(int j=0; j<arr.length; j++){
            if(arr[i] + arr[j] == 0){

                return true;
            }
        }
    }
    return false;
}
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr= new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(sumEuqalZero(arr));
    }
}