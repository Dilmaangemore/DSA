/*Take an array of integers arr as input from user and print "true" if the number of occurrences of each value in the array is unique, else print "false".

Input Format

An Integer N.
N integers depicting elements of array.
Constraints

1 <= arr.length <= 10^5
-10^9 <= arr[i] <= 10^9
Output Format

"true" or "false"
Sample Input 0

6
1 2 2 1 1 3
Sample Output 0

true
Explanation 0

The value 1 has 3 occurrences, 2 has 2 and 3 has 1. No two values have the same number of occurrences.

Sample Input 1

4
1 2 1 2
Sample Output 1

false*/

import java.io.*;
import java.util.*;

public class Solution {
    public static boolean unique(int[] arr){
        HashMap<Integer, Integer> map1 = new HashMap<>();
       for(int i=0; i<arr.length; i++){
           
           map1.put(arr[i] , map1.getOrDefault(arr[i], 0)+1);
       }
        HashSet<Integer> map2 = new HashSet<>();
        for(int val:map1.keySet()){
            if(map2.contains(map1.get(val))){
                return false ;
            }
            map2.add(map1.get(val));
        }
        return true ;
            
        }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        sc.close();
        boolean ans = unique(arr);
        System.out.println(ans);
    }
}