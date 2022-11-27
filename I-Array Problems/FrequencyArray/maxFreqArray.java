/*Given a string consisting of only small case alphabets. Find the element with the maximum occurrence. The solution should have O(n) time complexity.

Input Format

a string of small char

Constraints

na

Output Format

print the char

Sample Input 0

abcdaccd
Sample Output 0

c*/
import java.io.*;
import java.util.*;

public class Solution {
static int[] frequencyArray(String str){
    int [] freq = new int[26];
    for(int i=0; i<str.length(); i++){
        char ch= str.charAt(i);
        freq[ch-'a']++;
    }
    return freq;
}
    public static void printmaxFrequency(String str, int [] freq){
        int max =0; 
        char maxChar =' ';
        for(int i=0; i<freq.length; i++){
            //char ch = str.charAt(i);
            if(freq[i]>max){
                max = freq[i];
                maxChar=(char)(i+'a');
            }
            
        }
        System.out.println(maxChar);
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
       int [] res = frequencyArray(str); 
        printmaxFrequency(str, res);
    }
}