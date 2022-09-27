import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int [][] mat= new int[rows][cols];
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                mat[i][j]= sc.nextInt();
            }
        }
         for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                if(i<=j){
                     System.out.print(mat[i][j]+" ");
                    
                    
                }else{
                    System.out.print(0+" ");
                }
                
            }
             System.out.println();
        }
    }
}