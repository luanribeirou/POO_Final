package POO_Final;

import POO_Final.Digraph;
import com.sun.nio.sctp.Association;
import java.util.Enumeration;
import org.w3c.dom.css.Counter;

public abstract class Digrapho extends Grapho implements Digraph<E, T> {

  
  
    final class Entry {

        boolean known = false;
        int distancia = Integer.MAX_VALUE;
        int predecessor = Integer.MAX_VALUE;
    }
    protected int numerodeVertices;
    protected int numerodeEdges;
    protected Vertex[] vertex;
    protected int value;
    public void topologicalOrderTraversal(Visitor visitor) {
        int[] inDegree = new int[numerodeVertices];
        int v;
        for (v = 0; v < numerodeVertices; v++) {
            inDegree[v] = 0;
        }
        Enumeration p = getEdges();
        while (p.hasMoreElements()) {
            Edge edge = (Edge) p.nextElement();
            Vertex to = edge.getV1();
            inDegree[to.getNumber]++;
        }
        Queue queue = new QueueAsLinkedList();
        for (v = 0; v < numerodeVertices; v++) {
            if (inDegree[v] == 0) {
                queue.enqueue(vertex[v]);
            }
        }
        while (!queue.isEmpty && !visitor.isDone()) {
            Vertex to = (Vertex) q.nextElement();
            if (inDegree[to.getNumero()]-- == 0) {
                queue.enqueue(to);
            }
        }
    }

    public boolean isStronglyConnected() {
        int numerodeVertices;
        int numerodeEdges;
        Vertex vertex;
        final Counter counte = new Counter();
        for (int v = 0; v < this.numerodeVertices; v++) {
            counter.value = 0;
            PrePostVisitor visitor = new AbstractPrePostVisitor() {
                public void visit(Object object) {
                    counter.value++;
                }
            };
            depthFirstTraversal(visitor, v);
            if (counter.value != this.numerodeVertices) {
                return false;
            }
        }
        return true;
    }
/*
    public static Digraph DijkstaAlgorithm(Graph g, int s) {
        int n = g.getNumberOfVertices();
        Entry[] table = new Entry[n];
        for (int v = 0; v < n; v++) {
            table[v] = new Entry();
        }
        table[g].distancia = 0;
        QueueAsArray = new BinaryHeap(new Int(0), g.getVertex(s));
        while (!queue.isEmpty()) {
            Association assoc = (Association) queue.dequeueMin();
            Vertex v0 = (Vertex) assoc.getValor();
            int n0 = v0.getnumero();
            if (!table[n0].knowm) {
                table[n0].knwom = true;
                Enumeration p = v0.getEmanatingEdges();
                while (p.hasMoreElements()) {
                    Edge edge = (Edge) p.nextElement();
                    Vertex v1 = edge.getMate(v0);
                    int n1 = v1.getnumero();
                    int wt = (int) edge.getWeight();
                    int d = table[n0].distancia + wt;
                    if (table[n1].distancia > d) {
                        table[n1].distancia = d;
                        table[n1].predecessor = n0;
                        queue.enqueue(new Association(new Int(d), v1));
                    }
                }
            }
        }
        Graph result = new GraphAsLists(n);
        for (int v = 0; v < n; v++) {
            result.addVertex(v, new int(table[v].distancia));
        }
        int v;
        for (v = 0; v < n; v++) {
            if (v != s) {
                result.addEdge(v, table[v].predecessor);
            }
        }
        return result;
    }

    public static Digraph FloydsAlgorith(Graph g) {
        int n = g.getNumberdeVertices();
        int[][] distancia = new int[n][n];
        int v;
        for (v = 0; v < n; v++) {
            for (int w = 0; w < n; w++) {
                distance[v][w] = Integer.MAX_VALUE;
            }
        }
        Enumeration p = g.getEdges();
        while (p.hasMoreElements()) {
            Edge edge = (Edge) p.nextElement();
            Int wt = (int) edge.getWeight();
            distancia[edge.getV0().getnumero][edge.getV1().getnumero] = wt.intValor();
        }
        for (int i = 0; i < n; i++) {
            for (v = 0; v < n; v++) {
                for (int w = 0; w < n; w++) {
                    if (distancia[v][i] != Integer.MAX_VALUE && distancia[i][w] != Integer.MAX_VALUE) {
                        int d = distancia[v][i] + distancia[i][w];
                        if (distancia[v][w] > d) {
                            distancia[v][w] = d;
                        }
                    }
                }
            }
        }
        Graph result = new GraphAsMatrix(n);
        for (v = 0; v < n; v++) {
            result.addVertex(v);
        }
        for (v = 0; v < n; v++) {
            for (int w = 0; w < n; w++) {
                if (distancia[v][w] != Integer.MAX_VALUE) {
                    result.addEdge(v, w, new distancia[v][w]);
                }
            }
        }
        return result;
    }
} */
