public class StringDemo{
    public static void main(String[] args){
        String name="shraddha";
        name="mane";// now here new object gets created .the original string will not change because the immutability property of strings.
        System.out.println(name);


        String a="kunal";  // now this a and b both are pointing to the same object and the object is created and stored only once in the heap string pool.
        String b="kunal";
        //for checking if they are pointing to same memory == comparision need to do
        System.out.println(a==b);   //true
        String a1=new String("kunal");   // using string class and new keyword the different objects are created even if there vales are same.
        String b1=new String("kunal");

        System.out.println(a1==b1);       //false

        //for checking only values of string use .equals method
        System.out.println(a1.equals(b1));   //true

    }
}