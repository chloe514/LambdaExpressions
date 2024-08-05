public class FunctionalInterfaces {
    public static void main(String[] args) {
        // Custom functional interface for checking if a number is even
        CheckEven checkEven = number -> number % 2 == 0;
        System.out.println("Is 4 even? " + checkEven.test(4)); // Output: true

        // Custom functional interface for concatenating strings
        Concatenate concatenate = (str1, str2) -> str1 + str2;
        System.out.println("Concatenation: " + concatenate.concat("Hello, ", "world!")); // Output: Hello, world!
    }

    @FunctionalInterface
    interface CheckEven {
        boolean test(int number);
    }

    @FunctionalInterface
    interface Concatenate {
        String concat(String str1, String str2);
    }
}



