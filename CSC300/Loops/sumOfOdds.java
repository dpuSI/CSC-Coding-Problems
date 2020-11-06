/**
 * Sum the odd numbers of an array using a for loop
 *
 * @author Mikala Metzger
 *
 * @param a Int array to iterate over.
 *
 * @return int Sum of odd numbers of the array.
 */
public static int sumOddFor(int [] a) {

  int sum = 0;  // initialize sum as 0

  for (int i=0; i<a.length; i++) {  // set index to 0
                                    // while index is less than length of a
                                    // increment index
      if (a[i] % 2 !=0) { // if the remainder of a[i] is not 0
          sum += a[i];    // add a[i] to the sum
      }

  }
  return sum; // return the sum
}


/**
 * Sum the odd numbers of an array using a while loop
 *
 * @author Mikala Metzger
 *
 * @param a Int array to iterate over.
 *
 * @return int Sum of odd numbers of the array.
 */
public static int sumOddWhile(int [] a) {

  int sum = 0;  // initialize sum as 0

  int i = 0;  // set index to 0
  while (i<a.length) {  // while index is less than length of a

    if (a[i] % 2 !=0) { // if the remainder of a[i] is not 0
        sum += a[i];    // add a[i] to the sum
    }
    i++;  // increment index
  }

  return sum; // return the sum
}


/**
 * Sum the odd numbers of an array using a for each loop
 *
 * @author Mikala Metzger
 *
 * @param a Int array to iterate over.
 *
 * @return int Sum of odd numbers of the array.
 */
public static int sumOddForEach(int [] a) {

  int sum = 0;  // initialize sum as 0

  for (int e : a) { // for each element in a

      if (e % 2 !=0) { // if the remainder of e is not 0
          sum += e;    // add e to the sum
      }

  }
  return sum; // return the sum
}
