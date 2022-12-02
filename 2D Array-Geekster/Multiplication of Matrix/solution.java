import java.io.*;
import java.util.*;

public class Solution {
    public static void matrixMultiplication(int[][] m1, int[][] m2){
        int r1 = m1.length, c1 = m1[0].length;
        int r2 = m2.length, c2 = m2[0].length;
        
        if(c1 != r2) {
            System.out.println(-1);
            // Matrix Multiplication Not Possible
            return;
        }
        
        int[][] m3 = new int[r1][c2];
        
        for(int row = 0; row < r1; row++){
            for(int col = 0; col < c2; col++){
                for(int k = 0; k < r2; k++){
                    m3[row][col] = m3[row][col] + (m1[row][k] * m2[k][col]);
                }
            }
        }
        
        for(int row = 0; row < r1; row++){
            for(int col = 0; col < c2; col++){
                System.out.print(m3[row][col] + " ");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int r1 = scn.nextInt();
        int c1 = scn.nextInt();
        
        int[][] m1 = new int[r1][c1];
        for(int row = 0; row < r1; row++){
            for(int col = 0; col < c1; col++){
                m1[row][col] = scn.nextInt();
            }
        }
        
        int r2 = scn.nextInt();
        int c2 = scn.nextInt();
        
        int[][] m2 = new int[r2][c2];
        for(int row = 0; row < r2; row++){
            for(int col = 0; col < c2; col++){
                m2[row][col] = scn.nextInt();
            }
        }
        
        matrixMultiplication(m1, m2);
    }
}

/* ******************************************* 88888888888
one test case failed

public class Solution {
public static void multiply(int [][] mat1, int [][] mat2, int m1, int n1, int m2, int n2){
    if(n1 != m2){
        System.out.println(-1);
    }
    //dimension of new materic = m1xn2
    
    int [][] mat3 = new int[m1][n2];
    
    for(int i=0; i<m1; i++){
        for(int j=0; j<n2; j++){
            for(int k =0; k<m2; k++){
                mat3[i][j]=mat3[i][j]+(mat1[i][k]*mat2[k][j]);
            }
        }
    }
    
    for(int i=0; i<mat3.length; i++){
        for(int j=0; j<mat3[0].length; j++){
            System.out.print(mat3[i][j]+" ");
        }
        System.out.println();
    }
}
  *
  */