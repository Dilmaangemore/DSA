/*Print the matrix column wise starting from the 0th column such that the even column is traversed from top to bottom and odd column is traversed from bottom to top.

Input Format

First line contains, m and n depicting the size of first matrix.
m*n Integer values, depicting all the elements of matrix.
Constraints

1<=m and n<=1000

-1000<=mat[i][j]<=1000

Output Format

Print the matrix

Sample Input 0

3
3
3 1 2 
3 0 2 
4 5 4 
Sample Output 0

3 3 4 
5 0 1 
2 2 4 
Explanation 0

Print the matrix according to given conditions.



    

*/
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
        
        for(int col = 0; col < cols; col++){
            if(col % 2 == 0){
                for(int row = 0; row < rows; row++){
                    System.out.print(mat[row][col] + " ");
                }
            } else {
                for(int row = rows - 1; row >= 0; row--){
                    System.out.print(mat[row][col] + " ");
                }
            }
            System.out.println();
        }
    }
}