/*Interchange elements of the first and last row of a matrix.

Input Format

First line contains, m and n depicting the size of first matrix.
m*n Integer values, depicting all the elements of matrix.
Constraints

1<=m and n<=1000

-1000<=mat[i][j]<=1000

Output Format

Print the matrix after interchanging the row

Sample Input 0

3
3
8 1 0
9 9 6
6 6 4
Sample Output 0

6 6 4
9 9 6
8 1 0*/

import java.io.*;
import java.util.*;

public class Solution {
public static void interchangeRow(int[][] mat, int row, int col){
    
    for(int j=0; j<col; j++){
        int temp=mat[0][j];
        mat[0][j]=mat[row-1][j];
        mat[row-1][j]=temp;
        
    }
      
}
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc= new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int [][] mat = new int[row][col];
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                mat[i][j]=sc.nextInt();
            }
        }
        interchangeRow(mat, row, col);
        
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
      }
    }
}