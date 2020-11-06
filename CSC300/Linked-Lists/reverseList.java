/**
 * Reverses the order of a LinkedList iteratively.
 *
 * @author Mikala Metzger
 *
 * @param head Head of the LinkedList structure.
 *
 * @return Node Return new head of list.
 */
public static Node reverseListIterative (Node head) {
  Node prev = null;
  Node curr = head;           // starting at the head
  Node next = null;

  while (curr != null) {      // iterate through the list
      next = curr.next;       // set next to Node's successor
      curr.next = prev;       // switch Node's successor to predeccesor
      prev = curr;            // set prev to current Node
      current = next;         // iterate
  }

  return prev;                // return the new head
}


/**
 * Reverses the order of a LinkedList recursively.
 *
 * @author Mikala Metzger
 *
 * @param head Head of the LinkedList structure.
 *
 * @return Node New head of list.
 */
 public static Node reverseListRecursive (Node head) {
   if (head == null) {  // if list is empty
     return head;       // there is nothing to reverse
   }
   else if (head.next == null) {  // if list is 1 element long
     return head;                 // there is nothing to reverse
   }
   else {
     return reverseListRecursiveHelper(null, head);  // call helper
   }
 }

 /**
  * Reverses the order of a LinkedList recursively helper.
  *
  * @author Mikala Metzger
  *
  * @param prev Original predeccesor of curr.
  *
  * @param curr Current node to switch .next of.
  *
  * @return Node Return new head of list.
  */
  public static Node reverseListRecursiveHelper (Node prev, Node curr) {
    if (curr == null) { // reached original tail of
      return prev;
    }
    else {
      Node next = curr.next;  // preserve original .next value to iterate
      curr.next = prev;       // set predeccesor to new successor
      reverseListRecursiveHelper(curr, next); // curr becomes prev, next becomes curr
    }
  }


  public static void main(String[] args) {
      // Normal Case
      Node listA = of("1 2 3 4 5 6 7 8 9");
      System.out.println(reverseListIterative(listA));
      System.out.println(reverseListRecursive(listA));

      // Normal Case
      Node listB = of("10 20 30 40 50 60 70");
      System.out.println(reverseListIterative(listB));
      System.out.println(reverseListRecursive(listB));

      // Single Case
      Node listC = of("1");
      System.out.println(reverseListIterative(listC));
      System.out.println(reverseListRecursive(listC));


      // Empty Case
      Node listD = of(" ");
      System.out.println(reverseListIterative(listD));
      System.out.println(reverseListRecursive(listD));
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
