// Polina

/*
Let’s think of an algorithm that will split our list in two, alternating the
elements of the original one.
*/

public Node[] split(Node first) {
  Node a = first;
  Node b = first.next;
  split(a, b);
  return new Node[] {a, b};
}

public void split(Node odd, Node even) {
  if (odd == null || even == null) {
    return;
  }

  if (odd.next != null) {
    odd.next = odd.next.next;
  }

  if (even.next != null) {
    even.next = even.next.next;
  }

  split(odd.next, even.next);
}
