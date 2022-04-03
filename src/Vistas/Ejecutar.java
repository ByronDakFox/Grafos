/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import Operaciones.Grafo;

/**
 *
 * @author Jhonatan
 */
public class Ejecutar {

    public static void main(String[] args) {
        Grafo nuevoGrafo = new Grafo();
        nuevoGrafo.agregarVertices(1);
        nuevoGrafo.agregarVertices(2);
        nuevoGrafo.agregarVertices(3);
        nuevoGrafo.agregarVertices(4);
        nuevoGrafo.agregarVertices(5);
        nuevoGrafo.agregarVertices(6);

        nuevoGrafo.crearEnlances(1, 2);
        nuevoGrafo.crearEnlances(2, 2);
        nuevoGrafo.crearEnlances(2, 3);
        nuevoGrafo.crearEnlances(3, 6);
        nuevoGrafo.crearEnlances(3, 5);
        nuevoGrafo.crearEnlances(4, 3);
       
    }
}
