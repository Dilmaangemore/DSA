/*
Count number of elements greater than their previous in array


Then declare an array of size n which stores n integer elements.

Then you will be given n integer elements, store these elements in the array starting from the 0th index.

Then print the count of those elements in the array which are greater than their element on their left.

Note: Don't count the element at the 0th index, as it can't be compared with any left just to its left.

Input Format

In the first line, n will given as an integer input,

Then n integer elements will be given in n separate lines.

Constraints

1<=n<=200

-2^10<=Each integer element in the array<=2^10

Output Format

Print the count of elements greater than the element just to their left as an integer input.

Sample Input 0

4
-2
-3
10
30
Sample Output 0

2
Explanation 0

Initially the count is zero. When we check from the 1st index, we see that -3<-2, so count remains zero.

Then we check the 2nd index,we see that 10>-3, so we increment count by 1. So count becomes 1.

Then we check the 3rd index,we see that 30>10, so we increment count by 1. So count becomes 2.

In the end we print the final count that is 2.

Sample Input 1

3
10
20
30
Sample Output 1

2
Sample Input 2

3
-1
-2
-3
Sample Output 2

0
*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        int count =0;
        
        for(int i=0; i<arr.length-1; i++){

            if(arr[i]<arr[i+1]){

              count+=1;
            }
           
        }
        System.out.println(count);
    }
}