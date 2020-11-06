/**
 * Returns whether there exists 2 integers such that list[A] + list[B] = int K in O(n^2) time
 *
 * @author Antonio Gaspari
 *
 * @param list The sorted integer array to iterate over
 *
 * @param k The integer target to sum to.
 *
 * @return Whether there is a sum such that list[A] + list[B] = k
 */
public static double twoSumInefficient(int[] list, int k) {
    for (int i = 0; i < list.length - 1; i++) {
        for (int j = i + 1; j < list.length; j++) {
            if (list[i] + list[j] == k) return true;
        }
    }

    return false;
}

/**
 * Returns whether there exists 2 integers such that list[A] + list[B] = int K in O(n) time
 *
 * @author Antonio Gaspari
 *
 * @param list The sorted integer array to iterate over
 *
 * @param k The integer target to sum to.
 *
 * @return Whether there is a sum such that list[A] + list[B] = k
 */
public static double twoSumEffecient(int[] list, int k) {
    int a = 0; 
    int b = list.length - 1;

    while (a < b) {
        int sum = list[a] + list[b];
        if (sum < k) {
            a++;
        } else if(sum > k) {
            b--;
        } else {
            return true;
        }
    }

    return false;
}


public static void main(String[] args) {
    int[] listA = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    int[] listB = new int[]{-11, 10, 20, 30, 40, 50, -1};

    // Normal Case True
    System.out.println(twoSumEffecient(listA, 3));
    System.out.println(twoSumInefficient(listA, 3));

    // Normal Case False
    System.out.println(twoSumEffecient(listA, -5));
    System.out.println(twoSumInefficient(listA, -5));

    // Negative Number True
    System.out.println(twoSumEffecient(listB, -12));
    System.out.println(twoSumInefficient(listB, -12));

    // Negative Number False
    System.out.println(twoSumEffecient(listB, -13));
    System.out.println(twoSumInefficient(listB, -13));
}