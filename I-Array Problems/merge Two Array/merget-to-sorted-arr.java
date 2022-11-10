import java.io.*;
import java.util.*;

public class Solution {

    public static int[] merge(int [] arr1, int [] arr2){
        int first =0, second=0, third=0;
        int [] res = new int[arr1.length + arr2.length];
        
        while(first < arr1.length && second <arr2.length){
            if(arr1[first] <= arr2[second]){
                res[third] = arr1[first];
                first++;
                third++;
            }else{
                res[third] = arr2[second];
                second++;
                third++;
            }
        }
        while(first < arr1.length){
            res[third] = arr1[first];
            first++;
            third++;
        }
        while(second < arr2.length){
            res[third] = arr2[second];
            second++;
            third++;
        }
        return res;
    }
    public static void main(String[] args) {
 
      Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int [] arr1 = new int[n1];
        for(int i=0; i<n1; i++){
            arr1[i] = sc.nextInt();
        }
        
        int n2 = sc.nextInt();
        int [] arr2 = new int[n2];
        for(int i=0; i<n2; i++){
            arr2[i] = sc.nextInt();
        }
        
        int [] res = merge(arr1, arr2);
        for(int i=0; i<res.length; i++){
            System.out.print(res[i] + " ");
        }
        
    }
}