/* ***********************************************************************
 *	@author: Algs book problem - Luigi Aleece
 *	Question
 *	Implement BFS for a single source Graph
 *************************************************************************/

public class BreadthFirstPaths {
	private final boolean[] marked;  // Is a shortest path to this vertex known
	private final int[] edgeTo;      // last vertex on known path to this vertex
	private final int s;      // source

	public BreadthFirstPaths(Graph G, int s) {
		marked = new boolean[G.V()];
		edgeTo = new int[G.V()];
		bfs(G, s);
	}

	private void bfs(Graph G, int s) {
		Queue<Integer> q = new Queue<>();
		marked[s] = true; // Mark the source
		q.enqueue(s);	// put it on the queue
		while (!q.isEmpty()) {
			int v = q.dequeue();	// Remove next vertex from the queue.
			for (int w : G.adj(v)) {
				if (!marked[w]) {	// For every unmarked adjacent vertex,
					edgeTo[w] = v;	// save last edge on a shortest path
					marked[w] = true;	// mark it because path is known,
					q.enqueue(w);	// and add it to the queue.
				}
			}
		}
	}

	public boolean hasPathTo(int v) {
		return marked[v];
	}

	public Iterable<Integer> pathTo(int v) {
		if (!hasPathTo(v)) return null;
		Stack<Integer> path = new Stack<>();
		int x;
		for (x = v; distTo[x] != 0; x = edgeTo[x])
			path.push(x);
		path.push(x);
		return path;
	}
}
