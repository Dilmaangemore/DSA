/**
Input Format

First line contains, m and n depicting the size of first matrix.
m*n Integer values, depicting all the elements of matrix.

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
**/
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int [][] mat = new int[rows][cols];
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                mat[i][j]= sc.nextInt();
            }
        }
        for(int j=0; j<cols; j++){
            if(j % 2 ==0){
                for(int i=0; i<rows; i++){
                    System.out.print(mat[i][j]+" ");
                }
            }else
            {
                for(int i=rows-1; i>=0; i--){
                    System.out.print(mat[i][j]+" ");
                }
            }
            System.out.println();
        }
    }
    
}