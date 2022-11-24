/*Given a n*n matrix, reverse each row of the matrix, without taking any extra space and making the changes within the matrix. Print the final matrix such that all elements of the row are tab separated and are in one line.

Input Format

First line contains, n depicting the size of first matrix.
n*n Integer values, depicting all the elements of matrix.
Constraints

1 <= n <= 1000
-10^3 <= mat[i][j] <= 10^3
Output Format

Print the matrix after reversing each row

Sample Input 0

3
1 2 4
1 7 9
1 0 4
Sample Output 0

4    2    1    
9    7    1    
4    0    1 */


import java.io.*;
import java.util.*;

public class Solution {
public static void reverserow(int [][]mat, int m){
   
        for(int i=0; i<m; i++){
//             int left =0, right =m-1;
//             while(left<=right){
//                 int temp = mat[i][left];
//                 mat[i][left]=mat[i][right];
//                 mat[i][right]=temp;
                
//                 left++;
//                 right--;
//             }
            for(int j=m-1; j>=0; j--){
                System.out.print(mat[i][j]+" ");
            }
           System.out.println();
        }
    
}
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        
        // m=n
        int [][] mat = new int[m][m];//m=n
        for(int i=0; i<m; i++){
            for(int j=0; j<m; j++){
                mat[i][j]=sc.nextInt();
            }
        }
        reverserow(mat, m);
        // for(int i=0; i<m; i++){
        //     for(int j=0; j<m; j++){
        //       System.out.print(mat[i][j]+" ");
        //     }
        //     System.out.println();
        // }
    }
}