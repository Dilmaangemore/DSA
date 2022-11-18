/*
The given array is not sorted. The given array may or may not contain duplicate elements. Then take the target as an integer input. Return Pair of target sum in which all pairs are unique, for example : [6, 7], [7, 6] are considered as the same pair.

Also if the array has repeated elements then return only unique pairs, for eg : if array is arr = [3, 3, 5, 5], and the target = 8 then result will have only one pair, i.e. [3, 5].

Note : Print the pairs such the smallest integers comes first.

For example arr = [ 3 , 3, 2, 4]

output should be:

2 4
3 3

output should not be:

3 3
2 4

Input Format

An integer number n representing size of array
N integer number representing elements of array
An integer number
Constraints

1<=n<=100000
-10^6<=array[index]<=10^6
-10^6<=target<=10^6
Output Format

Required pair in different lines.

Sample Input 0

4
3 3 5 5
8
Sample Output 0

3 5
Explanation 0

3 + 5 = 8
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void targetSumPairs(int[] arr, int target){
        Arrays.sort(arr);
        
        int left = 0, right = arr.length - 1;
        while(left < right){
            if(left > 0 && arr[left] == arr[left - 1]) left++;
            else if(arr[left] + arr[right] == target){
                System.out.println(arr[left] + " " + arr[right]);
                left++;
            } else if(arr[left] + arr[right] < target){
                left++;
            } else {
                right--;
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int size = scn.nextInt();
        int[] arr = new int[size];
        
        for(int idx = 0; idx < size; idx++){
            arr[idx] = scn.nextInt();
        }
        
        int target = scn.nextInt();
        
        targetSumPairs(arr, target);
    }
}