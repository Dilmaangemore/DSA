/*Print the matrix column wise such that we print the alternate columns of the matrix starting from the first column.

Input Format

First line contains, m and n depicting the size of first matrix.
m*n Integer values, depicting all the elements of matrix.
Constraints

1 <= m1 and n1 <=1000
-1000<=mat[i][j]<=1000
Output Format

Print the matrix column wise alternate

Sample Input 0

3
3
49 22 16
71 78 23
89 24 61
Sample Output 0

49 71 89   
16 23 61   
Explanation 0

we will print column 1 and 3 becuase we skip 2. And then print them as rows.*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int rows = scn.nextInt();
        int cols = scn.nextInt();
        
        int[][] mat = new int[rows][cols];
        
        for(int row = 0; row < rows; row++){
            for(int col = 0; col < cols; col++){
                mat[row][col] = scn.nextInt();
            }
        }
        
        
        for(int col = 0; col < cols; col=col+2){
            for(int row = 0; row < rows; row++){
                System.out.print(mat[row][col] + " ");
            }
            System.out.println();
        }
    }
}