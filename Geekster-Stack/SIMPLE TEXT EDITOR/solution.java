import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int tests = scn.nextInt();
        
        String res = new String();
        Stack<Integer> type = new Stack<>(); // Type of Operation
        Stack<String> undo = new Stack<>(); // String which we want to do
        
        for(int t = 0; t < tests; t++){
            int choice = scn.nextInt();
            
            if(choice == 1){
                // append
                String str = scn.next();
                res += str;
                type.push(1); // insert operation
                
                undo.push(str); 
            }
            else if(choice == 2){
                // delete
                int k = scn.nextInt();
                int n = res.length();
                
                type.push(2); // delete operation
                undo.push(res.substring(n - k, n));
                
                res = res.substring(0, n - k);
                
            } else if(choice == 3){
                // print
                int k = scn.nextInt(); // 1-based indexing
                System.out.println(res.charAt(k - 1));
                
            } else if(type.pop() == 1){ 
                // undo insert: delete
                String str = undo.pop();
                int n = res.length();
                int k = str.length();
                    
                res = res.substring(0, n - k);
            } 
            else {
                // undo delete: append
                String str = undo.pop();
                res += str;  
            }
        }
    }
}