import java.io.*;
import java.util.*;

public class Solution {
    public static void bubbleSort(int [] arr){
        for(int i=0; i<arr.length-1; i++){
            for(int j=0; j<arr.length-1-i; j++){
                if(Math.abs(arr[j])>Math.abs(arr[j+1]))
                    swap(arr, j);
            }
        }
    }
    public static void swap(int []arr, int i){
        int temp = arr[i];
        arr[i]=arr[i+1];
        arr[i+1] = temp;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int [] arr = new int[size];
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        bubbleSort(arr);
        for(int idx =0; idx<arr.length; idx++){
            System.out.print(arr[idx]+" ");
        }
    }
}