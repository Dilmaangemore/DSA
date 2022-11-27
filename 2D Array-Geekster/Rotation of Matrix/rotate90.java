/*Take a square matrix of size n*n as input, and rotate the matrix by 90 degree.

Input Format

Integer N depicting the size of matrix.
N*N Integer values, depicting all the elements of matrix.
Constraints

1<=N<=1000
1<=mat[i][j]<=1000
Output Format

A Square matrix of size n*n.

Sample Input 0

3 
1 2 3
4 5 6
7 8 9
Sample Output 0

7 4 1 
8 5 2 
9 6 3 */
import java.io.*;
import java.util.*;

public class Solution {
public static void transpose(int [][] mat, int n){
    
    for(int i = 0; i<n; i++){
        
        for(int j=0; j<i; j++){
           int temp = mat[i][j];
            mat[i][j]=mat[j][i];
            mat[j][i]=temp;
        }
        
    }
}
    public static void rotate(int[][] mat, int n){
        
        
        for(int i=0; i<n; i++){
            int left =0; 
        int right = n-1;
            while(left<right){
                int temp=mat[i][left];
                mat[i][left]=mat[i][right];
                mat[i][right]=temp;
                left++; right--;
            }
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
        transpose(mat, n);
        rotate(mat, n);
        
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }
}