/*https://practice.geeksforgeeks.org/problems/implement-stack-using-array/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=implement-stack-using-array
*/
/*Example 1:

Input: 
push(2)
push(3)
pop()
push(4) 
pop()
Output: 3, 4
Explanation: 
push(2)    the stack will be {2}
push(3)    the stack will be {2 3}
pop()      poped element will be 3,
           the stack will be {2}
push(4)    the stack will be {2 4}
pop()      poped element will be 4*/

class MyStack
{
    int top;
	int arr[] = new int[1000];

    MyStack()
	{
		top = -1;
	}
	
	//Function to push an integer into the stack.
    void push(int a)
	{
	    // Your code here
	    top++;
	    arr[top]=a;
	} 
	
    //Function to remove an item from top of the stack.
	int pop()
	{
        // Your code here
        if(top ==-1) return -1;
       
        
        return arr[top--];
	}
	
	int top(){
	    return arr[top];
	}
	
	int size(){
	    return top+1;
	}
	boolean isEmpty(){
	    if(top==-1){
	        return true;
	    }
	    return false;
	}
}
public class Main{
    public static void main(String [] args){
        MyStack stk = new MyStack();
        stk.push(6);
        stk.push(5);
        stk.push(2);
        
          System.out.println("Top of the stack before deleting any element " + stk.top());
        System.out.println("Size of the stack before deleting any element " + stk.size());
        System.out.println("The element deleted is " + stk.pop());
        System.out.println("Size of the stack after deleting an element " + stk.size());
        System.out.println("Top of the stack after deleting an element " + stk.top());
    }
}