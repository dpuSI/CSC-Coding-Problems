/**
 * Find the minimum of the stack using a for loop
 *
 * @author Mikala Metzger
 *
 * @param a Int array to iterate over.
 *
 * @return int Sum of the array.
 */
public int minFor (int[] a) {
  int min = Integer.MAX_VALUE;  // set the minimum to the maximum integer

  for (int i=0; i<a.length; i++) {  // set index to 0
                                    // while index less than length of a
                                    // increment index
    if (a[i] < min) { // if the value at index i less than the current min
      min = a[i];     // set min to this value
    }
  }

  return min; // return the minimum
}


/**
 * Find the minimum of the stack using a while loop
 *
 * @author Mikala Metzger
 *
 * @param a Int array to iterate over.
 *
 * @return int Sum of the array.
 */
 public int minWhile (int[] a) {
   int min = Integer.MAX_VALUE;  // set the minimum to the maximum integer

   int i = 0;           // set index to 0
   while (i<a.length) { // while index less than length of a

     if (a[i] < min) { // if the value at index i less than the current min
       min = a[i];     // set min to this value
     }

     i++; // increment index
   }

   return min; // return the minimum
 }


 /**
  * Find the minimum of the stack using a for each loop
  *
  * @author Mikala Metzger
  *
  * @param a Int array to iterate over.
  *
  * @return int Sum of the array.
  */
 public int minForEach (int[] a) {
   int min = Integer.MAX_VALUE;  // set the minimum to the maximum integer

   for (int e : a) {  // for each element e in a

     if (e < min) { // if e less than the current min
       min = e;     // set min to e
     }
   }

   return min; // return the minimum
 }
