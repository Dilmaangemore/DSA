/*
1. You are given a number n1, representing the size of array a1.
2. You are given n1 numbers, representing elements of array a1.
3. You are given a number n2, representing the size of array a2.
4. You are given n2 numbers, representing elements of array a2.
5. You are required to find the intersection of a1 and a2. To get an idea check the example below:
 
if a1 -> 1 1 2 2 2 3 5
and a2 -> 1 1 1 2 2 4 5
intersection is -> 1 1 2 2 5

Note -> Don't assume the arrays to be sorted. Check out the question video.
Input Format
A number n1
n1 number of elements line separated
A number n2
n2 number of elements line separated
Output Format
All relevant elements of intersection in separate lines
The elements of intersection should be printed in order of their occurence in a2*/

import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    int n1 = Integer.parseInt(br.readLine());
    int [] a1 = new int[n1];
    for(int i=0; i<n1; i++){
        a1[i]= Integer.parseInt(br.readLine());
    }
    
    int n2 = Integer.parseInt(br.readLine());
    int [] a2 = new int[n2];
    for(int i=0; i<n2; i++){
        a2[i]= Integer.parseInt(br.readLine());
    }
    
    HashMap<Integer, Integer> fmap= new HashMap<>();
    for(int val : a1){
        if(fmap.containsKey(val)){
            int of = fmap.get(val);
            int nf = of+1;
            fmap.put(val, nf);
        }else {
            fmap.put(val, 1);
        }
    }
    
    
    for(int val : a2){
        if(fmap.containsKey(val) && fmap.get(val)>0){
         System.out.println(val);
         fmap.put(val, fmap.get(val)-1);
        }
    }
 }

}