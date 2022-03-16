/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.grafo;

import java.util.Enumeration;
import java.util.LinkedList;
import java.util.NoSuchElementException;

public abstract class GraphoAbstract implements Graph<Object, Object>{
    
    protected Integer numVert;
    protected Integer numEdge;
    protected Vertex[] vertex;
    
    public GraphoAbstract(int size){
        vertex = new Vertex[size];
        for (int i = 0; i < size; i++) {
            vertex[i] = 0;
        }
    }
    
    protected final static class Counter{
        int cont = 0;
    }

    @Override
    public int getNumberOfEdges(Edge edge[][]) {
        final Counter cont = new Counter();
        for (int i = 0; i < edge.length; i++) {
            for (int j = 0; j < edge.length; j++) {
                if(edge[i][j] == 1){
                    cont.cont++;
                }
            }
        }
        return cont.cont;
    }

    @Override
    public int getNumberOfVertices() {
        final Counter cont = new Counter();
        for (int i = 0; i < vertex.length; i++) {
            if(vertex[i] == 1){
                cont.cont++;
            }
        }
        return cont.cont;
    }

    @Override
    public boolean isDirected() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void addVertex(int v) {
        vertex = vertex[v];
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void addVertex(int v, Weight w) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void addVertex(int v, Weight weight, Object data) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object getVertex(int v) throws NoSuchElementException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void addEdge(int v, int w) throws IllegalArgumentException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void addEdge(int v, int w, Weight weight) throws IllegalArgumentException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void addEdge(int v, int w, Weight weight, Object data) throws IllegalArgumentException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object getEdge(int v, int w) throws NoSuchElementException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isEdge(int v, int w) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isConnected() {
        final Counter cont = new Counter();
        PrePostVisitor visitor = new AbstractPrePostVisitor(){
            public void Visit(Object object){
                cont.cont++;
            }
        };
        depthFirstTraversal(visitor, 0);
        return cont.cont == numVert;
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Enumeration getVertices() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Enumeration getEdges() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
        visitor.preVisit(v);
        visitado[vert.getNumber] = true;
        Enumeration proxe = v.getSucessors();
        while(prox.hasMoreElements()){
            Vertex prox = (Vertex) p.nextElement();
            if(!visitado[prox.getNumber()]){
                depthFirstTraversal(visitor,prox,visitado);
            }
        }
        visitor.postVisit(vert);
    }

    @Override
    public void breadthFirstTraversal(Visitor visitor, int start) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void breadthFirstTraversal(Visitor visitor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Graph PrimsAlgorithm(Graph g, int s) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Graph KruskalAlgorithm(Graph g) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
