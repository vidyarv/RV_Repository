public class NewTest {
    public static void main(String[] args) {

        // Fibonacci
        // Test 0
        if (FibonacciRecursive.fibonacci(8) == 21) {
            System.out.println("NewTest  Passed for 8");
            System.exit(0);
        }
        else {
            System.out.println("NewTest failed for 8");
            System.exit(1);
        }
    }
}