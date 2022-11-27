

import java.io.*;
import java.util.*;

public class Solution {
public static int[] frequencyArr(int [] arr){
    
    int [] freq = new int[arr.length+1];
    for(int i=0; i<arr.length; i++){
        freq[arr[i]]++;
    }
    return freq;
}
    static int LuckyNo(int [] freq){
        
        for(int i=freq.length-1; i>=0; i--){
            if(freq[i]==i) return i;
        }
        return -1;
    }
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        int [] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        int [] freq = frequencyArr(arr);
        int res=LuckyNo(freq);
        System.out.println(res);
    }
}