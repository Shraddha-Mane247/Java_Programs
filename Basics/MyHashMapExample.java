import java.util.*;
public class MyHashMapExample {
    public static void main(String args[])
    {
        HashMap<Integer, String> h1 = new HashMap<Integer, String>();
        h1.put(1, "Shraddha");
        h1.put(2, "Karuna");
        h1.put(3, "Monika");
        h1.put(4,"Usha");
        h1.put(5,"Ankush");
        
        for (Map.Entry<Integer, String> e1 : h1.entrySet()) {
            System.out.println("Key: " + e1.getKey() + ", Value: " + e1.getValue());
        }
    }
}
