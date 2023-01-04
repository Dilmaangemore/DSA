/*You are given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.

Input Format

A String
Constraints

1 <= s.length <= 10^5
s consists of only lowercase English letters.
Output Format

An Integer Value
Sample Input 0

geekugeek
Sample Output 0

4
Sample Input 1

geekuhgfdrteugeek
Sample Output 1

5
Sample Input 2

geekuhgfdrteugeekgeekuhgfdrteugeekja
Sample Output 2

34
Sample Input 3

"geekuhgfdrteugeekgeekuhgfdrteugeek"
Sample Output 3

-1
Sample Input 4

geekuhgfdrteugeekgeekuhgfdrteugeekgeekuhgfdrteugeekgeekuhgfdrteugeekgeekuhgfdrteugeekgeekuhgfdrteugeekt
Sample Output 4

-1
Sample Input 5

geekuhgfdrteugeekgeekuhgfdrteugeekgeekuhgfdrteugeekgeekuhgfdrteugeekgeekuhgfdrpteugeekgeekuhgfdrteugeekt
Sample Output 5

78*/

import java.io.*;
import java.util.*;

public class Solution {
public static int firstUniqueChar(String str){
    
    HashMap<Character, Integer> map = new HashMap<>();
    char fnrc='a';
    
    for(int i=0; i<str.length(); i++){
        char ch = str.charAt(i);
        
        if(map.containsKey(ch)){
            int of = map.get(ch);
            int nf = of +1;
            map.put(ch, nf);
        }else{
            map.put(ch, 1);
        }
    }
    for(char ch : map.keySet()){
        int val = map.get(ch);
        if(val == 1){
            
           fnrc=ch; 
                
        }
    }
    for(int i=0; i<str.length(); i++){
        if(str.charAt(i) == fnrc) return i;
    }
    return -1;
}
    
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
      System.out.println(firstUniqueChar(str));
        
    }
}