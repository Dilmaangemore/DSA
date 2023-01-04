import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        
        Scanner scn = new Scanner(System.in);
        int size = scn.nextInt();
        
        for(int idx = 0; idx < size; idx++){
            int val = scn.nextInt();
            arr.add(val);
        }
        
        // For Loop: Backward Traveral: Indices
        for(int idx = arr.size() - 1; idx >= 0; idx--){
            System.out.print(arr.get(idx) + " ");
        }
        
        System.out.println();
        
        Collections.reverse(arr); 
        // Reverse The ArrayList: Two Pointer
        
        // For Each Loop: Forward Traversal: Values
        for(int val : arr){
            System.out.print(val + " ");
        }
    }
}