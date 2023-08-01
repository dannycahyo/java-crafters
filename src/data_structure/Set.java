package data_structure;

import java.util.HashSet;

public class Set {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<String>();
        set.add("London");
        set.add("Paris");
        set.add("New York");
        set.add("San Francisco");
        set.add("Beijing");
        set.add("New York");

        System.out.println(set);

        for (String s : set) {
            System.out.print(s.toUpperCase() + " ");
        }

        var i = set.iterator();
        while (i.hasNext()) {
            System.out.print(i.next().toLowerCase() + " ");
        }
    }
}
