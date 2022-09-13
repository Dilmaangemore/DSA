/*
Find the last index of the Key

You have given an array of element of length n . And followed by n element and you have given key . you need to find the last index of the key in the given array . If not find then return -1.

Input Format

   first line is n 
   second contains n integers 
   third line contains key 
Constraints

   1<n<=10^8
Output Format

  Integer as index
Sample Input 0

5
1 2 3 4 4
4
Sample Output 0

4
Explanation 0

 the last index of the key is 4
*/


import java.io.*;
import java.util.*;

public class Solution {
static int lastIndex(int [] arr, int n, int key){
    
    int count =0;
    int index = 0;
    for(int i=0; i<n; i++){

        if(arr[i]==key){
            index= i;
            count++;
        }
    }
    if(count>=1){
        return index;
    }
    return -1;
}
    public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr= new int[n];
        for(int i=0; i<n; i++){
            arr[i]= sc.nextInt();
        }
        int key = sc.nextInt();
        System.out.println(lastIndex(arr, n, key));
    }
}