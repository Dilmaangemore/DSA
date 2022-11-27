/*Input Format

array of integers h and n as the size of array.

Constraints

1 ≤ N ≤ 106 1 ≤ Hi ≤ 108 Expected Time Complexity: O(N) Expected Auxiliary Space: O(1)

Output Format

integer representing the number of buildings which will see the sunrise

Sample Input 0

5
7 4 8 2 9
Sample Output 0

3
Explanation 0

As 7 is the first element, it can see the sunrise. 4 can't see the sunrise as 7 is hiding it.
8 can see as it's greater than 7. 2 can't see the sunrise. 9 can also see the sunrise.

Sample Input 1

4
2 3 4 5
Sample Output 1

4
Explanation 1

As 2 is the first element, it can see the sunrise. 3 can see the sunrise as 2 is not hiding it. Same for 4 and 5, they also can see the sunrise.*/
import java.io.*;
import java.util.*;

public class Solution {
public static int facingSun(int [] arr){
    int max = arr[0];
    int count =1;
    for(int i=0; i<arr.length; i++){
       if(arr[i]>max) {
           count++;
           max=arr[i];
       }
            
    }
    return count;
}
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr= new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(facingSun(arr));
    }
}