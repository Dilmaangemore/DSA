/*You are given a string, print the length of Longest Substring Without Repeating Characters.

Input Format

A String
Constraints

0 <= s.length <= 5 * 104
s consists of ASCII values
Output Format

An Integer Value
Sample Input 0

abcabcbb
Sample Output 0

3
Explanation 0

The answer is "abc", with the length of 3.

Sample Input 1

quukeu
Sample Output 1

3
Explanation 1

The answer is "uke", with the length of 3.

Notice that the answer must be a substring, "quke" is a subsequence and not a substring.*/

import java.io.*;
import java.util.*;

public class Solution {
    public static int lengthOfLongestSubstring(String s) {
        int left = 0, maxlen = 0;
        HashMap<Character, Integer> freq = new HashMap<>();

        for(int right = 0; right < s.length(); right++){
            char ch = s.charAt(right);
            freq.put(ch, freq.getOrDefault(ch, 0) + 1); // right -> include

            while(freq.get(ch) > 1){
                char chl = s.charAt(left);
                freq.put(chl, freq.get(chl) - 1); // left -> delete
                left++;
            }      

            maxlen = Math.max(maxlen, right - left + 1);
        }

        return maxlen;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        System.out.println(lengthOfLongestSubstring(str));
    }
}