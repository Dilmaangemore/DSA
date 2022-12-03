/*

*/

    void leftRotate(long arr[], int k,int n)
    {
        long [] temp = new long[arr.length];
         
       k=k%n;
        int j =0;
        for(int i=k; i<arr.length; i++){
            temp[j]=arr[i];
            j++;
        }
        
        for(int i=0; i<k; i++){
            temp[j]=arr[i];
            j++;
        }
       // temp[n-k]=arr[0];
        for(int i=0; i<n; i++){
            arr[i]=temp[i];
        }
    }
}