/**
 * A simple Java program to demonstrate adding two numbers,
 * with minor performance considerations applied.
 */
public class Adder {

    // For such a simple operation, the 'add' method can be inlined directly
    // into the main method. In a larger application, keep methods for modularity
    // unless profiling indicates a specific bottleneck.
    // The original 'add' method is removed here as its logic is directly integrated.

    /**
     * Main method to execute the program.
     * It initializes two numbers, calculates their sum directly, and prints the result
     * using a single I/O operation.
     *
     * @param args Command line arguments (not used in this program).
     */
    public static void main(String[] args) {
        // Declare two numbers as final constants.
        // Compilers can perform constant folding and propagation for final variables,
        // potentially calculating 'sum' at compile time for this simple case.
        final int number1 = 10;
        final int number2 = 25;

        // Calculate the sum directly (manual inlining).
        // The JVM's JIT compiler would typically inline the 'add' method automatically
        // for such a simple operation, effectively doing this for you at runtime.
        final int sum = number1 + number2;

        // Print the result using a single System.out.println call.
        // This reduces the overhead associated with multiple I/O operations
        // and string builder creations for intermediate string concatenations.
        System.out.println("The first number is: " + number1 +
                           "\nThe second number is: " + number2 +
                           "\nThe sum of " + number1 + " and " + number2 + " is: " + sum);
    }
}