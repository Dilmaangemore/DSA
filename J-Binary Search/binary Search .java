import java.io.*;
import java.util.*;

public class Solution {
public static int BinarySearch(int [] arr, int target){
    
    int left =0, right = arr.length-1;
   
    while(left <=right){
         int mid =left+(right-left)/2;
        
        if(arr[mid]== target){
            return mid;
        }else if(arr[mid]<target){
            left = mid+1;
        }else {
            right = mid-1;
        }
    }
    return -1;
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
        
        int res = BinarySearch(arr, target);
        System.out.println(res);
    }
}