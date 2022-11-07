import java.io.*;
import java.util.*;

public class Solution {
public static void bubbleSort(int [] arr){
    for(int i=0; i<arr.length-1; i++){
        for(int j=0; j<arr.length-i-1; j++){
            if(arr[j] > arr[j+1]){
                swap(arr, j);
            }
        }
    }
}
    
    public static void swap(int [] arr, int idx){
        int temp = arr[idx];
        arr[idx]=arr[idx+1];
        arr[idx+1]=temp;
    }
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr= new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        bubbleSort(arr);
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }
}