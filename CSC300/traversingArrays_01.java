// Polina

/*
Write a function that adds all elements together in an integer array.
*/

public int sum(int[] a) {
  int sum = 0;
  for (int i=0; i<a.length; i++) {
    sum += a[i];
  }
  return sum;
}
