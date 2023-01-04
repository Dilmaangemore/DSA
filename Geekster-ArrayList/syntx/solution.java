/*
First Declare an ArrayList arr.
Then take  as an Integer input.
Format for next T Lines : 

case 1: Print the size of the ArrayList in a separate line.
case 2: Print and Remove element from the last index of the ArrayList.
case 3: Print x and Add x in last index of the ArrayList.
case 4: Print and Remove an element from the starting (index = 0) of the ArraList.
case 5: Print x and Add x at beginning (index = 0) of the ArrayList.
case 6: Print all the elements from left to right that are there inside the ArrayList.
Note : In case  when  is empty the move is invalid, so print "invalid-move all lowercase".

Input Format

Single Integer .
For next  lines we can have single or pair of Integers .
Note : we have  in cases where it is needed and otherwise not present.
Constraints

 <=  <= 
 <=  <= 
 <=  <= 
Output Format

Print the information that is explained in the statement according to case.

Sample Input 0

8
2
6
3 2
5 1
6
1
3 3
2
Sample Output 0

invalid-move
invalid-move
2
1
1 2
2
3
3
*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        ArrayList<Integer> arrList = new ArrayList<>();
            for(int i=0; i<T; i++){
                int choice = sc.nextInt();
                              
                switch(choice){
            case 1: System.out.println(arrList.size());
            break;
            case 2: if(arrList.size() == 0){
                System.out.println("invalid-move");
            }else{
                System.out.println(arrList.remove(arrList.size()-1));
            }
            break;
            
            case 3: 
            int x = sc.nextInt();
            System.out.println(x);
            arrList.add(x);
            break;
            
            case 4:
            if(arrList.size()==0){
                System.out.println("invalid-move");
            }else{
                System.out.println(arrList.remove(0));
            }
            break;
            
            case 5: 
             x = sc.nextInt();
            System.out.println(x);
            arrList.add(0, x);
            break;
            
            default :
            if(arrList.size()==0) System.out.println("invalid-move");
            else {
                for(int val : arrList){
                    System.out.print(val+" ");
                     
                }
                System.out.println();
            }
            
                        break;
        }
               
      }   
        
    }
}

/******************2nd Solution****************************************/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        
        Scanner scn = new Scanner(System.in);
        int tests = scn.nextInt();
        
        for(int t = 0; t < tests; t++){
            int caseNo = scn.nextInt();
            
            if(caseNo == 1){
                
                System.out.println(arr.size()); // print size : O(1)
                
            } 
            else if(caseNo == 2){
                
                if(arr.size() == 0) System.out.println("invalid-move"); // empty
                else System.out.println(arr.remove(arr.size() - 1)); // remove from last : O(1)
                
            } 
            else if(caseNo == 3){
                
                int x = scn.nextInt();
                System.out.println(x);
                arr.add(x); // insert at last : O(1)
                
            } 
            else if(caseNo == 4){
                
                if(arr.size() == 0) System.out.println("invalid-move"); // empty
                else System.out.println(arr.remove(0)); // remove from front : O(n) shifting
                
            } 
            else if(caseNo == 5){
                
                int x = scn.nextInt();
                System.out.println(x);
                arr.add(0, x); // insert at front : O(n) shifting
                
            } 
            else {
                
                if(arr.size() == 0) System.out.println("invalid-move"); // empty
                else {
                    for(int val: arr){ // for each loop traversal
                        System.out.print(val + " ");
                    }
                    System.out.println();
                }
            }
        }
    }
}