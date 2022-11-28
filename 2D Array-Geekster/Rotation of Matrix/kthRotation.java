/*Given a n*n matrix and an integer k. Shift the matrix elements row-wise by k. Print the final matrix such that all elements of the row in one line.

Input Format

Integer N depicting the size of matrix.
N*N Integer values, depicting all the elements of matrix.
Integer k depicting the shift the matrix row-wise by k.
Constraints

1<=N<=1000
1<=mat[i][j]<=1000
Output Format

Print the matrix after shifting.

Sample Input 0

3
0 5 9
2 7 5
2 3 3
2
Sample Output 0

9 0 5 
5 2 7 
3 2 3 
Explanation 0

print the matrix After shifting by 2*/

import java.io.*;
import java.util.*;

public class Solution {

public static void swap(int [][] mat, int row, int left, int right){
    while(left<right){
    int temp = mat[row][left];
    mat[row][left] = mat[row][right];
    mat[row][right]=temp;
    left++; right--;
    }  
}
    public static void shift(int [][] mat, int n, int k){
         k = k % n;
        k = n - k; 
        
        for(int row =0; row<n; row++){
            swap(mat, row, 0, n-k-1);
            swap(mat, row, n-k, n-1);
            swap(mat, row, 0, n-1);
        }
    }
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int [][] mat = new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
              mat[i][j]=sc.nextInt();  
            }
            
        }
        int k = sc.nextInt();
        
        shift(mat, n, k);
        for(int i=0;  i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }
}