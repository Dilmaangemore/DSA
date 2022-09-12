Approach 1 (Brute Approach): This approach is the brute approach. The idea is to:

Traverse every array element and find the highest bars on the left and right sides. Take the smaller of two heights. The difference between the smaller height and the height of the current element is the amount of water that can be stored in this array element.

Follow the steps mentioned below to implement the idea:

Traverse the array from start to end:
For every element: 
Traverse the array from start to that index and find the maximum height (a) and 
Traverse the array from the current index to the end, and find the maximum height (b).
The amount of water that will be stored in this column is min(a,b) – array[i], add this value to the total amount of water stored
Print the total amount of water stored.
Below is the implementation of the above approach.