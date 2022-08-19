/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica3;

/**
 *
 * @author Keng
 */
public class arbol {
    private nodoArbol raiz;
    
    public arbol(){
        this.raiz = null;
    }
    
    public boolean esVacio(){
        if (raiz == null) {
            return true;
        }
        return false;
    }
    
    public void insertar(int valor){
        if (esVacio() == true) {
            raiz = new nodoArbol(valor);
        }
        else{
            agregar(raiz, valor);
        }
    }
    
    private void agregar(nodoArbol raiz, int valor){
        
        if (valor == raiz.getValor()) {
            //inserta en el centro
            if (raiz.getHijoCen() == null) {
                raiz.setHijoCen(new nodoArbol(valor));
            }
            else{
                agregar(raiz.getHijoCen(), valor);
            }
        }else if(valor > raiz.getValor()){
            //inserta a la derecha
            if (raiz.getHijoDer() == null) {
                raiz.setHijoDer(new nodoArbol(valor));
            }
            else{
                agregar(raiz.getHijoDer(), valor);
            }
        }
        else if (valor < raiz.getValor()) {
            //inserta a la izquierda
            if (raiz.getHijoIzq() == null) {
                raiz.setHijoIzq(new nodoArbol(valor));
            }
            else{
                agregar(raiz.getHijoIzq(), valor);
            }
        }
    }
    
    private void preorden(nodoArbol raiz) {
        if (raiz != null) {
            System.out.println(raiz.getValor() + ", ");
            preorden(raiz.getHijoIzq());
            preorden(raiz.getHijoCen());
            preorden(raiz.getHijoDer());
        }
    }
    
    public void imprimir(){
        if (esVacio() == false) {
            preorden(raiz);
        }
        else{
            System.out.println("El arbol esta vacio");
        }
    }
}
