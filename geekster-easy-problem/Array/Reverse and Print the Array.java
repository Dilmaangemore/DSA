/*
********************Reverse Print 

Take n as an integer input. Declare an array of size n that stores value of int data-type. Then take n integer inputs and store them in the array one by one.

Then print the elements of the array from the last index till the 0th index such that each element is printed one by one in each line

Input Format

a number n representing length of array. n elements of an array.

Constraints

1<=n<=1000000 1<=arr[i]<=1000000

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

5 4 3 2 1
Explanation 0

we print the last element first and then second last element, then last third element and so on.. till our first index in single line.
**************************/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int [] arr = new int[size];
        for(int i=0; i<size; i++){
            arr[i]=sc.nextInt();
        }
       reverse(arr, size);
    }
    public static void reverse(int [] arr, int size){
        
        for(int i= arr.length-1; i>=0; i--){
           System.out.print(arr[i]+" ");
        }
      
    }
}