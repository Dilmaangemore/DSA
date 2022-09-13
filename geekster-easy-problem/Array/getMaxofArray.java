import java.io.*;
import java.util.*;

public class Solution {

    static int getMaxinArray(int [] arr, int n){

        int max = arr[0];
        for(int i=0; i<n; i++){
            if(arr[i]> max){
                max = arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr= new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(getMaxinArray(arr, n));
    }
}