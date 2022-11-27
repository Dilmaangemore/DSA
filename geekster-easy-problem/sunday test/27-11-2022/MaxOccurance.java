/*Given two strings, we need to take the character which has the maximum occurrence in the first string and then we have to check if that particular character is present in the second string the same number of times as it is present in the first string.

If more than one maximum occurring character exist consider all of them.

Input Format

first line contain string 1, second line contain string 2.

Constraints

1<=length<=100000

Output Format

print Yes or No.

Sample Input 0

geekforgeeks
geekisgeeky
Sample Output 0

Yes*/
import java.io.*;
import java.util.*;

public class Solution {
 
public static String MaxOccurance(String str1, String str2){
  
    
    int [] count = new int[256];
    
    char []ch1= str1.toCharArray();
    for(int i=0; i<str1.length(); i++){
        count[ch1[i]]++;
      // System.out.print(count[i]+" ");
    }
    
   int mx_cnt = 0;
   int mx_chr = 0;
   for (int i = 0; i < 256; i++)
    {
    if (count[i] > mx_cnt)
    {
        mx_cnt = count[i];
        mx_chr = i;
    }
}
    
    char []ch2  =str2.toCharArray();
    for(int i = 0; i < ch2.length; i++)
    if (mx_chr == ch2[i])
        mx_cnt--;
 
// check if sum is greater or
// equal to number return 1
if (mx_cnt == 0)
    return "Yes";
else
    return "No";
    
}
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
    //MaxOccurance(str1, str2);
        System.out.println(MaxOccurance(str1, str2));
    }
}