/**
 * Returns the sum of numbers in a list.
 *
 * @author  Antonio Gaspari
 *
 * @param list  The integer array to iterate over
 *
 * @return  The sum of the list of numbers
 */
public static int sumList(int[] list) {
    int sum = 0;                            // Accumulator variable. We use this to keep track of the running sum throughout the loop.

    for (int i = 0; i < list.length; i++) { // We use this for loop to be able to iterate over every element in the list.
        sum += list[i];                     // At this point, we add the value of each element in the list, to the accumulator value, sum.
    }

    return sum;                             // After the loop finishes, we return the sum.
}


public static void main(String[] args) {
    // Normal Case
    int[] listA = new int[]{0, 1, 2, 3, 4, 5, 4, 3, 2, 1, 0};
    System.out.println(sumList(listA));

    // Normal Case
    int[] listB = new int[]{5, 10, 15, 20};
    System.out.println(sumList(listB));

    // Single Case
    int[] listC = new int[]{0};
    System.out.println(sumList(listC));
    
    // Empty Case
    int[] listD = new int[]{};
    System.out.println(sumList(listD));
}