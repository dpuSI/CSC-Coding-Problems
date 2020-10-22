/*
 *
 * Will be organizing code into files later
 *
 */
 

/*
 * Loops
 */

// Power N
/*
 * Given 2 inputs: an integer base, and an integer n. Return the base raised to the nth power.
 */
public static int powerN(int base, int exponent) {
    int total = 1;
    for (int i = 0; i < exponent; i++) {
        total *= base;
    }
}

// Sum a -> b
/*
 * Given 2 integer inputs, a and b, return the sum of numbers from a to b.
 */
public static int sumAB(int a, int b) {
    int total = 0;
    for (int i = a; i <= b; i++) {
        total += i;
    }
}


/*
 * Recursion
 */

// Power N
/*
 * Given 2 inputs: an integer base, and an integer n. Return the base raised to the nth power.
 */
public static int powerN(int base, int exponent) {
    if (exponent == 0) return 1;
    
    return base * powerN(base, exponent - 1);
}

/*
 * Given 2 integer inputs, a and b, return the sum of numbers from a to b.
 */
public static int sumAB(int a, int b) {
    if (a == b) return a;

    return a + sumAB(a + 1, b);
}

// What will be printing from running the below code?
public void f(int[] list, int n) { 
	if (list.length >= n) return 0;
	return list[n] + f(list, n + 1);
}

int[] myList = new int[]{1, 2, 4, 8, 2};
System.out.println(f(myList, 0));

// Answer: 17


/* What type of recursion is this?
Forward or Backward?
*/

static int sumFives(int[] arr, int i, int result){
	if (i == arr.length) return result;

	if (arr[i] == 5) {
		result += 5;
	}
	return sumFives(arr, i + 1, result)
}

/*
 * LinkedList
 */

// Linked Question #1
/*
Given the following input order - 
    push(1)
    push(2)
    pop()
    push(3)
    pop()
    push(4)
    push(5)
And it generate this structure -
    5 -> 4 -> 1 -> null
Was this generated via a stack or a queue?
*/

// Answer: Stack



// Given 2 linked lists, combine them into 1.

/* 
    5 -> 4 -> 3 -> 2 -> null
    9 -> 8 -> 7 -> 6 -> null

    returns: 5 -> 4 -> 3 -> 2 -> 9 -> 8 -> 7 -> 6 -> null
*/

public void merge2LinkedLists(Node a, Node b) {
    if (a == null) return b;

    Node x = a;

    while (x.next != null) {
        x = x.next;
    }

    x.next = b;
}


/*
 * Runtime
 */

//Runtime of following functions


// O(n ^ 2);
int sum2DList(int[][] list) {
    int sum = 0;
    for (int i = 0; i < list.length; i++) {
        for (int j = i; j < list.length; j++) {
            sum += a[i][j];
        }
    }
    return sum;
}


// O(n);
int sum2DList(int[] list) {
    int sum = 0;
    for (int i = 0; i < list.length; i++) {
        sum += a[i];
    }
    return sum;
}


// O(2 ^ n)
int fib(int n) { 
    if (n <= 1) 
        return n; 
    return fib(n-1) + fib(n-2); 
} 

// O(1)
int doMath(int a, int b, int c, int d, int e) {
    return ((a + b) + (c * 2)) * ((c + d) * e);
}

