/*
All same elements in array or not 2
Problem
Submissions
Leaderboard
Discussions
Take n as an integer input.

Then declare an array of size n which stores n integer elements.

Then you will be given n integer elements, store these elements in the array starting from the 0th index.

Print true if any one of the below conditions is true

Print true if all the elements are same in the array.

Print true if the array contains all the negative integers. To make it more clear for the 2nd condition: It doesn't matter if the elements are equal or not, but if they are all negative even then print true.)

If none of the above two conditions follow, then print false.

Input Format

In the first line, n will given as an integer input,

Then n integer elements will be given in n separate lines.

Constraints

1<=n<=200

-20000<=Each integer element in the array<=20000

Output Format

Print true or false accordingly

Sample Input 0

4
2
2
2
2
Sample Output 0

true
Sample Input 1

4
-2
-3
-5
-1
Sample Output 1

true
Sample Input 2

4
3
2
-1
10
Sample Output 2

false
*/


import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
         int [] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]= sc.nextInt();
        }
        
      boolean result =   sameElementsinArray(arr);
        System.out.println(result);
    }
    public static boolean sameElementsinArray(int [] arr){
        for(int i=0; i<arr.length; i++){
            if(arr[i]<0){
                return true;
            }else if(arr[i]==arr[i+1]){
                return true;
            }else{

                return false;
            }
        }
        return false;
    }
}