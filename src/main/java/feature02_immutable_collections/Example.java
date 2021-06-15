package feature02_immutable_collections;

import java.util.*;


/***
 * --/ Java 9 Feature 2                          /--
 * --/ Factory Methods for Immutable Collections /--
 *
 * factory methods were introduced to create Immutable List, Set, Map and Map.Entry objects
 * Collections.unmodifiableXXX were used priviously
 *
 *
 */
public class Example {

    public static void main(String[] args) {


        // * LISTS *

        List.of();
        List.of(1);
        List<Integer> intList = List.of(1, 2);         // fixed-argument form overloads up to 10 elements
        List.of(1, 2, 3, 5,6,7,8,9,10,11,12,13,14,15);         // fixed-argument form overloads up to 10 elements
        //List.of(elements...) ;  // varargs form supports an arbitrary number of elements or an array
        // Exception in thread "main" java.lang.UnsupportedOperationException
        //        at java.base/java.util.ImmutableCollections.uoe(ImmutableCollections.java:72)
        intList.set(0,0);


        // * SETS *
        Set<String> stringSet = Set.of("a", "b", "c");



        //  * MAPS *
        //  Map has two sets of methods: of() methods and ofEntries() methods
        //      to create an Immutable Map object and an Immutable Map.Entry object respectively.
        Map emptyImmutableMap = Map.of();
        Map nonemptyImmutableMap = Map.of(1, "one", 2, "two", 3, "three");
        // varargs form supports an arbitrary number of Entry objects or an array
//        Map.ofEnt

        /// * Extras *

        // * Singleton List *
        List<String> list1 = Collections.singletonList("E");

        // print the list
        System.out.println("singletonList : " + list1);

        // * Singleton List w/exception *

        try {

            // create singleton list
            // using method singletonList() method
            List<Integer> list2 = Collections.singletonList(20);

            // print the list
            System.out.println("singletonList : " + list2);
        }

        catch (IllegalArgumentException e) {
            System.out.println("Exception thrown : " + e);
        }
    }
}
