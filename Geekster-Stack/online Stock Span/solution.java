import java.io.*;
import java.util.*;

public class Solution {
    public static int[] stockSpan(int[] arr){
        Stack<Integer> stk = new Stack<>();
        int[] res = new int[arr.length];
        
        for(int idx = 0; idx < arr.length; idx++){
            // Pop the smaller or equal elements
            while(stk.size() > 0 && arr[stk.peek()] <= arr[idx]){
                stk.pop();
            }    
            
            // Form the resultant (stock span)
            res[idx] = (stk.size() == 0) ? idx + 1 : idx - stk.peek();
            
            // Push the current index
            stk.push(idx);
        }
        
        return res;
    }
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        
        for(int idx = 0; idx < n; idx++) 
            arr[idx] = scn.nextInt();
        
        int[] res = stockSpan(arr);
        for(int val: res) System.out.print(val + " ");
    }
}