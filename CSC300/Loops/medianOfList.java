/**
 * Returns the median number in a list.
 *
 * @author Antonio Gaspari
 *
 * @param list The integer array to iterate over
 *
 * @return The median of a list of numbers
 */
public static double medianList(int[] list) {
    Arrays.sort(list); // Sort the list, to make it easier to find the middle.

    int size = list.length;
    if (size % 2 == 1) { // If size is odd, take middle number
        return list[size/2];
    }
    return (list[size/2] + list[(size/2) - 1]) / 2; // Average 2 most center numbers
}


public static void main(String[] args) {
    int[] listA = new int[]{0, 1, 2, 3, 4, 5, 4, 3, 2, 1, 0};
    int[] listB = new int[]{5, 4, 3, 2, 1, 0, 1, 2, 3, 4, 5};

    // Normal Case
    System.out.println(medianList(listA)); // returns 2
    System.out.println(medianList(listB)); // returns 3
}


/*
    Additional Note

    I received this as an interview question from the company CNA for their Software Engineering Internship, which I interviewed via the DePaul Tech Internship Fair.
  
*/