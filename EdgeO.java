import java.util.ArrayList;
import java.util.List;

public class EdgeO<String> implements Edge<String>{
    private Vertex V0;
    private Vertex V1;
    private double Valor;
    private String Data;
    
    EdgeO(Vertex V0 , Vertex V1){
        this.V0 = V0;
        this.V1 = V1;
    }
    
    EdgeO(Vertex V0 , Vertex V1,double Valor){
        this.V0 = V0;
        this.V1 = V1;
        this.Valor = Valor;
    }
    EdgeO(Vertex V0 , Vertex V1,double Valor,String Data){
        this.V0 = V0;
        this.V1 = V1;
        this.Valor = Valor;
    }
    public double getValor(){
        return this.Valor;
    }
    @Override
    public Vertex getV0() {
        return this.V0;
    }
    @Override
    public Vertex getV1() {
        return this.V1;
    }

    @Override
    public boolean isDirected() {
        return false;
    }
    @Override
    public Vertex getMate(Vertex vertex) {
        if (vertex == this.V0){
            return V1;
        }
        if (vertex == this.V1){
            return V0;
        }
        return null;
    }
    @Override
    public int compareTo(Edge<String> o) {
        EdgeO a = (EdgeO) o;
        return (int) (this.Valor - a.getValor());
    }
    @Override
    public double getWeight() {
        return this.Valor;
    }
    @Override
    public String getData() {
        return this.Data;
    }   
}
