/*
Take n as an integer input.

Then make a matrix named mat having n rows and n columns which can store only integer type values.

Then take n*n elements as integer inputs and fill the matrix sequentially in a row wise manner starting from the 0th row.

Then check if the given matrix is in shape or not.

Print true if the matrix is in M shape and print false otherwise.

Note: The value of n will only be odd.

Input Format

In the first line n will be given

Then the n*n elements of the matrix will be given.

Constraints

1<=n<=100

mat[i][j] can only be 0 or 1.

Output Format

Print true or false accordingly.

Sample Input 0

5
1 0 0 0 1
1 1 0 1 1
1 0 1 0 1
1 0 0 0 1
1 0 0 0 1
Sample Output 0

true
Sample Input 1

5
1 0 0 0 1
1 1 0 1 1
1 0 0 0 1
1 0 0 0 1
1 0 0 0 1
Sample Output 1

false
Sample Input 2

7
1 0 0 0 0 0 1
1 1 0 0 0 1 1
1 0 1 0 1 0 1
1 0 0 1 0 0 1
1 0 0 0 0 0 1 
1 0 0 0 0 0 1 
1 0 0 0 0 0 1 
Sample Output 2

true
Sample Input 3

7
1 0 0 0 0 0 1
1 1 0 0 0 1 1
1 0 1 0 1 0 1
1 0 0 1 0 0 1
1 0 0 0 1 0 1 
1 0 0 0 0 0 1 
1 0 0 0 0 0 1 
Sample Output 3

false
Sample Input 4

7
1 0 0 0 0 0 1
1 1 0 0 0 1 1
1 0 1 0 1 0 1
1 0 0 1 0 0 1
1 0 0 1 1 0 1 
1 0 1 0 0 0 1 
1 0 0 0 0 0 1 
Sample Output 4

false
Sample Input 5

7
1 0 0 0 0 0 1
1 1 0 0 0 1 1
1 0 1 0 1 0 1
1 0 0 1 0 0 1
1 1 0 0 0 1 1 
1 0 0 0 0 0 1 
1 0 0 0 0 0 1
Sample Output 5

false
Sample Input 6

7
1 0 0 0 0 0 1
1 1 0 0 0 1 1
1 0 1 0 1 0 1
1 0 0 1 0 0 1
1 0 0 0 0 0 0 
1 0 0 0 0 0 0 
1 0 0 0 0 0 1 
Sample Output 6

false
*/


// wrong code

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [][] mat = new int[n][n];
        for(int i=0; i<n; i++){
            
                for(int j=0; j<n; j++){
                    mat[i][i]=sc.nextInt();
                }
            }
            
         for(int i=0; i<n; i++){
            
                for(int j=0; j<n; j++){
                   if(j==0 || j==n-1 || (i==j && i<=n/2)){
                       
                           
                      //System.out.print(1);
                       
                      
                   }else{
                     //  System.out.print(false);
                   }
                }
        
            }
         System.out.print(false);
    }
}