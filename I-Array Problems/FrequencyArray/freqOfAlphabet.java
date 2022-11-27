/*Given a string consisting of only small case alphabets. Find the frequency of each alphabet in O(N) time and you can take extra space. Then print the frequency of each alphabet in the string if that alphabet is contained in the string.

Input Format

a string of small char

Constraints

na

Output Format

Print all the char with their corresponding frequences

Sample Input 0

abcdaccd
Sample Output 0

a-2
b-1
c-3
d-2
Explanation 0

a appear 2 times in string b-1 ,c-3 and d 2 times

Sample Input 1

abbhim
Sample Output 1

a-1
b-2
h-1
i-1
m-1
Sample Input 2

test
Sample Output 2

t-2
e-1
s-1
Sample Input 3

hello
Sample Output 3

h-1
e-1
l-2
o-1
Sample Input 4

addcase
Sample Output 4

a-2
d-2
c-1
s-1
e-1*/

import java.io.*;
import java.util.*;

public class Solution {
    public static int[] frequencyArray(String str){
        int[] freq = new int[26];
        
        for(int idx=0; idx < str.length(); idx++){
            char ch = str.charAt(idx);
            freq[ch - 'a']++;
        }
        
        return freq;
    }
        
    public static void printFrequency(String str, int[] freq){
        for(int idx=0; idx < str.length(); idx++){
            char ch = str.charAt(idx);
            if(freq[ch - 'a'] > 0){
                System.out.println(ch + "-" + freq[ch - 'a']);
                freq[ch - 'a'] = -1;
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        
        int[] freq = frequencyArray(str);
        printFrequency(str, freq);
    }
}