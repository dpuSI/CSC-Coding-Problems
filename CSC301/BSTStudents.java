package algs15;
import algs13.Queue;


public class BSTStudents <Key extends Comparable<Key>, Value>  {

	private Node root;  
	private int count; // for the number of nodes
	
	private class Node {
		private Key key;           
		private Value val;        
		private Node left, right;  

		public Node(Key key, Value val) {
			this.key = key;
			this.val = val;
		}
	}
	
	//Returns an Iterable containing the keys of the tree corresponding to an PREORDER traversal
	//Recursively!
	//ToDo #1
	public Iterable<Key> preorderKeys() {
		Queue<Key> q = new Queue<Key>();  
		return preorderHelper(q,root);
	}
	

	private Iterable<Key> preorderHelper(Queue<Key> q, Node x) {

		
		if(x != null) {
			q.enqueue(x.key);
			preorderHelper(q,x.left);
			preorderHelper(q,x.right);
		}
		
		return q;
	}


	//Returns the number of nodes in the tree that have exactly two children
	//ToDo #2
	public int numNodesWithExactlyTwoChildren() {
		return twoHelper(root);
	}
	
	
	
	private int twoHelper(Node x) {
		if(x.left ==null || x.right == null) {
			return 0;
		}
		return 1 + twoHelper(x.right) + twoHelper(x.left);
	}


	//Returns the sum of all the nodes in the tree that are bigger than the key provided
	//ToDo #3
	public int sumOfNodes(Key k) {
		return sumHelper(root,k);
	}


	
	private int sumHelper(Node x, Key k) {
		if(x==null) return 0;
		
		if(x.key.compareTo(k)>0) //x.key > k
			return (int)x.key + sumHelper(x.left,k) + sumHelper(x.right, k);
		return sumHelper(x.left,k) + sumHelper(x.right, k);
		
	}
	
	//Returns the node with the kth smallest key in the BST
	//You can assume that 1<=k<=n
	//ToDo #4
	private Node kthSmallest(int k) {
		return null;
	}


	//Returns the height of the tree
	//ToDo #5
	private int treeHeight() {
		return -1;
	}
	


	//Helper Funtions
	public void rPut(Key key, Value val) {
		if (key == null) throw new NullPointerException("first argument to put() is null");
		root = rPut(root, key, val);
	}

	private Node rPut(Node x, Key key, Value val) {
		if (x == null) return new Node(key, val);
		int cmp = key.compareTo(x.key);
		if      (cmp < 0) x.left  = rPut(x.left,  key, val);
		else if (cmp > 0) x.right = rPut(x.right, key, val);
		else              x.val   = val;
		return x;
	}
	
	
	
public static void main(String[] args) {
	BSTStudents<Integer,Integer> bst = new BSTStudents<Integer,Integer>();
	bst.rPut(3,1);
	bst.rPut(6,1);
	bst.rPut(2,1);
	bst.rPut(1,1);
	bst.rPut(5,1);
	//We insert 3,6,2,1,5 into the tree in this order
	
	Queue<Integer> q = (Queue)bst.preorderKeys(); //downcasting
	
	for(Integer item:q) {
		//System.out.println(item);
	}
	System.out.println();
	
	bst.rPut(8,1);
	bst.rPut(7,1);
	bst.rPut(9,1);
	
	//Second method
	//System.out.println(bst.numNodesWithExactlyTwoChildren());
	
	//Third method
	//System.out.println(bst.sumOfNodes(6));
	
	
	//Fourth method
	if(bst.kthSmallest(4) !=null) {
		System.out.println(bst.kthSmallest(4).key);
	}
	
	
	//Fifth method
	System.out.println(bst.treeHeight());
	

}
}


