import java.util.HashMap;

public class hashmap_example {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "Bruce Wayne");
        map.put(2, "Clark Kent");
        map.put(3, "Lois Lane");
        map.put(4, "Harvey Dent");
        map.put(4, "Alfred"); // it will override the value....

        System.out.println(map); // no insertion order..
        if(map.containsKey(2)) System.out.println(map.get(2));  
        System.out.println(map.values());
        System.out.println(map.keySet());
        System.out.println(map.get(3));   
        System.out.println(map.getOrDefault(22,"Not Found...😶‍🌫️")); 
        System.out.println(map.replace(66,"Joker"));  
        System.out.println(map);
    }
}
