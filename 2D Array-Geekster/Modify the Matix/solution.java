/*Given a boolean matrix mat[M][N] of size M X N, modify it such that if a matrix cell mat[i][j] is 1 (or true) then make all the cells of ith row and jth column as 1.

Input Format

First line contains, m and n depicting the size of first matrix.
m*n Integer values, depicting all the elements of matrix.
Constraints

1 <= m and n <=1000
0<=mat[i][j]<=1
Output Format

Print the matrix

Sample Input 0

3
4
1 0 0 1
0 0 1 0
0 0 0 0
Sample Output 0

1 1 1 1 
1 1 1 1 
1 0 1 1 */
import java.io.*;
import java.util.*;

public class Solution {
public static void modify(int [][] mat){
    
    boolean [] row = new boolean[mat.length];
    boolean [] col = new boolean[mat[0].length];
    
    for(int i=0; i<mat.length; i++){
        for(int j=0; j<mat[0].length; j++){
            if(mat[i][j]==1){
                row[i]=col[j]= true;
            }
        }
    }
    
    for(int i=0; i<mat.length; i++){
        for(int j=0; j<mat[0].length; j++){
            if(row[i] ==true || col[j] == true)
                mat[i][j]=1;
        }
    }
}
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int [][] mat = new int[m][n];
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                mat[i][j]=sc.nextInt();
            }
        }
        modify(mat);
        
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
               System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }
}