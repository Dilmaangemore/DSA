/*
There are some children in park playing with sticks, represented by an array. They have some N number of sticks of different lengths. Now they want to align them in a particular order so that initially length of sticks increases, then decreases. Help the children in doing so.

Take an array of size N as input.

If number of sticks are odd ((2*N)+1), then align N sticks in increasing order and remaining N+1 in decreasing order.
If number of sticks are even (2*N), then align N sticks in increasing order and remaining N in decreasing order.
Note: You should not use inbuilt sorting function.

Input Format

An integer N, which is the size of the array.
N integers, depicting the elements of the array.
Constraints

2<=N<=10^4
1<=arr[i]<=10^4
Output Format

An array of size N.

Sample Input 0

9
2 5 6 3 4 1 8 9 7
Sample Output 0

1 2 3 4 9 8 7 6 5 
Explanation 0

Here, 4 elements are increasing in nature and remaining 5 are decreasing in nature.

Sample Input 1

10 
5 2 3 6 4 1 8 9 7 10
Sample Output 1

1 2 3 4 5 10 9 8 7 6
Explanation 1

Here, 5 elements are increasing in nature and remaining 5 are decreasing in nature
*/

import java.io.*;
import java.util.*;

public class Solution {
static void halfIncDec(int [] arr){
    Arrays.sort(arr);
    
    int left = arr.length/2;
    int right = arr.length-1;
    
    while(left < right){
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right]= temp;
        
        left++;
            right--;
    }
}
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
            
        }
        halfIncDec(arr);
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+ " ");
        }
        
    }
}