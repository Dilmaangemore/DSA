import java.io.*;
import java.util.*;

public class Solution {
public static void fourSum(int [] arr, int target){
    Arrays.sort(arr);
    boolean flag= false;
    if(arr.length<4){
        return;
    }
    
    for(int i=0; i<arr.length; i++){
         if(i>0 && arr[i-1] == arr[i]) continue;
        
        for(int j=i+1; j<arr.length; j++){
            if(j>i+1 && arr[j-1] == arr[j]) continue;
            
            for(int k= j+1; k<arr.length; k++){
            if(k>j+1 && arr[k-1] == arr[k]) continue;
                
                for(int l=k+1; l<arr.length; l++){
                if(l>k+1 && arr[l-1] == arr[l]) continue;    
                    
                    if(arr[i]+arr[j]+arr[k]+arr[l] == target){
                        flag = true;
                        System.out.println(arr[i]+" "+arr[j]+" "+arr[k]+" "+arr[l]);
                      
                        
                    }
                    
                }
            }
        }
    
    }
     if(!flag){
         System.out.println(-1);
         return;
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
        int target = sc.nextInt();
        fourSum(arr, target);
    }
}