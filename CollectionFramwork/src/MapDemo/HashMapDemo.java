package MapDemo;

import java.util.HashMap;
import java.util.Map;


public class HashMapDemo {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("One",1);
        map.put("Two",2);
        map.put("Three",3);
        map.put("Four",4);
        map.put("Five",5);
        System.out.println(map);

        //fetch element
        // 01
        if (map.containsKey("One")) {
            System.out.println("Rajd");
            int val = map.get("One");
            System.out.println(val);
        }

        //02
        for (String key: map.keySet()) {
            System.out.println("Key : "+key+" Value : "+map.get(key));
        }

        //03
        for (Integer value:map.values()) {
            System.out.println("Key : "+value);
        }

        //04
        for (Map.Entry<String,Integer> entry : map.entrySet()) {
            System.out.println("Key: "+entry.getKey()+" Value: "+entry.getValue());
        }

        //05
        map.forEach((key,value)->{
            System.out.println("key : "+key);
            System.out.println("value : "+value);
        });

    }
}
