/*
1. You are given a number n1, representing the size of array a1.
2. You are given n1 numbers, representing elements of array a1.
3. You are given a number n2, representing the size of array a2.
4. You are given n2 numbers, representing elements of array a2.
5. You are required to print all elements of a2 which are also present in a1 (in order of their occurence in a2). Make sure to not print duplicates (a2 may have same value present many times).
Input Format
A number n1
n1 number of elements line separated
A number n2
n2 number of elements line separated
Output Format
All relevant elements of a2 in separate lines (no duplic
Constraints
1 <= n1, n2 <= 100
0 <= a1[i], a2[i] < 10
Time complexity should be O(n)
Sample Input
9
5
5
9
8
5
5
8
0
3
18
9
7
1
0
3
6
5
9
1
1
8
0
2
4
2
9
1
5
Sample Output
9
0
3
5
8*/

import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    
    Scanner sc = new Scanner(System.in);
    int n1 = sc.nextInt();
    int [] a1 = new int[n1];
    for(int i=0; i<n1; i++){
        a1[i]= sc.nextInt();
    }
    int n2 = sc.nextInt();
    int [] a2= new int[n2];
    for(int i=0; i<a2.length; i++){
        a2[i]= sc.nextInt();
    }
    HashMap<Integer, Integer> fmap= new HashMap<>();
    for(int key : a1){
        if(fmap.containsKey(key)){
            
            int of = fmap.get(key); 
            
            // get the value stored at particular key
            // add 1 to vale if return true
            
            
            int nf = of+1;
            
        }else{
            fmap.put(key, 1);
        }
    }
    
    // key : value(freq of) for a1
    // 1   :  1+1
    // 2   :  1+1+1
    //  3  :   1
    //  5  :   1
    
    // loop
    for(int val : a2){
        
       // check evry ele of arr match to fmap\
       // incase true print and remove that key from frequency map(fmap)
       // in case key and arr2 elemnt not matched ignore.
       
        if(fmap.containsKey(val)){
            System.out.println(val);
            fmap.remove(val);
        }
    }
 }
 

}