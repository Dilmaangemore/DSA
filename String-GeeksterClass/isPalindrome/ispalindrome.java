


import java.io.*;
import java.util.*;

public class Solution {
    public static void isPalindrome(String str){
        int right = str.length() - 1, left = 0;
        while(left < right){
            if (str.charAt(left) != str.charAt(right)) {
                System.out.println("Not a Palindrome");
                return;
            }
            left++; right--;
        }
        System.out.println("Palindrome");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        isPalindrome(str);
    }
}