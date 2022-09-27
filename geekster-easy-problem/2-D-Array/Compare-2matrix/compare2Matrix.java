import java.io.*;
import java.util.*;

public class Solution {
    public static String identical(int[][] mat1, int[][] mat2, int r1, int c1, int r2, int c2){
        if(r1 != r2 || c1 != c2) return "Not Same";
        
        for(int row = 0; row < r1; row++){
            for(int col = 0; col < c1; col++){
                if(mat1[row][col] != mat2[row][col]) 
                    return "Not Same";
            }
        }
        
        return "Same";
    }
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        // Inputting First Matrix
        int r1 = scn.nextInt();
        int c1 = scn.nextInt();
        int[][] mat1 = new int[r1][c1];
        for(int row=0; row<r1; row++){
            for(int col=0; col<c1; col++){
                mat1[row][col] = scn.nextInt();
            }
        }
        
        // Inputting Second Matrix
        int r2 = scn.nextInt();
        int c2 = scn.nextInt();
        int[][] mat2 = new int[r2][c2];
        for(int row=0; row<r2; row++){
            for(int col=0; col<c2; col++){
                mat2[row][col] = scn.nextInt();
            }
        }
        
        System.out.println(identical(mat1, mat2, r1, c1, r2, c2));
    }
}
/*
Sample Input 0

3 3
1 2 3 
4 5 6
7 8 9
3 3
1 2 3 
4 5 6
7 8 9
Sample Output 0

Same

Sample Input 1

3 3
1 2 3 
4 5 6
7 8 9
2 3
1 2 3 
4 5 6
Sample Output 1

Not Same
*/