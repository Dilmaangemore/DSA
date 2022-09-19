/*
Take n as an integer input.

Then declare an array named master array of size n which stores n integer elements.

Then you will be given n integer elements, store these elements in the array starting from the 0th index.

Note that this master array consists of only 6's, 7's and 9's.

Sort the master array such that all the 9's should come first, then all the 6's should come, and then all the 7's should come.

Input Format

In the first line, n will given as an integer input,

Then n integer elements will be given in n separate lines.

Constraints

1<=n<=2^4

master[i] can only be 6 or 7 or 9.

Output Format

Print the elements of the master array after sorting.

Sample Input 0

6
7 9 6 9 7 6
Sample Output 0

9 9 6 6 7 7
Sample Input 1

7
9 9 9 7 7 6 6 
Sample Output 1

9 9 9 6 6 7 7 
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
        
        Arrays.sort(arr);
        for(int i =0; i<arr.length; i++){
        
            if(arr[i] == 9){
                System.out.print(arr[i]+" ");
            }
        }
         for(int i =0; i<arr.length; i++){
        
            if(arr[i] == 6){
                System.out.print(arr[i]+" ");
            }
        }
         for(int i =0; i<arr.length; i++){
        
            if(arr[i] == 7){
                System.out.print(arr[i]+" ");
            }
        }
        
    }
}        
                 