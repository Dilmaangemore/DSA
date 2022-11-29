/*Take a string as input. Print the count of all the substrings that start with ‘A’ and end with ‘A’. Also print the length of the longest such substring in the second line. In the third line, print that longest substring.

If no such substring exists, print -1.

Input Format

A String

Constraints

1<=str.length()<=100000
Output Format

count of all the substrings
length of the longest substring
print the longest substring
Sample Input 0

ABADA
Sample Output 0

3
5
ABADA
Explanation 0

there are 3 substring ABA , ABADA and ADA. longest substring is ABADA and its length is 5*/
import java.io.*;
import java.util.*;

public class Solution {
public static int leftPointer(String str){
    
    for(int i=0; i<str.length(); i++){
        if(str.charAt(i) == 'A') return i;
    }
    return -1;
}
    
    static int rightPointer(String str){
        for(int j=str.length()-1; j>=0; j--){
            if(str.charAt(j)== 'A') return j;
        }
        return -1;
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
         int count =0;
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) =='A') count++;
        }
       
        if(count <= 1) {
            System.out.println(-1);
        }else {
          System.out.println((count*(count-1))/2);
            
            int l = leftPointer(str);
            int r = rightPointer(str);
            
            System.out.println(r-l+1);
            System.out.println(str.substring(l, r+1));
        }
    }
}