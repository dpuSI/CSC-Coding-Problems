/**
 * Backward recursive example of powerN. This calculates the mathematical answer of base ^ exponent. 
 * Method functionality akin to Math.pow().
 *
 * @author  Antonio Gaspari
 *
 * @param base The base number. The number to be raised to an exponent
 *
 * @param exponent The exponent. The number that the base is raised to: base ^ exponent. 
 *
 * @return The result of base ^ N for all exponent > 0; -1 otherwise.
 */
public static int powerNBackward(int base, int exponent) {
    if (exponent < 0) return -1;                      // Error case. If user inserts negative exponent, return -1 to indicate error.
    if (exponent == 0) return 1;                      // Base Case. Once the exponent has reached 0, we know we have multiplied the necessariry amount of times.
    
    return base * powerNBackward(base, exponent - 1); // Multiple the base times the result of remaining multiplications. This will result in a backwards recursion that multiplies base * base, exponent number of times.
}

/**
 * Forward recursive example of powerN. This calculates the mathematical answer of base ^ exponent. 
 * Method functionality akin to Math.pow().
 *
 * @author  Antonio Gaspari
 *
 * @param base The base number. The number to be raised to an exponent
 *
 * @param exponent The exponent. The number that the base is raised to: base ^ exponent. 
 *
 * @return The result of base ^ N for all exponent > 0; -1 otherwise.
 */

public static int powerNForward(int base, int exponent) {
    if (exponent < 0) return -1; // If negative exponent is passed, return -1, to indicate error.

    return powerNForward(base, exponent, 1); // Call the recursive helper function with base and exponent, while also passing the initial result "1".
}

/**
 * Forward recursive helper for powerN. 
 *
 * @author Antonio Gaspari
 *
 * @param base The base number. The number to be raised to an exponent
 *
 * @param exponent The exponent. The number that the base is raised to: base ^ exponent. 
 *
 * @param result The accumulator variable. This variable helps us keep track of the running total for the result that we will pass at the end.
 *
 * @return The result of base ^ N.
 */

private static int powerNForwardHelper(int base, int exponent, int result) {
    if (exponent == 0) return result;              // Base Case. Once the exponent has reached 0, we know we have multiplied the necessariry amount of times.
    
    result = result * base;

    return powerNForwardHelper(base, exponent - 1, result); // Multiple the base times the result of remaining multiplications. This will result in a backwards recursion that multiplies base * base, exponent number of times.
}

public static void main(String[] args) {
    // Normal Case
    // Calculates 3 ^ 5
    System.out.println(powerNBackwards(3, 5));
    System.out.println(powerNForward(3, 5));

    // Normal Case
    // Calculates 5 ^ 3
    System.out.println(powerNBackwards(5, 3));
    System.out.println(powerNForward(5, 3));

    // One Case
    // Calculates 15 ^ 1
    System.out.println(powerNBackwards(15, 1));
    System.out.println(powerNForward(15, 1));

    // Zero Case
    // Calculates 3 ^ 0
    System.out.println(powerNBackwards(3, 0));
    System.out.println(powerNForward(3, 0));
    
    // Negative Case
    // Calculates 10 ^ -5, which in our code, is an error.
    System.out.println(powerNBackwards(10, -5));
    System.out.println(powerNForward(10, -5));
}