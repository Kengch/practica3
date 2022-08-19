/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica3;

/**
 *
 * @author Keng
 */
public class nodoArbol {
    private int valor;
    private nodoArbol hijoIzq;
    private nodoArbol hijoDer;
    private nodoArbol hijoCen;

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public nodoArbol getHijoIzq() {
        return hijoIzq;
    }

    public void setHijoIzq(nodoArbol hijoIzq) {
        this.hijoIzq = hijoIzq;
    }

    public nodoArbol getHijoDer() {
        return hijoDer;
    }

    public void setHijoDer(nodoArbol hijoDer) {
        this.hijoDer = hijoDer;
    }

    public nodoArbol getHijoCen() {
        return hijoCen;
    }

    public void setHijoCen(nodoArbol hijoCen) {
        this.hijoCen = hijoCen;
    }


    
    public nodoArbol(int valor){
        this.valor = valor;
    }

   
}
