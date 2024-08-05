import java.util.function.Predicate;
import java.util.function.Function;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class BuiltIn {
    public static void main(String[] args) {
        // Predicate: checks if a string is empty
        Predicate<String> isEmpty = str -> str.isEmpty();
        System.out.println("Is string empty? " + isEmpty.test("")); // Output: true

        // Function: converts a string to its length
        Function<String, Integer> stringLength = str -> str.length();
        System.out.println("Length of 'hello': " + stringLength.apply("hello")); // Output: 5

        // Consumer: prints a string to the console
        Consumer<String> printString = str -> System.out.println("Printed: " + str);
        printString.accept("Hello, world!"); // Output: Printed: Hello, world!

        // Supplier: provides a default string
        Supplier<String> defaultString = () -> "Default String";
        System.out.println("Supplier provides: " + defaultString.get()); // Output: Default String
    }
}

