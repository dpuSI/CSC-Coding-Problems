package algs12;


import algs13.Queue;

public class SymbolTableSI < Key extends Comparable<Key>, Value extends Comparable<Value>> {
	
	private Node first;      

    private class Node {
        private Key key;
        private Value val;
        private Node next;

        public Node(Key key, Value val, Node next)  {
            this.key  = key;
            this.val  = val;
            this.next = next;
        }
    }

    /**
     * Initializes an empty symbol table.
     */
    public SymbolTableSI() {
    	first = null;
    }

    /**
     * Returns the value associated with the given key in this symbol table.
     */
    public Value get(Key key) {
        if (key == null) throw new NullPointerException("argument to get() is null"); 
        for (Node x = first; x != null; x = x.next) {
            if (key.equals(x.key))
                return x.val;
        }
        return null;
    }

    /**
     * Inserts the specified key-value pair into the symbol table, overwriting the old 
     * value with the new value if the symbol table already contains the specified key.
     * Deletes the specified key (and its associated value) from this symbol table
     * if the specified value is null.
     */
    public void put(Key key, Value val) {
        if (key == null) throw new NullPointerException("first argument to put() is null"); 
        if (val == null) {
            delete(key);
            return;
        }

        for (Node x = first; x != null; x = x.next) {
            if (key.equals(x.key)) {
                x.val = val;
                return;
            }
        }
        first = new Node(key, val, first);
    }

    /**
     * Removes the specified key and its associated value from this symbol table     
     * (if the key is in this symbol table).    
     */
    public void delete(Key key) {
        if (key == null) throw new NullPointerException("argument to delete() is null"); 
        first = delete(first, key);
    }

    // delete key in sub-list beginning at Node x
    // return: the sub-list with the key removed
    // warning: function call stack too large if table is large
    private Node delete(Node x, Key key) {
        if (x == null) return null;
        if (key.equals(x.key)) {
            return x.next;
        }
        x.next = delete(x.next, key);
        return x;
    }

  
/*
 * 
 *     
 *     START FROM HERE
 *     |			|
 *     |			|
 *     |			|
 *     V			V
 */
    
    //Problem 1
	//Return the number of times you see a specific VALUE in the symbol table
	//If there is no key with the specified value, return 0
	//Use recursion
    //Use a helper method
    //Write additional test cases
	
	public int duplicateValues(Value value) {
		
		//To Do #1
		return -1;
	}
	
	
	//Problem 2
	//Given the key, inverse its key and value pair
	//You will not create a new ST, but use the existing one
	//The ST in the test cases is of type SymbolTableSI<String,String>
    //Write additional test cases
	
	public void switchKeyValue(Key key) {
		//To Do #2
	}
	
    
    
    public Iterable<Key> keys() {
    	Queue<Key> theKeys = new Queue<Key>();
    	for ( Node temp = first; temp != null; temp=temp.next) {
    		theKeys.enqueue(temp.key);
    	}
    	return theKeys;
    }
	
	
	public static void main(String[] args) {
		
		problem1Tests();
		problem2Tests();
			
	}

	private static void problem1Tests() {
		
		String vals = "abcdaafb";
		SymbolTableSI<Integer,String> st = new SymbolTableSI<Integer,String>();
		for (int i=0; i < vals.length(); i++) {
			st.put(i,vals.substring(i, i+1));
		}
		System.out.println("Problem 1 Results: \n ");
		System.out.println("Expected: 3 Actual: " + st.duplicateValues("a"));
		System.out.println("Expected: 2 Actual: " + st.duplicateValues("b"));
		System.out.println("Expected: 1 Actual: " + st.duplicateValues("c"));
		System.out.println("Expected: 0 Actual: " + st.duplicateValues("z"));
		System.out.println("*********************************");
	}

	private static void problem2Tests() {
		System.out.println("Problem 2 Results: \n ");
		String vals = "abcde";
		
		SymbolTableSI<String,String> stString = new SymbolTableSI<String,String>();
		
		for (int i=0; i < vals.length(); i++) {
			stString.put(Integer.toString(i),vals.substring(i, i+1));
		}
		System.out.println("Original ST keys: ");
		for(String key:stString.keys()) {
			System.out.print(key + " ");
		}
		System.out.println();
		
		stString.switchKeyValue("3");
		
		System.out.print("Changing key \"3\"...  " +"Expected: d 4 2 1 0 Actual: ");
		for(String key:stString.keys()) {
			System.out.print(key + " ");
		}
		System.out.println();
		stString.switchKeyValue("d");
		
		System.out.print("Changing key \"d\"...  " + "Expected: 3 4 2 1 0 Actual: ");
		for(String key:stString.keys()) {
			System.out.print(key + " ");
		}
		
		System.out.println();
		stString.switchKeyValue("0");
		
		System.out.print("Changing key \"0\"...  " + "Expected: a 3 4 2 1 Actual: ");
		for(String key:stString.keys()) {
			System.out.print(key + " ");
		}
		
		System.out.println();
		stString.switchKeyValue("5");
		
		System.out.print("Changing key \"5\"...  " + "Expected: a 3 4 2 1 Actual: ");
		for(String key:stString.keys()) {
			System.out.print(key + " ");
		}
		System.out.println("\n*********************************");
	}

}
