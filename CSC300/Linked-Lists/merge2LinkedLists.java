
/**
 * Merges two LinkedLists by appending the second to the end of the first.
 *
 * @author Antonio Gaspari
 *
 * @param a The first LinkedList. 
 *
 * @param b The second LinkedList. To be appended to the end of the first LinkedList (a).
 *
 * @return Returns the merged LinkedLists.
 *
 */
public static Node merge2LinkedLists(Node a, Node b) {
    if (a == null) return b; // Returns b if a is null, if b is also null, null merged with null is still null

    Node x = a; // Node to iterate through the list.

    while (x.next != null) {
        x = x.next;
    }

    x.next = b;

    return a;
}


public static void main(String[] args) {
    // Normal Case
    Node listA1 = of("1 2 3 4 5 6 7 8 9");
    Node listA2 = of("1 2 3 4 5 6 7 8 9");
    System.out.println(toString(merge2LinkedLists(listA1, listA2)));

    // Normal Case
    Node listB1 = of("10 20 30 40 50 60 70");
    Node listB2 = of("70 60 50 40 30 20 10");
    System.out.println(toString(merge2LinkedLists(listB1, listB2)));

    // Single Case
    Node listC1 = of("1");
    Node listC2 = of("1");
    System.out.println(toString(merge2LinkedLists(listC1, listC2)));

    // First Null
    Node listD1 = null;
    Node listD2 = of("1 2 3 4 5 6 7 8 9");
    System.out.println(toString(merge2LinkedLists(listD1, listD2)));

    // Second Null
    Node listE1 = of("1 2 3 4 5 6 7 8 9");
    Node listE2 = null;
    System.out.println(toString(merge2LinkedLists(listE1, listE2)));

    // Both null
    Node listF1 = null;
    Node listF2 = null;
    System.out.println(toString(merge2LinkedLists(listF1, listF2)));
}

/*
 * Helper classes and methods for the above problems.
 */
private class Node {
    Node next;
    int data;

    Node (int data, Node next) {
        this.next = next;
        this.data = data;
    }
}

private static String toString(Node n) {
    DecimalFormat format = new DecimalFormat("#.###");
    StringBuilder result = new StringBuilder("[ ");
    for (Node x = n; x != null; x = x.next) {
        result.append(format.format(x.item));
        result.append(" ");
    }
    result.append("]");
    return result.toString();
}

private static Node of(String s) {
    Node first = null;
    if ("".equals(s))
        return first;

    String[] nums = s.split(" ");
    for (int i = nums.length - 1; i >= 0; i--) {
        try {
            int num = Integer.parseInt(nums[i]);
            first = new Node(num, first);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(
                    String.format("Bad argument \"%s\": could not parse \"%s\" as a double", s, nums[i]));
        }
    }
    return first;
}