package lesson9.collections;

import java.util.Collection;
import java.util.LinkedHashMap;

public class MapCollection {

    public static void main(String[] args) {

        LinkedHashMap<String, Double> mapCollection = new LinkedHashMap<>();

//        someMethod();

        mapCollection.put("banana", 4.20);
        mapCollection.put("apple", 5.20);
        mapCollection.put("orange", 24.20);
        mapCollection.put("stawberry", null);
        mapCollection.put("banana", 5.20);
        mapCollection.put("banana", 12.20);

//        mapCollection.
       Collection<Double> collection =  mapCollection.values();
       mapCollection.remove("apple");
      Double priceOfBanana =  mapCollection.get("banana");
        System.out.println("Price of banana " + priceOfBanana);

        boolean b = mapCollection.containsKey("orange");

        mapCollection.forEach((key,value) -> System.out.println(key + " " + value));
//        System.out.println();
    }
}
