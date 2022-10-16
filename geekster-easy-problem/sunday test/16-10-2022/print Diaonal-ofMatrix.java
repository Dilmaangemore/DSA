/*
Take n as an integer input.

Then make a matrix named mat having n rows and n columns which can store only integer type values.

Then take m*n elements as integer inputs and fill the matrix sequentially in a row wise manner starting from the 0th row.

Then print all the elements of the left main diagonal in the first line.

Then print all the elements of the right main diagonal in the second line.

Left Main Diagonal is from mat[0][0] to mat[n-1][n-1].

Right Main Diagonal is from mat[0][n-1] to mat[n-1][0].

Input Format

In the first line n will be given

Then the n*n elements of the matrix will be given.

Constraints

1<=n<=100

-2^31<=mat[i][j]<=2^31-1

Output Format

Print the output accordingly. Make sure to use tab to separate elements within the same line.

Sample Input 0

3
2 3 4
4 5 7
9 8 3
Sample Output 0

2    5    3    
4    5    9
Sample Input 1

5
2 3 4 6 7
4 5 7 9 2
9 8 2 4 5
8 3 4 1 1
1 2 3 4 5
Sample Output 1

2    5    2    1    5    
7    9    2    3    1
*/

import java.io.*;
import java.util.*;

public class Solution {

        static void printPrincipalDiagonal(int mat[][], int n)
    {
     
 
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
 
                // Condition for principal diagonal
                if (i == j) {
                    System.out.print(mat[i][j] + " ");
                }
            }
        }
        System.out.println("");
    }
    
      static void printSecondaryDiagonal(int mat[][], int n)
    {
        //System.out.print("Secondary Diagonal: ");
 
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
 
                // Condition for secondary diagonal
                if ((i + j) == (n - 1)) {
                    System.out.print(mat[i][j] + " ");
                }
            }
        }
        System.out.println("");
    }
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int  n = sc.nextInt();
        //int col = sc.nextInt();
        int [][] mat  = new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                mat[i][j]=sc.nextInt();
            }
        }
         printPrincipalDiagonal(mat, n);
       printSecondaryDiagonal(mat,  n);
    }
}