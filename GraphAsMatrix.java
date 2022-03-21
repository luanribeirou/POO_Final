import java.util.Enumeration;

public class GraphAsMatrix extends AbstractGraph {
    protected Edge[][] Matrix;
    public GraphAsMatrix(int size){
        super(size);
        Matrix = new Edge[size][size];
    }
    @Override
    protected Enumeration getIncidentEdges(Int v) {
        // TODO Auto-generated method stub
        return null;
    }
    @Override
    protected Enumeration getEmanatingEdges(Int v) {
        // TODO Auto-generated method stub
        return null;
    }

}
