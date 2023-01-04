/*Take an Integer N as input and then take N integers input from Geeku.

Geeku wants to print all those integers whose frequency is exactly same as the integer's absolute value.

You have to help Geeku in doing so.

Note: 0 is excluded

Input Format

Integer N
N Integers
Constraints

1<=N<=10^5
-10^5<=n<=10^5
Output Format

As described in Problem Statement
Sample Input 0

10
4 5 -3 8 -3 4 4 -3 6 4
Sample Output 0

-3
4*/

import java.io.*;
import java.util.*;

public class Solution {
public static void sameNOSameFreq(int [] arr){
    TreeMap<Integer, Integer> map = new TreeMap<>();
    
    for(int key : arr){
        if(map.containsKey(key)){
            int of = map.get(key);
            int nf = of+1;
            map.put(key, nf);
        }else{
            map.put(key, 1);
        }
    }
    
    for(int key : map.keySet()){
        int val = map.get(key);
        
        if(Math.abs(key) == val){
            System.out.println(key);
        }
    }
    
}
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int [] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]= sc.nextInt();
        }
        sameNOSameFreq(arr);
        
    }
}