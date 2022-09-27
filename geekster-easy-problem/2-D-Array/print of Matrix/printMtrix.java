import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int rows= sc.nextInt();
        int cols = sc.nextInt();
        int [][] mat= new int[rows][cols];
        for(int row =0; row<rows; row++){
            for(int col =0; col<cols; col++){
                mat[row][col]=sc.nextInt();
            }
        }
        for(int row =0; row<rows; row++){
            for(int col =0; col<cols; col++){
                System.out.print(mat[row][col]+" ");
            }
            System.out.println();
        }
    }
}

/**
Sample Input 0

4
6
2 3 8 7 0 4
0 7 6 7 3 5
0 0 8 1 0 8
9 1 9 5 3 0


Your Output (stdout)

2 3 8 7 0 4 
0 7 6 7 3 5 
0 0 8 1 0 8 
9 1 9 5 3 0 
*/