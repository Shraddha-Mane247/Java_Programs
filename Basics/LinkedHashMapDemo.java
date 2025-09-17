import java.util.*;
public class LinkedHashMapDemo {
    public static void main(String args[])
    {
        LinkedHashMap<Integer, String>h1=new LinkedHashMap<Integer, String>();
        h1.put(1, "one");
        h1.put(2,"Two");
        h1.put(3,"Three");
        h1.put(4,"Four");
        h1.put(5,"Five");

        for (Map.Entry<Integer, String> e1 : h1.entrySet()) {
            System.out.println("Key: " + e1.getKey() + ", Value: " + e1.getValue());
        }
    }
}
