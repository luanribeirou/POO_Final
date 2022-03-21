import java.util.Enumeration;
import java.util.LinkedList;
import java.util.NoSuchElementException;

public abstract class AbstractGraph implements Graph<Object, Object>{
    
    protected Integer numVert;
    protected Integer numEdge;
    protected Vertex[] vertex;
  //  protected Edge[][] matriz;
    //int cont;

    public AbstractGraph(int size){
        vertex = new Vertex[size];
       // matriz = new EdgeO[size][size];
    }

    protected final class GraphVertex extends AbstractObject implements Vertex{
        protected int num;
        protected Object wight;
        @Override
        public int getNumber() {
            // TODO Auto-generated method stub
            return 0;
        }
        @Override
        public double getWeight() {
            // TODO Auto-generated method stub
            return 0;
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

    protected final class GraphEdge extends  AbstractObject implements Edge{
        protected int v1;
        protected int v2;
        protected Object wight;
        @Override
        public double getWeight() {
            // TODO Auto-generated method stub
            return 0;
        }
        @Override
        public Vertex getV0() {
            // TODO Auto-generated method stub
            return null;
        }
        @Override
        public Vertex getV1() {
            // TODO Auto-generated method stub
            return null;
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
            // TODO Auto-generated method stub
            return null;
        }
        @Override
        protected int compareTo(Comparable arg) {
            // TODO Auto-generated method stub
            return 0;
        }
    }

    protected abstract Enumeration getIncidentEdges(Int v);

    protected abstract Enumeration getEmanatingEdges(Int v);

    @Override
    public int getNumberOfEdges() {
        // TODO Auto-generated method stub
        return 0;
    }
    @Override
    public int getNumberOfVertices() {
        // TODO Auto-generated method stub
        return 0;
    }
    @Override
    public boolean isDirected() {
        // TODO Auto-generated method stub
        return false;
    }
    @Override
    public void addVertex(int v) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void addVertex(int v, Weight w) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void addVertex(int v, Weight weight, Object data) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public Vertex<Object> getVertex(int v) throws NoSuchElementException {
        // TODO Auto-generated method stub
        return null;
    }
    @Override
    public void addEdge(int v, int w) throws IllegalArgumentException {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void addEdge(int v, int w, Weight weight) throws IllegalArgumentException {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void addEdge(int v, int w, Weight weight, Object data) throws IllegalArgumentException {
        // TODO Auto-generated method stub
        
    }
    @Override
    public Edge<Object> getEdge(int v, int w) throws NoSuchElementException {
        // TODO Auto-generated method stub
        return null;
    }
    @Override
    public boolean isEdge(int v, int w) {
        // TODO Auto-generated method stub
        return false;
    }
    @Override
    public boolean isConnected() {
        // TODO Auto-generated method stub
        return false;
    }
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
        // TODO Auto-generated method stub
        
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
