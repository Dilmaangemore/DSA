import java.io.*;
import java.util.*;

public class Solution {
public static String reverse(String str){
   Stack<Character> stk = new Stack<>();
     for(int i=0; i<str.length(); i++){
         char ch = str.charAt(i);
         stk.push(ch);
     }
  // StringBuilder res = new StringBuilder();
    String res = "";
    while(stk.size()>0){
        char ch = stk.pop();
        res = res+ch;
    }
    return res.toString();
}
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
       System.out.println(reverse(str)); 

    }
}