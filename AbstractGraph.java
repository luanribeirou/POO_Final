import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.NoSuchElementException;

public abstract class AbstractGraph implements Graph<Object, Object>{
    
    protected Integer numVert;
    protected Integer numEdge;
    protected Vertex[] vertex;
    protected Edge[][] Matrix;
    //int cont;

    public AbstractGraph(int size){
        vertex = new Vertex[size];
        Matrix = new Edge[size][size];
    }

    protected final class GraphVertex extends AbstractObject implements Vertex{
        protected int num;
        protected double weight;
        List edges;

        GraphVertex(int Number, double Valor) {
            this.weight = Valor;
            this.num = Number;
            edges = new ArrayList<Edge>();
        }

        GraphVertex(int Number, double Valor, String Data) {
            this.weight = Valor;
            this.num = Number;
            edges = new ArrayList<Edge>();
        }

        GraphVertex(Edge edge, int Number, double Valor, String Data) {
            this.weight = Valor;
            this.num = Number;
            edges = new ArrayList<Edge>();
            edges.add(edge);
        }
        @Override
        public int getNumber() {
            return this.num;
        }
        @Override
        public double getWeight() {
            return (double) this.weight;
        }
        @Override
        public Object getData() {
            // TODO Auto-generated method stub
            return null;
        }
        @Override
        public Enumeration getIncidentEdges() {
            // TODO Auto-generated method stub
            return null;
        }
        @Override
        public Enumeration getEmanatingEdges() {
            // TODO Auto-generated method stub
            return null;
        }
        @Override
        public Enumeration getPredecessors() {
            // TODO Auto-generated method stub
            return null;
        }
        @Override
        public Enumeration getSuccessors() {
            // TODO Auto-generated method stub
            return null;
        }
        @Override
        protected int compareTo(Comparable arg) {
            // TODO Auto-generated method stub
            return 0;
        }
    }

    protected final class GraphEdge extends AbstractObject implements Edge{
        protected Vertex v1;
        protected Vertex v2;
        protected Object weight;

        GraphEdge(Vertex V0, Vertex V1) {
            this.v1 = V0;
            this.v2 = V1;
        }

        GraphEdge(Vertex V0, Vertex V1, Object Valor) {
            this.v1 = V0;
            this.v2 = V1;
            this.weight = Valor;
        }

        GraphEdge(Vertex V0, Vertex V1, Object Valor, String Data) {
            this.v1 = V0;
            this.v2 = V1;
            this.weight = Valor;
        }
        @Override
        public double getWeight() {
            return (double) this.weight;
        }
        @Override
        public GraphVertex getV0() {
            return (AbstractGraph.GraphVertex) this.v1;
        }

        @Override
        public GraphVertex getV1() {
            return (AbstractGraph.GraphVertex) this.v2;
        }
        @Override
        public Object getData() {
            // TODO Auto-generated method stub
            return null;
        }
        @Override
        public boolean isDirected() {
            // TODO Auto-generated method stub
            return false;
        }
        @Override
        public Vertex getMate(Vertex vertex) {
            if (vertex == this.v1) {
                return v2;
            }
            if (vertex == this.v2) {
                return v1;
            }
            return null;
        }
        @Override
        protected int compareTo(Comparable arg) {
            GraphEdge a = (GraphEdge) arg;
            return (int) (v1.getNumber() - (int) a.getWeight());
        }
    }

    protected abstract Enumeration getIncidentEdges(Int v);

    protected abstract Enumeration getEmanatingEdges(Int v);

