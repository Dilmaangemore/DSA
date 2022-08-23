/********Print count of digits and digits line by line.****

Print count of digits and digits line by line.

You will be given a number greater than or equal to zero. Print the count of digits in the first line and then you have to print its digits from the digit at one’s place till the digit at the at the largest place value such that each digit should be printed in a separate line.

Input Format

For each test case, a number will be given.

Constraints

0<=number<=2^31-1

Output Format

Print as given in the problem statement.

Sample Input 0

7654
Sample Output 0

4
4
5
6
7
Sample Input 1

85439
Sample Output 1

5
9
3
4
5
8
Sample Input 2

8765430
Sample Output 2

7
0
3
4
5
6
7
8
*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
      int var =   countOfDigit(n);
        System.out.println(var);
        
        for(int i=n; i>0; i=i/10){
           System.out.println(i%10); 
        }
        
    }
    
    public static int countOfDigit(int n ){
        int count =0;
        
        while(n>0){
            int r = n%10;
            
            count++;
            
            n = n/10;
        }
        return count;
        
    }
}

/************************Another***Approach************/

 int countOfDigits = 0;
        for(int idx = n; idx > 0; idx = idx / 10){
            countOfDigits++;
        }
        
        System.out.println(countOfDigits);
      
        for(int idx = n; idx > 0; idx = idx / 10){
            System.out.println(idx % 10);
        }