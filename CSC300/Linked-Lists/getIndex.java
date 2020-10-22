/**
 * Returns index of value in LinkedList.
 *
 * @author Antonio Gaspari
 *
 * @param node Head of the LinkedList structure.
 *
 * @param k Value k is the value that the algorithm is to search in the LinkedList.
 *
 * @return  The integer index of the parameter k in LinkedList node
 */
public static int getIndexIterative(Node node, int k) {
    Node n = node; // Initialize new node, n to start at provided 'node' and to iterate over.
    int counter = 0; // Initialize counter variable 'counter' to hold the index value.

    while (n != null) {
        if (n.data == k) return counter;
        counter += 1;
        n = n.next;
    }
    return -1;
}

/**
 * Returns index of value in LinkedList, using BackwardRecursion.
 *
 * @author Antonio Gaspari
 *
 * @param node Head of the LinkedList structure.
 *
 * @param k Value k is the value that the algorithm is to search in the LinkedList.
 *
 * @return  The integer index of the parameter k in LinkedList node
 */
public static int getIndexRecursiveBackward(Node node, int k) {
    if (node == null) {
        return -1;
    }

    if (node.data == k) {
        return 1;
    }

    int index = getIndexRecursiveBackward(node.next, k);

    if (index < 0) {
        return -1;
    } else {
        return 1 + getIndexRecursiveBackward(node.next, k);
    }
}

/**
 * Returns index of value in LinkedList.
 *
 * @author Antonio Gaspari
 *
 * @param node Head of the LinkedList structure.
 *
 * @param k Value k is the value that the algorithm is to search in the LinkedList.
 *
 * @return  The integer index of the parameter k in LinkedList node
 */
public static int getIndexRecursiveForward(Node node, int k) {
    return getIndexRecursiveForwardHelper(node, k, 0);
}

/**
 * Helper for getIndexRecursiveForward
 *
 * @author Antonio Gaspari
 *
 * @param node Head of the LinkedList structure.
 *
 * @param k Value k is the value that the algorithm is to search in the LinkedList.
 *
 * @param result Value that stores value of result, to be returned at the end.
 *
 * @return  The integer index of the parameter k in LinkedList node
 */
private static int getIndexRecursiveForwardHelper(Node node, int k, int result) {
    if (node == null) {
        return -1;
    }

    if (node.data == k) {
        return result + 1;
    } else {
        return getIndexRecursiveForwardHelper(node.next, k, result + 1);
    }
}


public static void main(String[] args) {
    // Normal Case
    Node listA = of("1 2 3 4 5 6 7 8 9");
    System.out.println(getIndexIterative(listA, 2));
    System.out.println(getIndexRecursiveBackward(listA, 2));
    System.out.println(getIndexRecursiveForward(listA, 2));

    // Normal Case
    Node listB = of("10 20 30 40 50 60 70");
    System.out.println(getIndexIterative(listB, 50));
    System.out.println(getIndexRecursiveBackward(listB, 50));
    System.out.println(getIndexRecursiveForward(listB, 50));

    // Single Case
    Node listD = of("1");
    System.out.println(getIndexIterative(listD, 1));
    System.out.println(getIndexRecursiveBackward(listD, 1));
    System.out.println(getIndexRecursiveForward(listD, 1));

    // Not-Found Case
    Node listC = of("1 2 3 4 5 6 7 8 9");
    System.out.println(getIndexIterative(listC, 22));
    System.out.println(getIndexRecursiveBackward(listC, 22));
    System.out.println(getIndexRecursiveForward(listC, 22));

    // Empty Case
    Node listD = of(" ");
    System.out.println(getIndexIterative(listD, 2));
    System.out.println(getIndexRecursiveBackward(listD, 2));
    System.out.println(getIndexRecursiveForward(listD, 2));
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