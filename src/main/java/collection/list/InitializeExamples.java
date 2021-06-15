package collection.list;

import java.util.Arrays;
import java.util.List;

public class InitializeExamples {
    public static void main(String[] args)   {
        // https://www.baeldung.com/java-init-list-one-line
        List<String> list = Arrays.asList(new String[]{"foo", "bar"});

        /* Literally a List not arraylist or linkedlist
            produces a fixed size List
        */


            List<String> list2 = Arrays.asList("foo", "bar");
            list2.set(0,"zero");  // can modify the value (list not immutable)
        //  list2.add("new element"); exception


        Integer[] integerArray = {1,2,3,4};
        List<Integer> listFromArray = List.of(integerArray);
        System.out.println("Elements in listFromArray:" + listFromArray);



    }
}

