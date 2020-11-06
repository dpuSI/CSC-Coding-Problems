/**
 * Inserts a new Node with the given element at the head of a LinkedList.
 *
 * @author Mikala Metzger
 *
 * @param head Head of the LinkedList structure.
 *
 * @param element Desired data value of new Node.
 *
 * @return Node New head of list.
 */
public static Node insertHead (Node head, int element) {
  Node p = new Node(element, head);  // construct Node from given element
  return p;
}


/**
 * Inserts a new Node with the given element at the tail of a LinkedList
 * using iteration.
 *
 * @author Mikala Metzger
 *
 * @param head Head of the LinkedList structure.
 *
 * @param element Desired data value of new Node.
 *
 * @return Node New head of list.
 */
public static Node insertTailIterative (Node head, int element) {
  Node p = new Node(element, null);  // construct Node from given element

  if (head == null) {   // if list is empty
    return p;           // make new Node head
  }

  Node temp = head;           // else
  while (temp.next != null) { // iterate down list until at last Node
    temp = temp.next;
  }

  temp.next = p;  // set new Node as new last Node
  return head;    // return head of list
}


/**
 * Inserts a new Node with the given element at the tail of a LinkedList
 * using recursion.
 *
 * @author Mikala Metzger
 *
 * @param head Head of the LinkedList structure.
 *
 * @param element Desired data value of new Node.
 *
 * @return Node New head of list.
 */
public static Node insertTailRecursive (Node head, int element) {
  Node p = new Node(element, null);  // construct Node from given element

  if (head == null) {   // if list is empty
    return p;           // make new Node head
  }
  else {
    insertTailRecursiveHelper(head, head, p);
  }
}

/**
 * Inserts a new Node with the given element at the tail of a LinkedList
 * using recursion.
 *
 * @author Mikala Metzger
 *
 * @param head Head of the LinkedList structure (shouldn't change).
 *
 * @param curr Current node of iteration.
 *
 * @param element Desired data value of new Node (shouldn't change).
 *
 * @return Node New head of list.
 */
public static Node insertTailRecursiveHelper (Node head, Node curr, Node p) {
  if (curr.next == null) {
    curr.next = p;
    return head;
  }
  else {
    insertTailRecursiveHelper(head, curr.next, p);
  }
}




public static void main(String[] args) {
    // Normal Case
    Node listA = of("1 2 3 4 5 6 7 8 9");
    System.out.println(insertHead(listA));
    System.out.println(insertTailIterative(listA));
    System.out.println(insertTailRecursive(listA));

    // Normal Case
    Node listB = of("10 20 30 40 50 60 70");
    System.out.println(insertHead(listB));
    System.out.println(insertTailIterative(listB));
    System.out.println(insertTailRecursive(listB));

    // Single Case
    Node listC = of("1");
    System.out.println(insertHead(listC));
    System.out.println(insertTailIterative(listC));
    System.out.println(insertTailRecursive(listC));


    // Empty Case
    Node listD = of(" ");
    System.out.println(insertHead(listD));
    System.out.println(insertTailIterative(listD));
    System.out.println(insertTailRecursive(listD));
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
