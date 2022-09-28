import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr= new int[n];
        for(int i=0; i<n; i++){
            arr[i]= sc.nextInt();
        }
        int count =0;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(arr[i]<arr[j]){
                    count++;
                }
            }
            System.out.print(count+" ");
            count =0;
             
        }
       
    }
}
/*************************** Method -2 **************************

 *****************************************************/

import java.io.*;
import java.util.*;

public class Solution {
    public static int countGreater(int[] arr, int target){
        int count = 0;
        for(int idx = 0; idx < arr.length; idx++){
            if(arr[idx] > target) count++;
        }
        return count;
    }
    
    public static void solve(int[] arr){
        for(int idx = 0; idx < arr.length; idx++){
            int count = countGreater(arr, arr[idx]);
            System.out.print(count + " ");
        }
    }
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int size = scn.nextInt();
        int[] arr = new int[size];
        
        for(int idx = 0; idx < arr.length; idx++){
            arr[idx] = scn.nextInt();
        }
        
        solve(arr);
    }
}