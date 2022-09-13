/*
Print First Vowel Occurance

Take n as an integer input. Declare the first array of size n that stores values of char data-type. Then take n character inputs and store them in the array one by one. Print the index at which the vowel occurs for the first time.

Input Format

N int value as size then N char values

Constraints

NA

Output Format

Idx of first vowel in array

Sample Input 0

5
b
c
d
e
p
Sample Output 0

3
Explanation 0

First Vowel in the Array is 'e' The Idx of e is 3
*/
import java.io.*;
import java.util.*;

public class Solution {

   
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        int  size = sc.nextInt();
        char [] ch = new char[size];
        for(int i=0; i<size; i++){
            ch[i]=sc.next().charAt(0);
        }
        for(int i=0; i<size; i++){
            if(ch[i]=='a'||ch[i]=='e'|| ch[i] =='i'|| ch[i]=='o'|| ch[i]=='u'){
                System.out.println(i);
                break;
            }
        }
    }
}