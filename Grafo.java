/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.grafo;

/**
 *
 * @author Luan
 */
public class Grafo extends GraphoAbstract {

    protected Edge[][] matriz;

    public Grafo(int size) {
        super(size);
        matriz = new Edge[size][size];
    }

    @Override
    public void addEdge(int v, int w) throws IllegalArgumentException {
        if (v < matriz.length && w < matriz.length) {
            matriz[v][w] = 1;
            matriz[w][v] = 1;
            matriz.Add(matriz[v][w]);
        }
    }

}
