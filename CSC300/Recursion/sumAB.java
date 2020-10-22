/**
 * Will sum the numbers starting from a ending at b using BackwardRecursion.
 *
 * @author Antonio Gaspari
 *
 * @param a The starting number to sum from.
 *
 * @param b The final number to sum to.
 *
 * @param result The accumulator variable. This will track the running total of result, which will be the total sum from a to b.
 *
 * @return The resulting sum from a to b.
 */

public static int sumABBackward(int a, int b) {
    if (a == b) return a;

    return a + sumAB(a + 1, b);
}

/**
 * Will sum the numbers starting from a ending at b using ForwardRecursion.
 *
 * @author Antonio Gaspari
 *
 * @param a The starting number to sum from.
 *
 * @param b The final number to sum to.
 *
 * @param result The accumulator variable. This will track the running total of result, which will be the total sum from a to b.
 *
 * @return The resulting sum from a to b.
 */

public static int sumABForward(int a, int b) {
    return sumABForwardHelper(a, b, 0);
}

/**
 * Forward recursive helper for sumABForward. 
 *
 * @author Antonio Gaspari
 *
 * @param a The starting number to sum from.
 *
 * @param b The final number to sum to.
 *
 * @param result The accumulator variable. This will track the running total of result, which will be the total sum from a to b.
 *
 * @return The resulting sum from a to b.
 */

private static int sumABForwardHelper(int a, int b, int result) {
    if (a == b) {
        return a + result;
    }

    return sumABForwardHelper(a + 1, b, a + result);
}

public static void main(String[] args) {
    // Normal Case
    System.out.println(sumABBackward(3, 5));
    System.out.println(sumABForward(3, 5));

    // Normal Case
    System.out.println(sumABBackward(5, 15));
    System.out.println(sumABForward(5, 15));

    // Equal Case
    System.out.println(sumABBackward(15, 15));
    System.out.println(sumABForward(15, 15));

    // Zero Case
    System.out.println(sumABBackward(-3, 3));
    System.out.println(sumABForward(-3, 3));
    
    // Negative Case
    System.out.println(sumABBackward(-15, 4));
    System.out.println(sumABForward(-15, 4));
}