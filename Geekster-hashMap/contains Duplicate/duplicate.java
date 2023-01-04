/*Take an integer array arr as input and print "true" if any value appears at least twice in the array, else print "false" if every element is distinct.

Input Format

An Integer N.
N integers depicting elements of array.
Constraints

1 <= arr.length <= 10^5
-10^9 <= arr[i] <= 10^9
Output Format

"true" or "false"
Sample Input 0

5
1 2 3 4 5
Sample Output 0

false
Sample Input 1

5 
1 2 2 3 1
Sample Output 1

true*/

import java.io.*;
import java.util.*;

public class Solution {
    static Scanner scn = new Scanner(System.in);
    public static boolean isDuplicate(int n){
        HashMap<Integer,Integer> freq = new HashMap<>();
        for(int i=0; i<n; i++){
            int num = scn.nextInt();
            freq.put(num,freq.getOrDefault(num,0)+1);
            if(freq.get(num)>1) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int n = scn.nextInt();
        System.out.println(isDuplicate(n));
    }
}