/*
Brute Force
Create a temp array of length input array
Traverse through array and if a non negative elements encounter then put this element in the temp array at zero index and increment index
Fill the zeros in remaining places of temp array

Input: 1 ,0 ,2 ,3 ,0 ,4 ,0 ,1
Output: 1 ,2 ,3 ,4 ,1 ,0 ,0 ,0
*/
    void pushZerosToEnd(int[] arr, int n) {
        // code here
  
  int [] temp = new int[n];
  int j =0;
            for(int i=0; i<n; i++){
                if(arr[i] != 0){
                    temp[j]= arr[i];
                    j++;
                }
            }
            
            while(j<n){
                temp[j]=0;
                j++;
            }
        
for(int i=0; i<n; i++){
    arr[i]=temp[i];
}

        
    }