/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Operaciones;

import java.util.ArrayList;

/**
 *
 * @author Jhonatan
 */
public class Vertice {
    private Object dato;
    private ArrayList<Vertice> verticesAdyacentes;
    private boolean visitado;
    int peso;
    public Vertice(Object dato){
    this.dato=dato;
    this.verticesAdyacentes =new ArrayList<>();
    this.visitado=false;
    this.peso=0;
    }
    
    public void agregarVerticeHijo(Vertice nuevoVertice){
       verticesAdyacentes.add(nuevoVertice);
        }

    public Object getDato() {
        return dato;
    }

    public ArrayList<Vertice> getVerticesAdyacentes() {
        return verticesAdyacentes;
    }
    public boolean esVisitado(){
    return visitado;
    }

    public void setVisitado(boolean visitado) {
        this.visitado = visitado;
    }
    
}
