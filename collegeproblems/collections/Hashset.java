package collegeproblems.collections;

import java.util.*;

public class Hashset {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();

        Collections.addAll(collection, "a1b2", "a1b2", "a1B2", "a1B2", "a1b2", "a1b2", "a1B2", "a1B2", "A1b2", "A1b2", "A1B2", "A1B2", "A1b2", "A1b2", "A1B2", "A1B2");

        Set<String> set = new HashSet<>(collection);
        for (String a : set) {
            System.out.print(a + " ");
        }
    }
}

/*
"a1b2"
"a1b2"
"a1B2"
"a1B2"
"a1b2"
"a1b2"
"a1B2"
"a1B2"
"A1b2"
"A1b2"
"A1B2"
"A1B2"
"A1b2"
"A1b2"
"A1B2"
"A1B2"
 */
