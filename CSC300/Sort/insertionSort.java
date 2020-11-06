/**
 * Sort a list by moving values into place one-by-one in order.
 *
 * @author Luis
 *
 * @param a Container that needs to be sorted.
 *
 * @return void Changes persist through pass by reference.
 */
public static void insertionSort (Comparable[] a) {

  for (int i=0; i<a.length; i++) {  // for each value in the array
    for (int j=i; j>0; j--) {       // move the value left

      if (less(a[j], a[j-1])) {     // If the current val is less than the
                                    // value to the left
        exch(a, j, j-1);            // exhange the two values
      }
    }
  }
}
