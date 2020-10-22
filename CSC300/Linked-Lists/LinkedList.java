/*
   LINKED LIST

   Contents
   I. Linked list class
   II. Fill-in-the-blank problems for SI leaders

   Provided by DePaul University Supplemental Instruction.
*/

/*
    I. Linked list class
*/
public class LinkedList {

  // internal Node class
  private class Node {
    Node next;
    int data;  // single int value as example

    // constructor
    Node (int d) {
      next = null;
      data = d;
    }
  }


  // fields
  Node head;


  // constructors
  LinkedList () {
    head = null;
  }

  LinkedList (Node n) {
    head = n;
  }

  LinkedList (int[] a) {
    // build a LinkedList where each int in a is the data of a Node
    Node prev = null;
    Node n = null;

    for (int i : a) {       // for each int in a
      n = new Node(i);      // construct a new Node
      if (prev != null) {   // if there is a previous Node
        prev.next = n;      // make the new Node the previous Node's successor
      } else {              // else if a previous Node doesn't exist
        head = n;           // the new Node must be the head
      }

      prev = n;             // set the previous Node
    }
  }


  // methods

  // print the data of the LinkedList in order
  public void printList () {
    Node curr = head;   // start at the beginning of the list

    for (; curr != null; curr = curr.next) {
      System.out.printf("%d ", curr.data);    // print the data of current node
    }
    System.out.println();
  }

  // insert a new piece of data into list
  public void insert (int element) {
    Node p = new Node(element);  // construct Node from given element

    if (first==null) {          // if list is empty
      first = p;                // make new Node head
      return;
    }

    Node temp = first;          // else
    while (temp.next != null) { // iterate down list until at last Node
      temp=temp.next;
    }
    temp.next=p;  // set new Node as new last Node
    return;
  }

  // delete first found Node with given data
  public void deleteData (int d)
    Node temp = head;
    Node prev = null;

    // If head node itself holds the key to be deleted
    if (temp != null && temp.data == d) {
      head = temp.next; // Changed head
      return;
    }

    while (temp != null && temp.data != d) {  // search for d in list
      prev = temp;
      temp = temp.next;
    }

    if (temp == null) return; // return if d not found

    prev.next = temp.next;   // if found, delink Node with data d
  }

  // reverse the order of the list
  public void reverseList () {
    Node prev = null;
    Node curr = head;           // starting at the head
    Node next = null;

    while (curr != null) {      // iterate through the list
        next = curr.next;       // set next to Node's successor
        curr.next = prev;       // switch Node's predeccesor to successor
        prev = curr;            // set prev to current Node
        current = next;         // iterate
    }

    head = prev;                // set the new head
  }
}
