

public class runAreaOFRectanle {
    public static void main(String [] args){
        // calling method through reference
        areaOfRectangle rec1 = new areaOfRectangle();
        rec1.insert(45, 21);
        rec1.display();

          // Annonymous object

    //new areaOfRectangle(): is annonymous object
    /*Anonymous simply means nameless. 
    An object which has no reference is known as an anonymous object.
    
It can be used at the time of object creation only. */

new areaOfRectangle().insert(12, 5);
 
  }
  

}
