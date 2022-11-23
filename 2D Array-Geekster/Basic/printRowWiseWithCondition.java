/*Print the matrix row wise such that the even row is traversed from left to right and odd row is traversed from right to left.

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

3 1 2 
2 0 3 
4 5 4 
*/

import java.io.*;
import java.util.*;

public class Solution {
static void rowWiseWithCondition(int [][] arr, int row, int col){
    for(int i=0; i<row; i++){
        if(i%2 ==0)
        for(int j=0; j<col; j++){
            System.out.print(arr[i][j]+" ");
        }
         else
             for(int j=col-1; j>=0; j--){
                 System.out.print(arr[i][j]+" ");
             }
            
          System.out.println();                 
    }
}
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc =new Scanner(System.in);
        int row = sc.nextInt();
        int col= sc.nextInt();
        int[][] arr= new int[row][col];
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                arr[i][j]=sc.nextInt();
            }
        }
        rowWiseWithCondition(arr, row, col);
    }
}