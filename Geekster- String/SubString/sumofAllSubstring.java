/*Take a String str as input and print the sum of all substrings of a string representing a number.

Eg: str="1234"

Sum = 1 + 2 + 3 + 4 + 12 + 23 + 34 + 123 + 234 + 1234 = 1670

Note: Number will be in string fromat.

Input Format

A String.

Constraints

1<=str.length<=1000

Output Format

An Integer value.

Sample Input 0

12345
Sample Output 0

16755*/

import java.io.*;
import java.util.*;

public class Solution {
public static int stringtoInteger(String s){

    int num =0;
    int  mul =1;
    
    for(int i=s.length()-1; i>=0; i--){
          int digit = s.charAt(i)-'0';
           num = num+ mul*digit;
            mul = mul*10;
    }
    return num;
}
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        
        int res =0;
        
        for(int i=0; i<str.length(); i++){
            for(int j =i; j<str.length(); j++){
             int curr = stringtoInteger(str.substring(i, j+1)); 
            
            res = res+curr;
            }
        }
        System.out.println(res);
    }
}