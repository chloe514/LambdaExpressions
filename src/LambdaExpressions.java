public class LambdaExpressions {
    public static void main(String[] args) {
            // Lambda expression for addition
            Operation add = (a, b) -> a + b;
            System.out.println("Addition: " + add.operate(5, 3)); // Output: 8

            // Lambda expression for subtraction
            Operation subtract = (a, b) -> a - b;
            System.out.println("Subtraction: " + subtract.operate(5, 3)); // Output: 2

            // Lambda expression for multiplication
            Operation multiply = (a, b) -> a * b;
            System.out.println("Multiplication: " + multiply.operate(5, 3)); // Output: 15

            // Lambda expression for division
            Operation divide = (a, b) -> a / b;
            System.out.println("Division: " + divide.operate(6, 3)); // Output: 2
        }

        @FunctionalInterface
        interface Operation {
            int operate(int a, int b);
        }
    }


