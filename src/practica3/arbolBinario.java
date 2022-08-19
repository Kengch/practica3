/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica3;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Keng
 */
public class arbolBinario {
    private nodo raiz;
    
    public arbolBinario(){
        this.raiz = null;
    }
    
    public void insertar(int valor){
        if (esVacio() == true) {
            raiz = new nodo(valor);
        }
        else{
            agregar(raiz, valor);
        }
    }
    
    private void agregar(nodo raiz, int valor){
        
        if (valor == raiz.getValor() - 3) {
            //inserta en el centro
            if (raiz.getHijoIzq() == null) {
                raiz.setHijoIzq(new nodo(valor));
            }
            else{
                agregar(raiz.getHijoIzq(), valor);
            }
        }else{
            //inserta a la derecha
            if (raiz.getHijoDer() == null) {
                raiz.setHijoDer(new nodo(valor));
            }
            else{
                agregar(raiz.getHijoDer(), valor);
            }
        }
    }
    
    public boolean esVacio(){
        if (raiz == null) {
            return true;
        }
        return false;
    }
    
    public void inOrden(){
        if (esVacio() == false) {
            preorden(raiz);
        }
        else{
            System.out.println("El arbol esta vacio");
        }
    }
    
    private void inOrdenR(nodo raiz){
        if (raiz != null) {
            inOrdenR(raiz.getHijoIzq());
            System.out.println(raiz.getValor() + ", ");
            inOrdenR(raiz.getHijoDer());
        }
    }
    
    private void preorden(nodo raiz) {
    if (raiz != null) {
        System.out.println(raiz.getValor() + ", ");
        preorden(raiz.getHijoIzq());
        preorden(raiz.getHijoDer());
    }
}
}
