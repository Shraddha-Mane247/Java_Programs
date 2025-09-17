import java.util.*;
public class LinkedHasMapPr3 {
    public static void main(String args[])
    {
        LinkedHashMap<String, List<String>> h1 = new LinkedHashMap<String, List<String>>();
        h1.put("India", Arrays.asList("Rohit", "virat", "Hardik"));
        h1.put("Australia", Arrays.asList("Steve", "David", "Aaron"));

       System.out.println("India Team PLayes List :");
        System.out.println("==============================");

        List<String> players = h1.get("India");
        System.out.println("" + players);

        System.out.println("\nAustralia Team PLayes List :");
        System.out.println("==============================");

        List<String> players1 = h1.get("Australia");
        System.out.println("" + players1);
  
    }
}
