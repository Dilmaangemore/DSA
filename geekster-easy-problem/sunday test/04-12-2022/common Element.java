/*
Find common elements in two ArrayLists in Java.

Input Format

first line contain N no of elements in list 1, third line contain M elements of list 2 then subsequent lines contain list elements.

Constraints

1<=N,M<=100

Output Format

print common elements with space

Sample Input 0

4
Hii Geeks for Geeks
3
Hii Geeks Gaurav
Sample Output 0

Hii Geeks Geeks
*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        ArrayList<String>
            list1 = new ArrayList<String>();
        for(int i=0; i<n; i++){
            String var = sc.next();
            list1.add(var);
            
        }
        int n2 = sc.nextInt();
          // Create ArrayList list2
        ArrayList<String>
            list2 = new ArrayList<String>();
        
        for(int i=0; i<n2; i++){
            String var = sc.next();
            list2.add(var);
        }
        
        list1.retainAll(list2);
        for(int i=0; i<list1.size(); i++){
            System.out.print(list1.get(i)+" "); 
        }
        
    }
}