    @Override
    public int getNumberOfEdges() {
        int cont = 0;
        for (int i = 0; i < Matrix.length; i++) {
            for (int j = 0; j < Matrix.length; j++) {
                if (Matrix[i][j].getV0().getNumber() == 1 && Matrix[i][j].getV1().getNumber() == 1) {
                    cont++;
                }
            }
        }
        return cont;
    }
    @Override
    public int getNumberOfVertices() {
        int cont = 0;
        for (int i = 0; i < vertex.length; i++) {
            if (vertex[i].getNumber() == 1) {
                cont++;
            }
        }
        return cont;
    }
    @Override
    public boolean isDirected() {
        // TODO Auto-generated method stub
        return false;
    }
    @Override
    public void addVertex(int v) {
        vertex[v] = new GraphVertex(v, 0);
        throw new UnsupportedOperationException("Not supported yet.");
    }
    @Override
    public void addVertex(int v, double w) {
        vertex[v] = new GraphVertex(v, w);
        //throw new UnsupportedOperationException("Not supported yet.");
        
    }
    @Override
    public void addVertex(int v, double weight, Object data) {
        vertex[v] = new GraphVertex(v, weight, String.valueOf(data));

    }
    @Override
    public Vertex<Object> getVertex(int v) throws NoSuchElementException {
        return vertex[v];
    }
    @Override
    public void addEdge(int v, int w) throws IllegalArgumentException {
        GraphVertex vertex0 = (GraphVertex) getVertex(v);
        GraphVertex vertex1 = (GraphVertex) getVertex(w);
        Matrix[v][w] = new GraphEdge(vertex0, vertex1);
        
    }
    @Override
    public void addEdge(int v, int w, double weight) throws IllegalArgumentException {
        GraphVertex vertex0 = (GraphVertex) getVertex(v);
        GraphVertex vertex1 = (GraphVertex) getVertex(w);
        Matrix[v][w] = new GraphEdge(vertex0, vertex1, weight);

    }

    @Override
    public void addEdge(int v, int w, double weight, Object data) throws IllegalArgumentException {
        GraphVertex vertex0 = (GraphVertex) getVertex(v);
        GraphVertex vertex1 = (GraphVertex) getVertex(w);
        Matrix[v][w] = new GraphEdge(vertex0, vertex1, weight, data.toString());
    }

    @Override
    public Edge<Object> getEdge(int v, int w) throws NoSuchElementException {
        return Matrix[v][w];
    }

    @Override
    public boolean isEdge(int v, int w) {
        if (Matrix[v][w].getV0() != null) {
            return true;
        } else {
            return false;
        }
    }

  //  @Override
  //  public boolean isConnected() {
  //      int cont = 0;
  //      PrePostVisitor visitor = new PrePostVisitor() {
  //          public void Visit(Object object) {
  //              cont++;
  //          }
  //      };
  //      depthFirstTraversal(visitor, 0);
  //      return cont == numVert;
  // }

    @Override
    public boolean isCyclic() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public void topologicalOrderTraversal(Visitor visitor) {
        // TODO Auto-generated method stub

    }

    @Override
    public Enumeration getVertices() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Enumeration getEdges() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void depthFirstTraversal(PrePostVisitor visitor, int start) {
        Boolean[] visitado = new Boolean[numVert];
        for (int i = 0; i < numVert; i++) {
            visitado[i] = false;
        }
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

    }
    
     private void depthFirstTraversal(PrePostVisitor visitor, Vertex vert, Boolean[] visitado) {
        if(visitor.isDone()){
            return;
        }
        visitor.preVisit(vert);
        visitado[vert.getNumber()] = true;
        Enumeration proxe = vert.getSuccessors();
        while(proxe.hasMoreElements()){
            Vertex prox = (Vertex) proxe.nextElement();
            if(!visitado[prox.getNumber()]){
                depthFirstTraversal(visitor,prox,visitado);
            }
        }
        visitor.postVisit(vert);
    }

    @Override
    public void breadthFirstTraversal(Visitor visitor, int start) {
        // TODO Auto-generated method stub

    }

    @Override
    public void breadthFirstTraversal(Visitor visitor) {
        // TODO Auto-generated method stub

    }

    @Override
    public Graph PrimsAlgorithm(Graph g, int s) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Graph KruskalAlgorithm(Graph g) {
        // TODO Auto-generated method stub
        return null;
    }

}