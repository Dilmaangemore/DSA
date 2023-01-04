/*You are given a string str, print the length of the longest palindrome that can be formed using the characters of the string.

Letters are case sensitive, for example, "Aa" is not considered a palindrome here.

Note: str consists of lowercase or uppercase letters.

Input Format

A String
Constraints

1 <= s.length <= 2000
str consists of lowercase and/or uppercase English letters only.
Output Format

An integer value
Sample Input 0

abccccdd
Sample Output 0

7
Explanation 0

One longest palindrome that can be formed is "dccaccd", whose length is 7.*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        
        int length = 0;
        HashMap<Character, Integer> freq = new HashMap<>();
        
        for(int idx = 0; idx < str.length(); idx++){
            char ch = str.charAt(idx);
            freq.put(ch, freq.getOrDefault(ch, 0) + 1);
        }
        
        for(char ch: freq.keySet()){
            int val = freq.get(ch);
            if(val % 2 == 1) val--;
            length = length + val;
        }
        
        if(length < str.length()) 
            length++; // unique character: odd length palindrome
        
        System.out.println(length);
    }
}

/******************************************************************************************/

// USING HASHMAP & FREQ-ARRAY

import java.io.*;
import java.util.*;

public class Solution {
    public static int longestPalindromeFreqArray(String str){
        int[] freq = new int['z' - 'A' + 1]; //122 - 65
        
        for(int idx = 0; idx < str.length(); idx++)  // Filling only freq
            freq[str.charAt(idx) - 'A']++;
        
        int length = 0;
        for(int val: freq){
            if(val % 2 != 0) val--;
            length += val;
        } 
        
        if(length == str.length()) return length;
        return ++length;    
    }
    
    public static int longestPalindromeMap(String str){
        HashMap<Character, Integer> freq = new HashMap<>();
        
        for(int idx = 0; idx < str.length(); idx++) { // mapping Ch : Freq
            char ch = str.charAt(idx);
            freq.put(ch, freq.getOrDefault(ch, 0) + 1);
        }
        
        int length = 0;
        for(char ch: freq.keySet()){
            int val = freq.get(ch);
            if(val % 2 != 0) val--;
            length += val;    
        }
        
        if(length == str.length()) return length;
        return ++length; 
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        
        // System.out.print(longestPalindromeMap(str)); // Using Map
        // System.out.print(longestPalindromeFreqArray(str)); // Using FreqArray
    }
}