public class Main
{
	    public static int maxWater(int[] height)
    {
 
        // To store the maximum water
        // that can be stored
        int res = 0;
 
        // For every element of the array
        // except first and last element
        for (int i = 1; i < height.length - 1; i++) {
 
            // Find maximum element on its left
            int left = height[i];
            for (int j = 0; j < i; j++) {
                left = Math.max(left, height[j]);
            }
 
            // Find maximum element on its right
            int right = height[i];
            for (int j = i + 1; j < height.length; j++) {
                right = Math.max(right, height[j]);
            }
 
            // Update maximum water value
            res += Math.min(left, right) - height[i];
        }
        return res;
    }
 
   
    
 
    // Driver code
    public static void main(String[] args)
    {
        int[] height = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
     
 
        System.out.print(maxWater(height));
    }
}