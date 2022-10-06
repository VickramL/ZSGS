package practise;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Map<Integer,String> mapDemo = new HashMap<>();
        mapDemo.put(96,"Vickram");
        mapDemo.put(73,"Karthi");
        mapDemo.put(58,"Barath");
        mapDemo.put(64,"Manikandan");
//        System.out.println(mapDemo);
//        System.out.println();
        System.out.println(mapDemo.keySet());
        System.out.println(mapDemo.values());
        System.out.println(mapDemo.entrySet());
        mapDemo.replace(81,"maanikkam");
        mapDemo.putIfAbsent(48,"ravi");
        System.out.println(mapDemo);
        System.out.println(mapDemo.containsKey(11));
        System.out.println(mapDemo.containsKey(96));

    }
}
