package collection.map;

import javax.xml.crypto.Data;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CreateExample {
    class User {

        String foo;
        String bar;
        public void User(String foo, String bar) {
            foo = foo;
            bar = bar;
        }
        public String getFooAsKey() {
            return foo;
        }
        public String getBarAsValue() {
            return bar;
        }
    }
    public static void main(String[] args) {

        Map<String, String> map1 = new HashMap<>();
        map1.put("Robert C. Martin", "Clean Code");
        map1.put("Joshua Bloch", "Effective Java");

        // note: this map is immutable
        Map.of("A", "32", "C", "34", "T", "53");



//        Map<String, Integer> map3 = Stream.of(
//                new User("A", "32"), new User("C", "34"), new User("C", "34")
//        ).collect(Collectors.toMap(User::getFooAsKey, User::getBarAsValue));


    }
}
