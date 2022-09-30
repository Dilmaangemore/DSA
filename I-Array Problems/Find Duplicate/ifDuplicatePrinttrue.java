   static boolean FindDUplicate(int [] arr){

        for(int i=0; i<arr.length-1; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]==arr[j]) return true;
            }
        }
        return false;

     
     /**************************
               

                         ****************************/


     
import java.io.*;
import java.util.*;

public class Solution {
    public static int getFrequency(int[] arr, int target){
        int count = 0;
        for(int right = 0; right < arr.length; right++){
            if(arr[right] == target) count++;
        }
        return count;
    }
    
    public static boolean checkDuplicate(int[] arr){
        for(int left = 0; left < arr.length; left++){
            int count = getFrequency(arr, arr[left]);
            if(count > 1) return true;
        }
        
        return false;
    }
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int size = scn.nextInt();
        int[] arr = new int[size];
        
        for(int idx=0; idx<size; idx++){
            arr[idx] = scn.nextInt();
        }
        
        System.out.println(checkDuplicate(arr));
    }
}