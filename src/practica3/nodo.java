/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica3;

/**
 *
 * @author Keng
 */
public class nodo {
    private int valor;
    private nodo hijoIzq;
    private nodo hijoDer;


    
    public nodo(int valor){
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public nodo getHijoIzq() {
        return hijoIzq;
    }

    public void setHijoIzq(nodo hijoIzq) {
        this.hijoIzq = hijoIzq;
    }

    public nodo getHijoDer() {
        return hijoDer;
    }

    public void setHijoDer(nodo hijoDer) {
        this.hijoDer = hijoDer;
    }
}
