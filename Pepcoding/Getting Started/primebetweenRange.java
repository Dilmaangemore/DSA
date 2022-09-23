
import java.io.*;

import java.util.*;
public class Main {
  public static void main(String args) throw Exception {
    Scanner scn = new Scanner(System.in);
    int low = scn.nextInt(); //taking lower bound input
    int high = scn.nextInt(); //taking upper bound input

    for (int n = low; n <= high; n++) {

      //try and create a filter to pass through prime
      //numbers down to the printing command


      //print command for prime numbers
      System.out.println(n);
    }
  }
}
/******************************************************************************



*******************************************************************************/
import java.io.*;

import java.util.*;
public class Main {
  public static void main(String args) throw Exception {
    Scanner scn = new Scanner(System.in);
    int low = scn.nextInt(); //taking lower bound input
    int high = scn.nextInt(); //taking upper bound input

    for (int n = low; n <= high; n++) {

      int count = 0;
      for (int div = 2; div * div <= n; div++) {
        if (n % div == 0) {
          count++;
          break;
        }
      }
      if (count == 0) // checks if count is 0

        System.out.println(n);
    }
  }
}
/******************************************************************************



*******************************************************************************/

import java.util.*;

public class Main{
    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
            int low = sc.nextInt();
            int high = sc.nextInt();
            
        for(int i=low; i<=high; i++){
            //int n = sc.nextInt();
            int div =2;
            while(div * div <i){
                if(i % div ==0){
                    break;
                }
                div++;
            }
            if(div *div >i){
                System.out.println(i);
            }
        }
    }
}