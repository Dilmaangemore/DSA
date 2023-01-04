import java.io.*;
import java.util.*;

public class Solution {
public static TreeMap<Character, Integer> frequency(char [] arr){
    TreeMap<Character, Integer> freq= new TreeMap<>();
    
     for(char key : arr){
         if(freq.containsKey(key)){
             int of = freq.get(key);
             int nf = of+1;
             freq.put(key, nf);
         }else{
            freq.put(key, 1); 
         }
     }
    return freq;
}
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
         Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        char [] arr= new char[n]; 
        for(int i=0; i<n; i++){
            arr[i]=sc.next().charAt(0);
        }
        
        TreeMap<Character, Integer> fmap= frequency(arr);
        for(char key : fmap.keySet()){
            int val = fmap.get(key);
            System.out.println(key +" "+val);
        }
    }
}