/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Operaciones;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import javax.swing.JOptionPane;

/**
 *
 * @author Jhonatan
 */
public class Grafo {

    private ArrayList<Vertice> listaVertice;
    ArrayList<Vertice> auxVertices;

    Stack pila;
    LinkedList cola;
    Vertice actual;

    public Grafo() {
        this.listaVertice = new ArrayList<>();
        this.auxVertices = new ArrayList<>();
        this.pila = new Stack();
        this.cola = new LinkedList();
    }

    public void agregarVertices(Object datoNueva) {
        Vertice nuevo = new Vertice(datoNueva);
        listaVertice.add(nuevo);

    }

    public void crearEnlances(Object verticePadre, Object verticeHijo) {
        Vertice padre = BuscarVertice(verticePadre);
        Vertice hijo = BuscarVertice(verticeHijo);
        if (padre != null && hijo != null) {
            padre.agregarVerticeHijo(hijo);
        }

    }

    public Vertice BuscarVertice(Object datoBuscar) {
        Vertice aux;
        for (int i = 0; i < listaVertice.size(); i++) {
            aux = listaVertice.get(i);
            if (datoBuscar.equals(aux.getDato())) {
                return listaVertice.get(i);
            }
        }
        return null;
    }

    int i = 0;

    public String recorridoProfundidad(String origen) {
        String recorrido = "";
        Vertice partida = this.BuscarVertice(origen);
        auxVertices = partida.getVerticesAdyacentes();
        recorrido += partida.getDato().toString() + " , ";
        if (!partida.esVisitado()) {
            for (Vertice v : auxVertices) {
                partida.setVisitado(true);
                if (!v.esVisitado()) {
                    pila.push(v);
                    v.setVisitado(true);
                }
            }
        }

        while (!pila.isEmpty()) {
            partida = (Vertice) pila.pop();
            recorrido += partida.getDato().toString() + " , ";
            auxVertices = partida.getVerticesAdyacentes();
            partida.setVisitado(true);

            for (Vertice v : auxVertices) {
                if (!v.esVisitado()) {
                    pila.push(v);
                    v.setVisitado(true);
                }
            }
        }
        if (!estadoDeRecorrido() == true) {// si aun no han sido visitados todos los vertices 
            JOptionPane.showMessageDialog(null, "NO se ha recorrido todos los nodos en Profundidad");
        } else {
            JOptionPane.showMessageDialog(null, "Todos los nodos han sido recorridos o visitados en Profundidad");
            reestablecerEstados();
            return recorrido;
        }
        reestablecerEstados();
        return recorrido;

    }

    public String recorridoAmplitud(String origen) {
        String recorrido = "";
        Vertice partida = this.BuscarVertice(origen);
        auxVertices = partida.getVerticesAdyacentes();
        recorrido += partida.getDato().toString() + " , ";
        if (!partida.esVisitado()) {
            for (Vertice v : auxVertices) {
                partida.setVisitado(true);
                if (!v.esVisitado()) {
                    cola.add(v);
                    v.setVisitado(true);
                }
            }
        }

        while (!cola.isEmpty()) {
            partida = (Vertice) cola.remove();
            recorrido += partida.getDato().toString() + " , ";
            auxVertices = partida.getVerticesAdyacentes();
            partida.setVisitado(true);

            for (Vertice v : auxVertices) {
                if (!v.esVisitado()) {
                    cola.add(v);
                    v.setVisitado(true);
                }
            }
        }
        if (!estadoDeRecorrido() == true) {// si aun no han sido visitados todos los vertices 
            JOptionPane.showMessageDialog(null, "NO se ha visitado todos los nodos en Anchura");
        } else {
            JOptionPane.showMessageDialog(null, "Todos los nodos han sido recorridos o visitados en Anchura");
            reestablecerEstados();
            return recorrido;
        }
        reestablecerEstados();
        return recorrido;
    }

    public boolean estadoDeRecorrido() {
        Vertice a;
        for (int j = 0; j < listaVertice.size(); j++) {
            a = listaVertice.get(j);
            if (!a.esVisitado() == true) {
                return false;
            }

        }
        return true;
    }

    public void reestablecerEstados() {
        Vertice a;
        for (int j = 0; j < listaVertice.size(); j++) {
            a = listaVertice.get(j);
            a.setVisitado(false);
        }
    }
int nNodos;
    int[][] matrizAdy;

  List conj_S = new ArrayList();
  List conjComp_S = new ArrayList();
  List caminos = new ArrayList();
  String tmp;
    private void resuelve(int origen){
    int nod;
    int minimo;
    int aux;
    int nodCambio=0;
    int intento;
    String tmp2;
    //Inicializando listas
    for(int i=0;i<nNodos;i++){
      if(i!=origen)
        conjComp_S.add(""+i);
      else
        conj_S.add(""+i);
      caminos.add("");
    }
    //Aplicando ciclo i de diksjtra
    for(int i=0;i<nNodos;i++){
      minimo=-1;
      for(int j=0;j<conjComp_S.size();j++){
        nod=Integer.valueOf((String)(conjComp_S.get(j))).intValue();
        aux=min(nod);
        if(minimo==-1 || (aux<minimo && aux!=-1)){
          minimo=aux;
          nodCambio=j;
        }
      }
      if(minimo!=-1){
        conj_S.add(""+(String)(conjComp_S.get(nodCambio)));
        conjComp_S.remove(nodCambio);
      }
    }
    //Imprimiendo resultados
    System.out.print("\n -> Resultados <-");
    for(int k=0;k<caminos.size();k++)
      if(k!=origen){
        tmp=(String)(caminos.get(k))+(char)(k+65);
        caminos.set(k,tmp);
      }
    for(int j=0;j<caminos.size();j++)
      if(j!=origen){
        intento=0;
        tmp=(String)(caminos.get(j));
          while(tmp.charAt(0)!=(char)(origen+65) && intento<10){
            aux=tmp.charAt(0)-65;
            tmp=((String)(caminos.get(aux)))+tmp.substring(1,tmp.length());
            if(++intento==10)
              tmp="*"+tmp;
          };
        imprimeCamino(tmp,j,origen);
      }
    System.out.println("\n <-  Que tenga un buen viaje! ->\n");
  }
      private int min(int dest){
    int min=-1;
    int nod=0;
    int nodOrig=-1;
    int aux;
    for(int i=0;i<conj_S.size();i++){
      nod=Integer.valueOf((String)(conj_S.get(i))).intValue();
      if(matrizAdy[nod][nod]!=-1 && matrizAdy[nod][dest]!=-1)
        aux=matrizAdy[nod][nod]+matrizAdy[nod][dest];
      else
        aux=-1;
      if((aux<min && aux!=-1)||min==-1){
        min=aux;
        nodOrig=nod;
      }
    }
    if(min!=-1){
      matrizAdy[dest][dest]=min;
      caminos.set(dest,""+(char)(nodOrig+65));
    }
    return min;
  }
 private void imprimeCamino(String cam, int nod, int o){
    System.out.print("\nCamino: ");
    if(cam.charAt(0)=='*')
      System.out.print("Te jodes: no hay camino de: "+(char)(o+65)+" a: "+cam.charAt(cam.length()-1)+"!!");
    else{
      for(int i=0;i<cam.length();i++)
        System.out.print(""+cam.charAt(i)+(i==cam.length()-1?"":"->"));
      System.out.print(" costo: "+matrizAdy[nod][nod]);
    }
  }
}
