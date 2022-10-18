/*
2.0) Question:
You are given two sets.
Set A = {1,2,3,4,5,6}
Set B = {2,3,4,5,6,7,8}

How many elements are present in ?
Only enter the correct integer in the answering box. Do not include any extra spaces, tabs or newlines.
*/
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int a[] ={1,2,3,4,5,6};
        int b[] = {2,3,4,5,6,7,8};
        int count =0;
        for(int i=0; i<a.length; i++){
            for(int j=0; j<b.length; j++){
                if(a[i]==b[j]){
                    count++;
                }
            }
        }
        System.out.print(count);
        
    }
}