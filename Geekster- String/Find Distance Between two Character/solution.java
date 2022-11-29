/*
Given a string and two characters. Print the minimum distance between two given characters a and b in a string.

Input Format

A string str
Two characters
Constraints

1<=String.length()<=100000
Two characters from given string
Output Format

An integer value
Sample Input 0

Geeks
G
s
Sample Output 0

3
Explanation 0

there are 3 character e e k between our target character
*/



import java.io.*;
import java.util.*;

public class Solution {
static int nextOccurence(String str, char ch, int last){
    for(int idx = last+1; idx<str.length(); idx++){
        if(str.charAt(idx) == ch) return idx;
    }
    return str.length();
}
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        
        char a = sc.next().charAt(0);
        char b = sc.next().charAt(0);
        
        int lastA = nextOccurence(str, a, -1);
        int lastB = nextOccurence(str, b, -1);
        int minDist = Integer. MAX_VALUE;
        
        while(lastA <str.length() && lastB <str.length()){
            minDist = Math.min(minDist, Math.abs(lastB-lastA-1));
                               
           if(lastA <lastB) lastA = nextOccurence(str, a, lastA);
               
           else lastB = nextOccurence(str, b, lastB);
               
           
        }
      System.out.println(minDist);
        
    }
}