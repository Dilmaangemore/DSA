import java.io.*;
import java.util.*;

public class Solution {

    static int sum(int [] arr, int n){

        int sum =0;
        for(int i=0; i<n; i++){

            sum+=arr[i];
        }
        return sum;
    }
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr =   new int[n];
       for(int i=0; i<n; i++){
           arr[i]= sc.nextInt();
         
       } 
        
        System.out.println(sum(arr, n));
    
    }
}