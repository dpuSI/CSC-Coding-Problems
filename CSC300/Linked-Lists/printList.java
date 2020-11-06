/**
 * Prints every value in LinkedList from head to tail iteratively.
 *
 * @author Mikala Metzger
 *
 * @param head Head of the LinkedList structure.
 *
 * @return void List is printed, not returned.
 */
 public static void printListIterative (Node head) {
   Node curr = head;   // set the head to local value to avoid corruption

   for (; curr != null; curr = curr.next) {  // for each node, grab the next node
     System.out.printf("%d ", curr.data);    // print the data of current node
   }

   System.out.println();  // print extra line for prettiness
 }


 /**
  * Prints every value in LinkedList from head to tail recursively.
  *
  * @author Mikala Metzger
  *
  * @param n Head of or current node of the LinkedList structure.
  *
  * @return void List is printed, not returned.
  */
  public static void printListRecursive (Node n) {
    if (n == null) {  // if n is null, at the end of the list
      System.out.println();  // print extra line for prettiness
      return;         // so, end function
    }
    else {
      System.out.printf("%d ", n.data);    // print the data of current node
      printListRecursive(n.next);         // call for the next node
    }
  }


  public static void main(String[] args) {
      // Normal Case
      Node listA = of("1 2 3 4 5 6 7 8 9");
      System.out.println(printListIterative(listA));
      System.out.println(printListRecursive(listA));

      // Normal Case
      Node listB = of("10 20 30 40 50 60 70");
      System.out.println(printListIterative(listB));
      System.out.println(printListRecursive(listB));

      // Single Case
      Node listC = of("1");
      System.out.println(printListIterative(listC));
      System.out.println(printListRecursive(listC));


      // Empty Case
      Node listD = of(" ");
      System.out.println(printListIterative(listD));
      System.out.println(printListRecursive(listD));
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
