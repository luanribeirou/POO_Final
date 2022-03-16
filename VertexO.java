import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

public class VertexO implements Vertex{
    List edgs;
    int Number;
    int Valor;
    String Data;
    VertexO(int Number,int Valor){
        this.Valor = Valor;
        this.Number = Number;
        edgs = new ArrayList<Edge>();
    }
    VertexO(int Number,int Valor,String Data){
        this.Valor = Valor;
        this.Number = Number;
        edgs = new ArrayList<Edge>();
    }
    VertexO(Edge edge,int Numbe,int Valor,String Data){
        this.Valor = Valor;
        this.Number = Number;
        edgs = new ArrayList<Edge>();
        edgs.add(edge);
    }
    public void Add(Edge V){
        edgs.add(V);
    }
    @Override
    public int compareTo(Object o) {
        int a = (int) o;
        return this.Valor - a;
    }
    @Override
    public int getNumber() {
        return this.Number;
    }
    @Override
    public double getWeight() {
        return this.Valor;
    }
    @Override
    public Object getData() {
        return this.Data;
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
}
