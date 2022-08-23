/*
Reverse a 3 digit number

Same as the description.

Input Format

For each test case, a three digit number will be given as an input.

Constraints

100<=3 digit number<=999

Output Format

Print the final reverse 3 digit number as an integer output.

Sample Input 0

234
Sample Output 0

432
Sample Input 1

345
Sample Output 1

543
Sample Input 2

127
Sample Output 2

721
Sample Input 3

987
Sample Output 3

789
Sample Input 4

865
Sample Output 4

568
*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void reverseNum(int n){

        int rev = 0;
         while(n>0){
             int r = n%10;
             rev = rev*10 + r;
           
             n=n/10;
             
             
             
         }
          System.out.println(rev);
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        reverseNum(n);
    }
}