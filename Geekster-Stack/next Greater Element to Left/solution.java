
import java.io.*;
import java.util.*;

public class Solution {
    public static int[] nextGreaterElement(int[] arr){
        Stack<Integer> stk = new Stack<>();
        int[] res = new int[arr.length];
        
        for(int idx = 0; idx < arr.length; idx++){
            // Smaller or Equal Elements in left should be popped
            while(stk.size() > 0 && stk.peek() <= arr[idx]) 
                stk.pop();
            
            // Finding the Next Greater Element
            res[idx] = (stk.size() == 0) ? -1 : stk.peek();
            
            // Push the current element
            stk.push(arr[idx]);
        }
        
        return res;
    }
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        
        for(int idx = 0; idx < n; idx++) 
            arr[idx] = scn.nextInt();
        
        int[] res = nextGreaterElement(arr);
        for(int val: res) System.out.print(val + " ");
    }
}
  