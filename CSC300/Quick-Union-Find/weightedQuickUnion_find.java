// Question
/*
Complete the find() function below, which returns the parent id of p using the
Weighted Quick Union implementation.
*/
/**
 * Find root of tree.
 *
 * @author Luis
 *
 * @param parent Array that stores the parents of each node.
 *
 * @param p Desired node to find root of.
 *
 * @return Int representing the root node.
 */
public static int find (int[] parent, int p) {
  while (____) {
    ____;
  }
  return p;
}

// Answer
/**
 * Find root of tree.
 * Full class: https://algs4.cs.princeton.edu/15uf/WeightedQuickUnionUF.java.html
 *
 * @author Mikala Metzger
 *
 * @param parent Array that stores the parents of each node.
 *
 * @param p Desired node to find root of.
 *
 * @return Int representing the root node.
 */
public static int find (int[] parent, int p) {
  while (p != parent[p]) {  // while root hasn't been found yet
    p = parent[p];          // go to the parent of the current node
  }
  return p; // return root node found
}
