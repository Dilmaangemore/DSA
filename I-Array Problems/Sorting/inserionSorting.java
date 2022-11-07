import java.io.*;
import java.util.*;

public class Solution {
    static void insertionSort(int [] arr){
        for(int i=1; i<arr.length; i++){
            int temp = arr[i];
           int j = i-1;
            while(j>=0 && arr[j] > temp){
                arr[j +1]= arr[j];
                j--;
            }
            arr[j+1] = temp;
        }
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr= new int[n];
        for(int i=0; i<n; i++){
            arr[i]= sc.nextInt();
        
        }
        insertionSort(arr);
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}