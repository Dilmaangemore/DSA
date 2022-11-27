

import java.io.*;
import java.util.*;

public class Solution {
public static void convert1Dto2D(int [] arr, int p, int q){
    
    int [][] mat= new int[p][q];
    int k =0;
    for(int i=0; i<p; i++){
        for(int j=0; j<q; j++){
           System.out.print((mat[i][j]=arr[k]) +" ");
            k++;
        }
        System.out.println();
    }
}
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       
        
        int [] arr= new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
         int p = sc.nextInt();
        int q = sc.nextInt();
        
        convert1Dto2D(arr, p, q);
    }
}