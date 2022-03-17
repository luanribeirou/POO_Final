import POO_Final.Graph;
import java.util.Enumeration;
import java.util.LinkedList;
import java.util.NoSuchElementException;

public class Grapho implements Graph<Object, Object>{
    
    protected Integer numVert;
    protected Integer numEdge;
    protected Vertex[] vertex;
    protected Edge[][] matriz;
    int cont;
    public Grapho(int size){
        vertex = new VertexO[size];
        matriz = new EdgeO[size][size];
    }

    @Override
    public int getNumberOfEdges() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isCyclic() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void topologicalOrderTraversal(Visitor visitor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getNumberOfEdges(Edge edge[][]) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if(matriz[i][j].getV0().getNumber() == 1 && matriz[i][j].getV1().getNumber() == 1){
                    cont++;
                }
            }
        }
        return cont;
    }

    @Override
    public int getNumberOfVertices() {
        for (int i = 0; i < vertex.length; i++) {
            if(vertex[i].getNumber() == 1){
                cont++;
            }
        }
        return cont;
    }

    @Override
    public boolean isDirected() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void addVertex(int v) {
        vertex[v] = new VertexO(v,0);
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void addVertex(int v, Weight w) {
        vertex[v] = new VertexO(v,Integer.parseInt(w.getWeight()));
    }

    @Override
    public void addVertex(int v, Weight weight, Object data) {
        vertex[v] = new VertexO(v,Integer.parseInt(weight.getWeight()),String.valueOf(data));
    }

    @Override
    public Object getVertex(int v) throws NoSuchElementException {
        return vertex[v];
    }

    @Override
    public void addEdge(int v, int w) throws IllegalArgumentException {
        Vertex vertex0 = (Vertex) getVertex(v);
        Vertex vertex1 = (Vertex) getVertex(w);
        matriz[v][w] = new EdgeO(vertex0, vertex1);
    }

    public void addEdge(int v, int w, Weight weight) throws IllegalArgumentException {
       Vertex vertex0 = (Vertex) getVertex(v);
        Vertex vertex1 = (Vertex) getVertex(w);
        matriz[v][w] = new EdgeO(vertex0,vertex1,Integer.parseInt(weight.getWeight()));
    }

    public void addEdge(int v, int w, Weight weight, Object data) throws IllegalArgumentException {
        Vertex vertex0 = (Vertex) getVertex(v);
        Vertex vertex1 = (Vertex) getVertex(w);
        matriz[v][w] = new EdgeO(vertex0,vertex1,Integer.parseInt(weight.getWeight()),data.toString());
    }

    @Override
    public Object getEdge(int v, int w) throws NoSuchElementException {
        return matriz[v][w];
    }

    public boolean isEdge(int v, int w) {
        if (matriz[v][w].getV0() != null) {
            return true;
        }
        else{
            return false;
        }
    }

    public boolean isConnected() {
        PrePostVisitor visitor = new PrePostVisitor(){
            public void Visit(Object object){
                cont++;
            }

            @Override
            public void preVisit(Object obj) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void inVisit(Object obj) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void postVisit(Object obj) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public boolean isDone() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };
        depthFirstTraversal(visitor, 0);
        return cont == numVert;
    }
    
    

    public Enumeration getVertices() {
        return null;
        
    }

    public Enumeration getEdges() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

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

    public void breadthFirstTraversal(Visitor visitor, int start) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void breadthFirstTraversal(Visitor visitor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Graph PrimsAlgorithm(Graph g, int s) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Graph KruskalAlgorithm(Graph g) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
