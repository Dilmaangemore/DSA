/*Print the upper triangle of a matrix.

Input Format

First line contains, m and n depicting the size of first matrix.
m*n Integer values, depicting all the elements of matrix.
Constraints

1<=m and n<=1000

-1000<=mat[i][j]<=1000

Output Format

Print the upper triangular matrix

Sample Input 0

3
3
3 7 1
6 2 4
7 1 0
Sample Output 0

3 7 1 
0 2 4 
0 0 0 */
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int [][] mat= new int[rows][cols];
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                mat[i][j]= sc.nextInt();
            }
        }
         for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                if(i<=j){
                     System.out.print(mat[i][j]+" ");
                    
                    
                }else{
                    System.out.print(0+" ");
                }
                
            }
             System.out.println();
        }
    }
}