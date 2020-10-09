// Title: Weighted Quick Union: Union()
// Original author: Luis

// Question
/*
Complete the union() function below using the WeightedQuickUnion implementation,
which connects two connected components.
*/
public void union (int p, int q) {
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
