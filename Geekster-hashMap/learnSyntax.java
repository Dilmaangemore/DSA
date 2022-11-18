/*
You are required to create a dictionary consisting of word and its meaning.

Take an integer N as input and Continue the process untill Case 4 is not achieved.

If N==1, take word and meaning as input from user and add it to the dictionary.
If N==2, take a word as input from the user and print its meaning, if the word is not found print -1.
If N==3, take a word as input from the user and delete it from the dictionary.
If N==4, Close the dictionary(Exit the program).
Input Format

Integer N.
String Word and Meaning.
Constraints

1<=N<=4
1<=word.length(), meaning.length()<=10^3
Output Format

As described in Problem Statement
Sample Input 0

1 
Geekster 
Coding
1
Geek
Coder
2
Geek
3
Geekster
2
Geekster
4
Sample Output 0

Coder
-1
Sample Input 1

1 
Geekster 
Coding
1
Geek
Coder
2
Geek
3
Geek
2
Geekster
2
Geek
4
Sample Output 1

Coder
Coding
-1
*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        // EMPTY HASHMAP CREATION
        HashMap<String, String> dict = new HashMap<>();
        
        while(true){
            int choice = scn.nextInt();
            
            if(choice == 1){
                // insert
                String word = scn.next();
                String meaning = scn.next();
                dict.put(word, meaning);
                
            } else if(choice == 2){
                // get or default
                String word = scn.next();
                System.out.println(dict.getOrDefault(word, "-1"));
                
            } else if(choice == 3){
                // delete
                String word = scn.next();
                dict.remove(word);
                
            } else break; // exit the while loop or program
        }
    }
}