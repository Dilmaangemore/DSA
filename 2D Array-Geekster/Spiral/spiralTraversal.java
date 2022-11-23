/****Print all the elements of a m*n matrix in the spiral form as shown below. Note: Start traversing from the – (0th row and 0th column)

Input Format

First line contains, m and n depicting the size of first matrix.
m*n Integer values, depicting all the elements of matrix.
Constraints

1 <= m and n <=1000

-1000<=mat[i][j]<=1000


output format:
3-> 6-> 9-> 9
            v
1 >8 > 6    6      
^           v|
3 <-3 <-7<- 1

Sample Input 0

3
4
3 6 9 9
1 8 6 6
3 3 7 1
Sample Output 0

3   6   9   9   6   1   7   3   3   1   8   6   
*/
import java.io.*;
import java.util.*;

public class Solution {
    public static void spiralMatrix(int[][] mat, int rows, int cols){
        int firstRow = 0, lastRow = rows - 1;
        int firstCol = 0, lastCol = cols - 1;
        
        while(firstRow <= lastRow && firstCol <= lastCol){
            // TOP WALL: Left to Right
            for(int col = firstCol; col <= lastCol; col++){
                System.out.print(mat[firstRow][col] + "   ");
            }

            firstRow++; // SKIP THE TOP RIGHT CORNER
            
            if(firstRow > lastRow || firstCol > lastCol) break;

            // RIGHT WALL: Top to Bottom
            for(int row = firstRow; row <= lastRow; row++){
                System.out.print(mat[row][lastCol] + "   ");
            }

            lastCol--; // SKIP THE BOTTOM RIGHT CORNER
            
            if(firstRow > lastRow || firstCol > lastCol) break;

            // BOTTOM WALL: Right to Left
            for(int col = lastCol; col >= firstCol; col--){
                System.out.print(mat[lastRow][col] + "   ");
            }

            lastRow--; // SKIP THE BOTTOM LEFT CORNER
            
            if(firstRow > lastRow || firstCol > lastCol) break;

            // LEFT WALL: Bottom to Top
            for(int row = lastRow; row >= firstRow; row--){
                System.out.print(mat[row][firstCol] + "   ");
            }

            firstCol++; // SKIP THE TOP LEFT CORNER
        }
    }
    
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int rows = scn.nextInt();
        int cols = scn.nextInt();
        
        int[][] mat = new int[rows][cols];
        for(int row=0; row<rows; row++){
            for(int col=0; col<cols; col++){
                mat[row][col] = scn.nextInt();
            }
        }
        
        spiralMatrix(mat, rows, cols);
    }
}