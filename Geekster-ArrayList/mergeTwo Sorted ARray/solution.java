/*Given two sorted arrays A[] and B[] of size N and M. The task is to merge both the arrays into a single ArrayList in non-decreasing order but it contains only unique elements.

Input Format

First line take an integer input from user as N , where N is the size of A[].
Second line takes N elements as Integer input in A[].
Third line take an integer input from user as M , where M is the size of B[].
Next line takes M elements as Integer input in B[].
Constraints

1 <= N <= 200
1 <= M <= 200
-1000 <= A[i], B[j] <= 1000
Output Format

Print the merged Array.

Sample Input 0

4
1 3 3 7
4
2 4 4 8
Sample Output 0

1 2 3 4 7 8 
Explanation 0

merged array = [ 1, 2, 3, 4, 7, 8 ]
*/

import java.io.*;
import java.util.*;

public class Solution {
public static ArrayList<Integer> merge(int [] A, int [] B){
    ArrayList<Integer> al = new ArrayList<>();
    int p1 =0, p2=0;
  while(p1<A.length && p2<B.length){
      if(A[p1] <= B[p2]){
          if(al.size()==0 || al.get(al.size()-1) != A[p1])
              al.add(A[p1]);
          p1++;
      }else{
         if(al.size()==0 || al.get(al.size()-1) != B[p2])
              al.add(B[p2]);
          p2++;  
      }
  }
    while(p1<A.length){
       if(al.size()==0 || al.get(al.size()-1) != A[p1])
              al.add(A[p1]);
          p1++;  
    }
    
    while(p2 < B.length){
        if(al.size()==0 || al.get(al.size()-1) != B[p2])
              al.add(B[p2]);
          p2++; 
    }
    return al;
}
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
      Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int [] A = new int[N];
        for(int i=0; i<N; i++){
            A[i]=sc.nextInt();
        }
        
        int M = sc.nextInt();
        int [] B = new int[M];
        for(int i=0; i<M; i++){
            B[i]=sc.nextInt();
        }
        ArrayList<Integer> al = merge(A, B);
        for(int val : al){
            System.out.print(val+" ");
        }
    }
}