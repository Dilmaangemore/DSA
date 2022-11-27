// Given a number as an integer input. Check which digit occurs the maximum number of times. Print that digit.

// Input Format

// An int val

// Constraints

// na

// Output Format

// print diigt with highest freq

// Sample Input 0

// 11234
// Sample Output 0

// 1

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] freq = new int[10];
        while(n>0){
            int digit = n%10;
            freq[digit]++;
             n = n/10;
            
        }
        int res = 0;
        
        for(int idx = 0; idx < 10; idx++){
            if(freq[idx] > freq[res])
                res = idx;
        }
        System.out.println(res);
    }
}