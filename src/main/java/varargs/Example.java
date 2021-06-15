package varargs;

/**
 * RULES
 *
 * a method can only have one varargs parameter
 * varargs argument must be the last parameter
 *
 */
public class Example {

    public static void formatWithVarArgs(String... values) {
        // ...
    }
    public static void main(String[] args) {
        formatWithVarArgs();

        formatWithVarArgs("a", "b", "c", "d");
    }


}
