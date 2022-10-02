/*
Then take n*n elements as integer inputs and fill the matrix sequentially in a row wise manner starting from the 0th row.

Sample Input 0

7
2 1 2 4 5 1 2
3 4 5 1 2 2 3
6 7 8 2 4 4 5
5 6 7 8 9 7 8
2 3 4 7 8 1 2
2 3 4 5 6 7 9
1 2 3 4 5 5 6

Sample Output 0

2                             2    
     4                   2         
          8         4              
               8                   
          4         8              
     3                   7         
1                             6


*Sample Input 1

6
2 1 2 4 5 1 
3 4 5 1 2 2 
6 7 8 2 4 4 
5 6 7 8 9 7 
2 3 4 7 8 1 
2 3 4 5 6 7 

Sample Output 1

2                        1    
     4              2         
          8    2              
          7    8              
     3              8         
2                        7/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
    
        
        int [][] mat = new int[n][n];
        for(int i=0; i<n; i++){
            for(int j =0; j<n; j++){
                mat[i][j]=sc.nextInt();
            }
        }
        
        for(int i=0; i<n; i++){
            for(int j =0; j<n; j++){
              if(i==j|| i+j==n-1){
                  System.out.print(mat[i][j]+"\t");
              }else{
                  System.out.print("  ");
              }
            }
            System.out.println();
        }
    }
}