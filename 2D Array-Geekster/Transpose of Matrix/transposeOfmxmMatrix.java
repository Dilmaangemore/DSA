/*Write a program to find the transpose of a square matrix of size N*N. Transpose of a matrix is obtained by changing rows to columns and columns to rows.

Input Format

Take n as no of rows and columns of array.

Constraints

1 <= N <= 100
-10^3 <= mat[i][j] <= 10^3
Output Format

Return a 2-d array which is transpose of given array

Sample Input 0

4
1 1 1 1
2 2 2 2
3 3 3 3
4 4 4 4
Sample Output 0

1 2 3 4
1 2 3 4
1 2 3 4
1 2 3 4
Sample Input 1

3
1 2 3
1 2 3
1 2 3
Sample Output 1

1 1 1 
2 2 2 
3 3 3 */
import java.io.*;
import java.util.*;

public class Solution {
public static void transposeMatrix(int [][]mat, int row){
   
    for(int i=0; i<row; i++){
            for(int j=i; j<row; j++){
              int temp= mat[i][j];
               mat[i][j]=mat[j][i];
               mat[j][i]=temp; 
            }
        }
    
 
}
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc= new Scanner(System.in);
        int row = sc.nextInt();// row = col
       
        int [][] mat = new int[row][row];
        for(int i=0; i<row; i++){
            for(int j=0; j<row; j++){
                mat[i][j]=sc.nextInt();
            }
        }
       transposeMatrix(mat, row);
        
         for(int i=0; i<row; i++){
            for(int j=0; j<row; j++){
                System.out.print(mat[i][j]+" ");
            }
             System.out.println();
        }
    }
}