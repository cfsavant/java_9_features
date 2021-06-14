package org.example.feature02_immutable_collections;

import java.util.List;
import java.util.Map;

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
        // LISTS

        //  1. Empty List Example
        List immutableList = List.of();

        //  2. Non-Empty List Example

        List immutableList = List.of("one","two","three");

        //  MAPS
        //  Map has two sets of methods: of() methods and ofEntries() methods
        //      to create an Immutable Map object and an Immutable Map.Entry object respectively.

        //  Empty Map Example
        Map emptyImmutableMap = Map.of();
        emptyImmutableMap ==> {};
        //        Non-Empty java.util.Map Example
        Map nonemptyImmutableMap = Map.of(1, "one", 2, "two", 3, "three");


    }
}
