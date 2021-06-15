package varargs;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
MY NOTES on this example:
Heap Polution is cause

heap pollution is a situation that arises when a variable of a parameterized type
 refers to an object that is not of that parameterized type

 */

public class HeapPolution {
    static String firstOfFirst(List<String>... strings) {
        List<Integer> ints = Collections.singletonList(42);
        Object[] objects = strings;

        objects[0] = ints; // Heap pollution

        return strings[0].get(0); // ClassCastException
    }

    public static void main(String[] args) {
        String one = firstOfFirst(Arrays.asList("one", "two"), Collections.emptyList());
    }
}
