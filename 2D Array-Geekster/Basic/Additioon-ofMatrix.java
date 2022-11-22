/*
You have to take two matrices as input.

First Matrix of size m1*n1.

Second Matrix of size m2*n2.

Print a matrix after addition of given matrices.

Note: Two Matrices can only be added only if m1=m2 and n1=n2.

Print -1 if addition is not possible.

Input Format

Integers m1 and n1 depicting the size of matrix.
m1*n1 Integer values, depicting all the elements of matrix.
Integers m2 and n2 depicting the size of matrix.
m2*n2 Integer values, depicting all the elements of matrix.
Constraints

1 <= m1,n1,m2,n2 <=1000
-1000<=mat[i][j]<=1000
Output Format

A Matrix of Integer values.

Sample Input 0

3 3
1 2 3 
4 5 6
7 8 9
3 3
9 8 7
6 5 4
3 2 1
Sample Output 0

10 10 10 
10 10 10 
10 10 10 
Sample Input 1

3 3
1 2 3 
4 5 6
7 8 9
2 3
9 8 7
6 5 4
Sample Output 1

-1
*/

import java.io.*;
import java.util.*;

public class Solution {
 static void AddTwoMatrix(int [][] arr1, int [][] arr2, int m1, int n1, int m2, int n2){
    
    if(m1 != m2 || n1 != n2){
        System.out.println(-1); // addition only possible in case m1=m2 //n1=n2
        return;
    }
    int [][] res = new int[m1][n1];
    for(int i=0; i<m1; i++){
        for(int j=0; j<n1; j++){
            res[i][j]=arr1[i][j]+arr2[i][j];
            System.out.print(res[i][j]+" ");
        }
        System.out.println();
    }
}
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int m1=sc.nextInt();
        int n1 = sc.nextInt();
    
        int[][] arr1 = new int[m1][n1];
        for(int i=0; i<m1; i++){
            for(int j=0; j<n1; j++){
                arr1[i][j]=sc.nextInt();
            }
        }
        
        // arr2
         int m2=sc.nextInt();
        int n2 = sc.nextInt();
    
        int[][] arr2 = new int[m2][n2];
        for(int i=0; i<m2; i++){
            for(int j=0; j<n2; j++){
                arr2[i][j]=sc.nextInt();
            }
        }
        AddTwoMatrix(arr1, arr2, m1, n1, m2, n2);
        
    }
}