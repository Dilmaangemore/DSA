/*
Print Inverted Right Anle Trainle
*	*	*	*	*	
*	*	*	*	
*	*	*	
*	*	
*

*/

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(j>=i){
                    System.out.print("*\t");
                }
            }
            System.out.println();
        }


        // write ur code here

    }
}