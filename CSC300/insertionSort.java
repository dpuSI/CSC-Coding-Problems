// Title: Insertion Sort
// Original author: Luis

// Question
/*
*/

// Answer
public static void insertionSort (Comparable[] a) {
  int n = a.length;
  for (int i=0; i<n; i++) {
    for (int j=i; j>0; j--) {
      if (less(a[j], a[j-1])) {
        exch(a, j, j-1);
}  }  }  }