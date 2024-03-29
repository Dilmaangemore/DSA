/*
Odd Indexes
Problem
Submissions
Leaderboard
Discussions
Take n as an integer input. Declare an array of size n that stores value of int data-type. Then take n integer inputs and store them in the array one by one.

Then print all the indexes of the array from the starting where the elements are odd

Input Format

A number n representing length of array. then n elements of array.

Constraints

1<=n<=1000000 1<=arr[index]<=1000000

Output Format

See the Description

Sample Input 0

5
1
2
3
4
5
Sample Output 0

0 2 4 
Explanation 0

As value 1, 3, 5 are odd. therefore we have printed their index values.
*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int [] arr= new int[size];
        for(int i=0; i<size; i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0; i<arr.length; i++){
            if(arr[i]%2 != 0){
                System.out.print(i+" ");
            }
        }
    }
}