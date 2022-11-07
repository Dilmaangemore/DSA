import java.io.*;
import java.util.*;

public class Solution {
static void selectionSort(int [] arr){
    for(int i=0; i<arr.length-1; i++){
        int min = i;
        for(int j=i+1; j<arr.length; j++){
            if(arr[j] < arr[min]){
                min = j;
            }
        }
       // if(min != i){
            int temp = arr[i];
        arr[i]= arr[min];
        arr[min] = temp; 
       // }
         
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
        selectionSort(arr);
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+ " ");
        }
    }
}