import java.io.*;
import java.util.*;

public class Solution {
    public static boolean isMissing(int[] arr, int target){
        int countOfOccurences = 0;
        for(int idx = 0; idx < arr.length; idx++){
            if(arr[idx] == target) countOfOccurences++;
           
        }
        
        if(countOfOccurences == 0) return true;
        return false;
    }
    
    public static boolean isRepeating(int[] arr, int target){
        int countOfOccurences = 0;
        for(int idx = 0; idx < arr.length; idx++){
            if(arr[idx] == target) countOfOccurences++;
        }
        
        if(countOfOccurences == 2) return true;
        return false;
    }
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int size = scn.nextInt();
        
        int[] arr = new int[size];
        for(int idx = 0; idx < arr.length; idx++){
            arr[idx] = scn.nextInt();
        }
        
        for(int idx = 1; idx <= size; idx++){
            if(isRepeating(arr, idx) == true) System.out.println(idx);
        }
        
        for(int idx = 1; idx <= size; idx++){
            if(isMissing(arr, idx) == true) System.out.println(idx);
        }
        
    }
}