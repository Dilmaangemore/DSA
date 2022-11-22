
/*
You are given a 2D matrix , your task is print the alternate rows of the matrix starting from the 0th row.

Input Format

First line contains, m and n depicting the size of matrix.
m*n Integer values, depicting all the elements of matrix.
Constraints

1 <= m and n <=1000
-1000<=mat[i][j]<=1000
Output Format

Print the alternate row.

Sample Input 0

4
6
2 3 8 7 0 4
0 7 6 7 3 5
0 0 8 1 0 8
9 1 9 5 3 0
Sample Output 0

2 3 8 7 0 4 
0 0 8 1 0 8 
Explanation 0

Print the alternate row i.e 0th row and 2nd row in the above example.
*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int rows= sc.nextInt();
        int cols = sc.nextInt();
        int [][] mat= new int[rows][cols];
        for(int row =0; row<rows; row++){
            for(int col =0; col<cols; col++){
                mat[row][col]=sc.nextInt();
            }
        }
        for(int row =0; row<rows; row=row+2){
            for(int col =0; col<cols; col++){
                System.out.print(mat[row][col]+" ");
            }
            System.out.println();
        }
    }
}