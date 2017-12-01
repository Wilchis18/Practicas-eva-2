
package eva2_9_listas;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author wilchis 
 */
public class EVA2_9_LISTAS {

    
    public static void main(String[] args) {
        // TODO code application logic here
        Lista lisNodo = new Lista();
        lisNodo.imprimir();
        for (int i = 0; i < 10; i++) {
            lisNodo.agregarNodo2(new Nodo(1+ (int)(Math.random()*1000) ));
        }
        lisNodo.imprimir();
        System.out.println(lisNodo.contar());
        System.out.println(lisNodo.contar2());
        try {
            System.out.println(lisNodo.elentoPos(9).getiValor());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
    
}

class Nodo{
    private int iValor;
    private Nodo nSig;

    public Nodo() {
        this.iValor=0;
        this.nSig=null;
    }

    public Nodo(int iValor) {
        this.iValor = iValor;
        this.nSig = null;
    }

    public Nodo(int iValor, Nodo nSig) {
        this.iValor = iValor;
        this.nSig = nSig;
    }

    public int getiValor() {
        return iValor;
    }

    public Nodo getnSig() {
        return nSig;
    }

    public void setiValor(int iValor) {
        this.iValor = iValor;
    }

    public void setnSig(Nodo nSig) {
        this.nSig = nSig;
    }
    
    
}

class Lista{
    private Nodo nodoIni;
    private Nodo nodoFin;
    private int cont;
    
    public Lista(){
        nodoIni=null;
        nodoFin=null;
        cont=0;
    }
    
    public Lista(Nodo nodoIni){
        this.nodoIni=nodoIni;
        nodoFin=nodoIni;
        cont=1;
    }
    
    //Los agrega al final
    public void agregarNodo(Nodo nNodo){ //No volver a usar jamas!!!
        Nodo temp=nodoIni;
        if(nodoIni==null){
            nodoIni=nNodo;
        }
        else{
            while(temp.getnSig() != null) {
                temp=temp.getnSig();
            }
            temp.setnSig(nNodo);
        }
        
    }
    
    public void agregarNodo2(Nodo nNodo){
        if(nodoFin==null){
            nodoIni=nNodo;
            nodoFin=nodoIni;
        }else{
            nodoFin.setnSig(nNodo);
            nodoFin=nNodo;
        }
        cont++;
    }
    
    public void imprimir(){
        Nodo temp=nodoIni;
        if(temp==null){
            System.out.println("La lista esta vacia");
        }
        else{
            while(temp != null){
                System.out.print(temp.getiValor()+"-");
                temp=temp.getnSig();
            }
            System.out.println("");
        }
    }
    
    public void vaciar(){
        nodoIni=null;
        nodoFin=null;
    }
    
    public int contar(){
        int  cont=0;
        Nodo temp=nodoIni;
        while(temp != null){
            cont++;
            temp=temp.getnSig();
        }
        return cont;
    }
    
    public int contar2(){
        return this.cont;
    }
    
    public Nodo elentoPos(int i) throws Exception{
        if (i<this.cont && i>=0) {
            Nodo temp = nodoIni;
            for (int j = 0; j < i; j++) {
                temp = temp.getnSig();
            }
            return temp;
        } else{
            throw new Exception("La posicion no es valida");
        }
    }
}