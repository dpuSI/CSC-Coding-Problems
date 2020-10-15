package algs11;
import stdlib.StdOut;

public class SortedArrayStudents {

	
		//Return number of elements in the array that are smaller than the given key
		public static int rank(int[] keys, int key) {
			return -1;
		}
		
		//Return the largest element that is less than or equal to the key
		public static int floor(int[] keys, int key) {
	        return -1;
		}
		
		//Return the smallest element that is greater than or equal to the key
		public static int ceiling(int[] keys, int key) {
			return -1;
		}
		
		
		
		public static void main(String[] args) {

			rankTests();
			System.out.println("Rank tests done");
			floorTests();
			System.out.println("Floor tests done");
			ceilingTests();
			System.out.println("Ceiling tests done");
		}

		private static void ceilingTests() {
			testCeiling("1,2,3,4,5,6",3,3);
			testCeiling("1,2,5,6",3,5);
		}

		private static void testCeiling(String arr, int key, int expected) {
			String str[] = arr.split(",");
			int array[] = new int[str.length];
			
			
			for(int i=0; i<str.length;i++) {
				array[i] = Integer.parseInt(str[i]);
			}
			
			int actual = ceiling(array,key);
			if(actual==expected) 
				StdOut.format("Ceiling test: Correct   Array: %s, Search int: %d, Actual: %d, Expected: %d\n",arr,key,actual,expected );
			else {
				StdOut.format("Ceiling test: Incorrect    Array: %s, Search int: %d, Actual: %d, Expected: %d\n",arr,key,actual,expected );
			}
			
		}

		private static void floorTests() {

			testFloor("1,2,3,4,5,6",3,3);
			testFloor("1",3,1);
			testFloor("1",1,1);
			testFloor("1,2,5,6",5,5);
			testFloor("1,5,6",6,6);
			testFloor("1,2,3,4,5,6",12,6);
			testFloor("4,5,6",2,-1);
			testFloor("4,5,6",4,4);
		
		}


		private static void testFloor(String arr, int key, int expected) {
			String str[] = arr.split(",");
			int array[] = new int[str.length];
			
			
			for(int i=0; i<str.length;i++) {
				array[i] = Integer.parseInt(str[i]);
			}
			
			int actual = floor(array,key);
			if(actual==expected) 
				StdOut.format("Floor test: Correct   Array: %s, Search int: %d, Actual: %d, Expected: %d\n",arr,key,actual,expected );
			else {
				StdOut.format("Floor test: Incorrect    Array: %s, Search int: %d, Actual: %d, Expected: %d\n",arr,key,actual,expected );
			}
		}
			


		private static void rankTests() {
			//only sorted arrays
			testRank("1,2,3,4,5,6",3,2); 
			testRank("1",1,0);
			testRank("1",0,0);
			testRank("1,2,5,6",3,2);
			testRank("1,2,3,4,5,6",6,5);
			testRank("1,2,3,4,5,6",7,6);
			testRank("5,6",1,0);
		}

		
		private static void testRank(String arr, int key, int expected) {
			String str[] = arr.split(",");
			int array[] = new int[str.length];
			
			
			for(int i=0; i<str.length;i++) {
				array[i] = Integer.parseInt(str[i]);
			}
			
			int actual = rank(array,key);
			if(actual==expected) 
				StdOut.format("Rank test: Correct   Array: %s, Search int: %d, Actual: %d, Expected: %d\n",arr,key,actual,expected );
			else {
				StdOut.format("Rank test: Incorrect    Array: %s, Search int: %d, Actual: %d, Expected: %d\n",arr,key,actual,expected );
			}
		}

	}

	
	
	
	

