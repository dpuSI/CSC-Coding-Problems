package algs12;



import algs13.Queue;

public class SymbolTableSIKey < Key extends Comparable<Key>, Value extends Comparable<Value>> {
	
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
    public SymbolTableSIKey() {
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
		return duplicateValuesHelper(first, value, 0);
	}

	private int duplicateValuesHelper(Node x, Value value, int result) {
		if(x==null)return result;

		if(this.get(x.key).equals(value)) {
			result++;
		}
		return duplicateValuesHelper(x.next,value,result);
	}
	
	
	//Problem 2
	//Given the key, inverse its key and value pair
	//You will not create a new ST, but use the existing one
	//The ST in the test cases is of type SymbolTableSIKey<String,String>
    //Write additional test cases
	
	public void switchKeyValue(Key key) {

	
		if(this.first == null) return;
		Node x = first;
		while(x!=null) {
			if(x.key.equals(key)) {
				Value val = get(x.key);
				delete(key);
				put((Key)val,(Value)key);
			}
			x = x.next;
		}
	}
	
	//Problem 3
	//Return the largest key in the ST
	//Write additional test cases
	
	public Key largestKey() {
		
		if(this.first == null)return null;
		Key largest = first.key;
		Node x= first.next;
		while(x.next!=null) {
			if(largest.compareTo(x.key) < 0 ) {
				largest = x.key;
			}
			x=x.next;
		}
		/*
		if(x.key.compareTo(largest) >0) {
			largest = x.key;
		}
		*/
		return largest;
	}
	
	//Problem 4
	//Return the position of the largest key in the ST
	//Write additional test cases
	
	public int largestKeyPos() {
		if(this.first == null) return -1;
		int index = 1; //Position in the symbol table
		int position = 0; //Position of the first element is the largest
		Key largestKey = first.key;
		Node x = first.next;
		while(x.next!=null) {
			
			if(x.key.compareTo(largestKey)>0) {
				largestKey = x.key;
				
				position = index;
				
			}
			//System.out.println(position);
			x = x.next;
			index++;
		}
		/*
		if(x.key.compareTo(largestKey)>0) {
			largestKey = x.key;
			position = index;
		}
		*/
		return position;
		
	}
	
    
    
    public Iterable<Key>  keys() {
    	Queue<Key> theKeys = new Queue<Key>();
    	for ( Node temp = first; temp != null; temp=temp.next) {
    		theKeys.enqueue(temp.key);
    	}
    	return theKeys;
    }
	
	
	public static void main(String[] args) {
		

		
		
		problem1Tests();
		problem2Tests();
		
		SymbolTableSIKey<String,Integer> st = new SymbolTableSIKey<String,Integer>();
		//SymbolTableSIKey<String,String> stStr = new SymbolTableSIKey<String,String>();
		 


		st.put("z",1);
		st.put("i",2);
		
		st.put("o",3);
		st.put("d",4);
		st.put("p",5);
		
		System.out.println(st.largestKeyPos());
		//System.out.println(st.largestKey());
		
		SymbolTableSIKey<String,String> stStr = new SymbolTableSIKey<String,String>();
		/*
		st.put("hello",1);
		stStr.put("a","b");
		return st.get("hello") == stStr.get("a");
		Object o;
		o=new String("a");
		Object a = new String("b");
		Object oo = new Object();
		String str = (String)oo;
		Object n = str;
		System.out.println(oo + "a");
		String s = "1";
		Integer i = Integer.parseInt(s);
		String saa = Integer.toString(1);
		System.out.println(a+o);
		o=4;
		*/
			
	}

private static void problem1Tests() {
	
	
		String vals = "abcdaafb";
		SymbolTableSIKey<Integer,String> st = new SymbolTableSIKey<Integer,String>();
		for (int i=0; i < vals.length(); i++) {
			st.put(i,vals.substring(i, i+1));
		}
		System.out.println("Problem 1 Results: \n ");
		System.out.println("Expected: 3 Actual: " + st.duplicateValues("a"));
		System.out.println("Expected: 2 Actual: " + st.duplicateValues("b"));
		System.out.println("Expected: 1 Actual: " + st.duplicateValues("c"));
		System.out.println("Expected: 0 Actual: " + st.duplicateValues("z"));
		System.out.println("*********************************");
		
		/*
		st.switchKeyValue(3);
		System.out.print("Changing key \"3\"...  " +"Expected: d 4 2 1 0 Actual: ");
		for(Integer key:st.keys()) {
			System.out.print(key + " ");
		}
		System.out.println();
		*/
	}

	private static void problem2Tests() {
		System.out.println("Problem 2 Results: \n ");
		String vals = "abcde";
		
		SymbolTableSIKey<String,String> stString = new SymbolTableSIKey<String,String>();
		
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
