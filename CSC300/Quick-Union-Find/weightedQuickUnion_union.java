// Question
/*
Complete the union() function below using the WeightedQuickUnion implementation,
which connects two connected components.
*/
/**
 * Join two trees.
 *
 * @author Luis
 *
 * @param parent Array that stores the parents of each node.
 *
 * @param size Array that stores the size of subtrees using index as root.
 *
 * @param p Node to join with q.
 *
 * @param q Node to join with p.
 *
 * @return Int representing the root node.
 */
public void union (int[] parent, int[] size, int p, int q) {
  int rootP = ____;
  int rootQ = ____;
  if (____) return;
  if (____) {
    parent[____] = ____;
    size[____] += size[rootP];
  }
  else {
    parent[____] = ____;
    size[rootP] += size[rootQ];
  }
  count--;
}

// Answer
/**
 * Join two trees.
 * Full class: https://algs4.cs.princeton.edu/15uf/WeightedQuickUnionUF.java.html
 *
 * @author Luis
 *
 * @param parent Array that stores the parents of each node.
 *
 * @param size Array that stores the size of subtrees using index as root.
 *
 * @param p Node to join with q.
 *
 * @param q Node to join with p.
 *
 * @return Int representing the root node.
 */
public void union(int[] parent, int[] size, int p, int q) {
  int rootP = find(p);  // Get the root of tree with node p
  int rootQ = find(q);  // Get the root of tree with node q
  if (rootP == rootQ) return; // Return if p and q in same tree

  // make smaller root point to larger one
  if (size[rootP] < size[rootQ]) {  // If q tree bigger
    parent[rootP] = rootQ;          // make tree p a subtree of q tree
    size[rootQ] += size[rootP];     // increase size of q tree
  }
  else {                        // If p tree bigger
    parent[rootQ] = rootP;      // make tree q a subtree of p tree
    size[rootP] += size[rootQ]; // increase size of p tree
  }
  count--;  // decrement count of trees
}
