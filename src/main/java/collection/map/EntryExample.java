package collection.map;

import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;

/* Map.Entry Examples
Map.Entry is an interface,
EntrySet is an Object containing both the key and the value

typically you get just the key or the value (see first loop)
entry allows you to get both for each entry in the map.

 */
public class EntryExample {

    public static class Book {
        private String title;
        private String author;

        public Book(String title, String author) {
            this.title = title;
            this.author = author;
        }
    }

    public static void main(String[] args) {

        Map<String, String> bookMap = new HashMap<>();
        bookMap.put("Robert C. Martin", "Clean Code");
        bookMap.put("Joshua Bloch", "Effective Java");


        // this requires 2 steps
        for (String key : bookMap.keySet()) {
            System.out.println("key: " + key + " value: " + bookMap.get(key));
        }

        // Map.Entry more effecient (supposedly as it doesn't need two steps; but in my mind I still see two)
        for (Map.Entry<String, String> book: bookMap.entrySet()) {
            System.out.println("key: " + book.getKey() + " value: " + book.getValue());
        }


        // TUPLE
        //create a Map.Entry tuple with the ISBN as the key and the Book object as the value:
        Map.Entry<String, Book> tuple;
        tuple = new AbstractMap.SimpleEntry<>("9780134685991", new Book("Effective Java 3d Edition", "Joshua Bloch"));

    }
}
