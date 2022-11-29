/*Check whether all rows of a matrix are circular rotations of each other.

Given a matrix of n*n size, the task is to find whether all rows are circular rotations of each other or not.

Input Format

N as integer Input
then N *N elements as Elements of matrix
Constraints

1<=N<=1000
0<=mat[i][j]<=1000
Output Format

"YES" OR "NO"

Sample Input 0

3
1 2 3 
3 1 2 
2 3 1
Sample Output 0

YES
Explanation 0

All rows are rotated permutation of each other.

Sample Input 1

3
1 2 3
3 2 1
1 3 2
Sample Output 1

NO*/
import java.io.*;
import java.util.*;

public class Solution {
    public static boolean compare(int[][] mat, int row1, int row2){
         for(int col = 0; col < mat[0].length; col++){
             if(mat[row1][col] != mat[row2][col]) return false;
         }
         return true;
    }
    
    public static void rotate(int[][] mat, int row){
        int temp = mat[row][mat[0].length - 1];
        for(int col = mat[0].length - 1; col > 0; col--){
            mat[row][col] = mat[row][col - 1];
        }
        mat[row][0] = temp;
    }
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        int[][] mat = new int[n][n];
        for(int row = 0; row < n; row++){
            for(int col = 0; col < n; col++){
                mat[row][col] = scn.nextInt();
            }
        }
        
        for(int row = 1; row < n; row++){
            boolean equal = false;
            for(int k = 0; k <= n; k++){
                rotate(mat, row);
                if(compare(mat, 0, row) == true){
                    equal = true;
                    break;
                }
            }
            if(equal == false){
                System.out.println("NO");
                return;
            }
        }
        
        System.out.println("YES");
    }
}