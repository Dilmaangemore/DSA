import java.io.*;
import java.util.*;

public class Solution {

    static int getCount(int[] arr, int target){
        int count =0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==target)count++;
        }
        return count;
    }
    public static int maxFrequency(int [] arr){
        int value =0;
        int maxFreq=0;
        for(int i=0; i<arr.length; i++){

            int currentFrequency= getCount(arr, arr[i]);
            if(currentFrequency>maxFreq){
                value=arr[i];
              maxFreq=currentFrequency;
            }
            
        }
        return value;
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr= new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(maxFrequency(arr));
    }
}