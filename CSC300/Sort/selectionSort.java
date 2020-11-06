/**
 * Sort a list by moving values into place by swapping with neighbor.
 *
 * @author Luis
 *
 * @param a Container that needs to be sorted.
 *
 * @return void Changes persist through pass by reference.
 */
public static void selectionSort (Comparable[] a) {

  for (int i=0; i<a.length; i++) {  // for each value in a

    int min = i;  // min is current value (index)
    for (int j = i+1; j<a.length; j++) {  // for each value after a[i]

      if (less (a[j], a[min])) {  // if a[j] less than a[i]
        min = j;  // a[j] is the new value
      }

      exch(a, i, min);  // Exchange values at places a[i] and a[min]
    }
  }
}
