/*
Print the lower triangle of a matrix.

Input Format

First line contains, m and n depicting the size of first matrix.
m*n Integer values, depicting all the elements of matrix.
Constraints

1<=m and n<=1000

-1000<=mat[i][j]<=1000

Output Format

Print the Lower triangular matrix

Sample Input 0

3
3
7 9 9
0 2 5
2 9 9
Sample Output 0

7 0 0 
0 2 0 
2 9 9 
*/

 import java.io.*;
import java.util.*;

public class Solution {
public static void lowerTraingularMatrix(int [][] arr, int row, int col){
    for(int i=0; i<row; i++){
        
        for(int j=0; j<col; j++){
            if(j<=i){
                System.out.print(arr[i][j]+" ");
            }else{
               System.out.print(0+" "); 
            }
        }
       
           System.out.println();    
            
        }
       
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
         Scanner sc =new Scanner(System.in);
        int row = sc.nextInt();
        int col= sc.nextInt();
        int[][] arr= new int[row][col];
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                arr[i][j]=sc.nextInt();
            }
        }
        lowerTraingularMatrix(arr, row, col);
    }
}