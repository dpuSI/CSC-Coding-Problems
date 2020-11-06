/**
 * Returns if the list is in pairs
 *
 * @author Antonio Gaspari
 *
 * @param list The integer array to iterate over
 *
 * @return Whether or not 
 */
public static double isInPairs(int[] list) {
    if (list.length > 0 && list.length % 2 == 0) return false;
    for (int i = 0; i < list.length; i += 2) {
        if (list[i] != list[i + 1]) {
            return false;
        }
    }

    return true;
}


public static void main(String[] args) {
    int[] listA = new int[]{1, 1, 2, 2, 20, 20, -1, -1};
    int[] listB = new int[]{1, 1, 2, 2, 20, 20, -1, 2};
    int[] listB = new int[]{1, 1, 2, 2, 20, 20, -1};

    // Normal Case passing
    System.out.println(isInPairs(listA)); // returns true

    // Normal Case failing
    System.out.println(isInPairs(listB)); // returns false

    // Odd Size Failing
    System.out.println(isInPairs(listC));
}