/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.grapho;

import java.util.Enumeration;
import java.util.NoSuchElementException;

/**
 *
 * @author Luan
 */
public abstract class GraphAb implements Graph<Object, Object> {

    private ArrayList<Vertex<T>> vertices;
    private ArrayList<Edge<T>> arestas;

    @Override
    public int getNumberOfEdges() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getNumberOfVertices() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isDirected() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void addVertex(int v) {
        try {
            Vertex<T> newVertex = new Vertex<T>(v);
            this.vertices.add(newVertex);
        } catch (UnsupportedOperationException uoe) {
            System.err.println(uoe);
            System.out.println("Conta Inexistente.");
        }
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
    public <any> getVertex(int v) throws NoSuchElementException {
        Vertex<T> vertice = null;
        try {
            for (int i = 0; i < this.vertices.size(); i++) {
                if (this.vertices.get(i).getDado().equals(v)) {
                    vertice = this.vertices.get(i);
                    break;
                }
            }
            return vertice;
        } catch (NoSuchElementException nse) {
            System.err.println(nse);
            System.out.println("Conta Inexistente.");
        }
        return vertice
    }

    @Override
    public void addEdge(int v, int w) throws IllegalArgumentException {
        try {
            Vertex<T> v = this.getVertice(v);
            Vertex<T> w = this.getVertice(w);
            Edge<T> aresta = new Edge<T>(v, w);
            v.adicionarArestaSaida(aresta);
            w.adicionarArestaEntrada(aresta);
            this.arestas.add(aresta);
        } catch (IllegalArgumentException iae) {
            System.err.println(iae);
            System.out.println("Conta Inexistente.");
        }

    }

    @Override
    public void addEdge(int v, int w, Weight weight) throws IllegalArgumentException {
        try {
            Vertex<T> v = this.getVertice(v);
            Vertex<T> w = this.getVertice(w);
            Edge<T> aresta = new Edge<T>(v, w, weight);
            v.adicionarArestaSaida(aresta);
            w.adicionarArestaEntrada(aresta);
            this.arestas.add(aresta);
        } catch (IllegalArgumentException iae) {
            System.err.println(iae);
            System.out.println("Conta Inexistente.");
        }
    }

    @Override
    public void addEdge(int v, int w, Weight weight, Object data) throws IllegalArgumentException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public <any> getEdge(int v, int w) throws NoSuchElementException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isEdge(int v, int w) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isConnected() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isCyclic() {
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void breadthFirstTraversal(Visitor visitor, int start) {

    }

    @Override
    public void breadthFirstTraversal(Visitor visitor) {
        ArrayList<Vertex<T>> marcados = new ArrayList<Vertex<T>>();
        ArrayList<Vertex<T>> fila = new ArrayList<Vertex<T>>();
        Vertex<T> atual = this.vertices.get(0);
        marcados.add(atual);
        System.out.println(atual.getDado());
        fila.add(atual);
        while (fila.size() > 0) {
            Vertex<T> visitado = fila.get(0);
            for (int i = 0; i < visitado.getArestasSaida().size(); i++) {
                Vertex<TIPO> proximo = visitado.getArestasSaida().get(i).getFim();
                if (!marcados.contains(proximo)) { //se o vértice ainda não foi marcado
                    marcados.add(proximo);
                    System.out.println(proximo.getDado());
                    fila.add(proximo);
                }
            }
            fila.remove(0);
        }

        @Override
        public Graph PrimsAlgorithm
        (Graph g, int s
        
            ) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public Graph KruskalAlgorithm
        (Graph g
        
            ) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

    }
