/*Write a java program which takes in a List and returns a Set of elements that are ordered in the same way they appear in the list

Input Format

First line of input contains integer n denoting the size of element. Next line of input contains n space separated integers denoting the elements of list.

Constraints

1<=n<=10^4

Output Format

Print unique elements that are ordered in the same way they appear in the list

Sample Input 0

6
1 1 2 3 3 4
Sample Output 0

1 2 3 4 */
 import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr= new int[n];
        for(int i=0; i<n; i++){
            arr[i]= sc.nextInt();
        }
        
    for (int i = 0; i < n; i++)
        {
            // Check if the picked element
            // is already printed
            int j;
            for (j = 0; j < i; j++)
            if (arr[i] == arr[j])
                break;
     
            // If not printed earlier,
            // then print it
            if (i == j)
            System.out.print( arr[i] + " ");
        }
      
    }
}