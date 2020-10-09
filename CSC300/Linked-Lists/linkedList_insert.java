// Polina

public void insert(int element) {

Node p= new Node(element, null);

if (first==null) {
first = p;
return;
}

Node temp = first;
while (temp.next != null)
    temp=temp.next;
temp.next=p;
return;
}
