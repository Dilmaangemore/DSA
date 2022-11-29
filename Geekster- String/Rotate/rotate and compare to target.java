/*
Target String
Problem
Submissions
Leaderboard
Discussions
Take Two Strings as input. First string as "str" and second string as a "Target" string.

You are allowed to rotate the original string "str" multiple times.

Print "True" if "Target" string can be achieved by rotating the "str" any number of times else print "False".

Note: String "bcda" is a rotation of "abcd" but "bdca" is not a rotation of String "abcd".

Input Format

String "str"
String "Target"
Constraints

1<=str.length()<=1000
1<=Target.length()<=1000
Output Format

A String "True" or "False".

Sample Input 0

abcde
cdeab
Sample Output 0

True
Sample Input 1

abcde
abced
Sample Output 1

False
*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String target = sc.next();
       for(int i = str.length(); i>=1; i--){

           String left = str.substring(i, str.length());
           String right = str.substring(0, i);
           String rot = left + right;
           if(rot.equals(target)){

               System.out.println("True");
               return;
           }
       }
        System.out.println("False");

    }
}