public Node reverse(Node first) {
Node prev=null;
Node current = first;
Node next=null;

while (current !=null) {
    next=current.next;
    current.next =prev;
    prev = current;
    current = next;
}

first=prev;
return first;
}
