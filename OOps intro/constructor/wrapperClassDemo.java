public class wrapperClassDemo {
    /**
     * @param args
     */
    public static void main(String [] args){
        int marks = 100;
        System.out.println(marks);

        Integer val = new Integer(90);
        System.out.println(val);

        Integer val2 = Integer.MIN_VALUE;
       // Integer val2 = 5; // this is called Autoboxing
        Integer val3 = Integer.MAX_VALUE;

        Integer val4 = Integer.parseInt("12345");
       // int val5 = val4; 
       // store wrapper class to int
        // called unboxing

        Character ch1 = new Character('A');
        //Character ch1 = 'b';
        //it is cadded Autoboxing
        // compiler itself convert into Object
        System.out.println(Character.toLowerCase(ch1));

        System.out.println(val+" "+val2+" "+val3);

        String str = new String("Vishnu");
        System.out.println(str);

        int [] arr= {30, 20, 50, 55, 34};
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]+" ");
        }
      





    }
}
