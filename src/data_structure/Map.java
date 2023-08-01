package data_structure;

public class Map {
    public static void main(String[] args) {
        java.util.HashMap<String, Integer> map = new java.util.HashMap<>();
        map.put("a", 1);
        map.put("b", 2);
        map.put("c", 3);

        System.out.println(map.get("a"));
        System.out.println(map.get("b"));
        System.out.println(map.get("c"));

        // Loop in a map
        for (var item : map.entrySet()) {
            System.out.println(item.getKey() + " " + item.getValue());
        }

        // Check if a key exists
        System.out.println(map.containsKey("a"));

        // Check if a value exists
        System.out.println(map.containsValue(1));

        // Remove an item
        map.remove("a");

        // For Each In Map
        map.forEach((key, value) -> System.out.println(key + " " + value));

        // Clear a map
        map.clear();
    }
}
