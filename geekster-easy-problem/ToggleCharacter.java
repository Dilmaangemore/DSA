/************Toggle the character**********
Take in a character as an input from the user

a. If the entered character is a small-case character, the convert it into the corresponding uppercase character and print it.

b. If the entered character is an upper-case character, the convert it into the corresponding lowercase character and print it.

Input Format

For each test case, you will get an alphabet as a character input.

Constraints

The alphabet that is taken as input is only small-case or capital-case.

Output Format

You have to print the output as a character data-type.

Sample Input 0

a
Sample Output 0

A
Sample Input 1

K
Sample Output 1

k
****************************************************/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        

        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        
        if(ch>='a' && ch<='z'){
            System.out.println((char)(ch-32));
        }else if(ch>='A' && ch<='Z'){
            System.out.println((char)(ch+32));
            
        }
        
    }
}