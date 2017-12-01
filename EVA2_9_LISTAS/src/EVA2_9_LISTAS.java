/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * @author Code Slayer
 */
public class EVA2_9_LISTAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Lista lisNodo = new Lista();
        lisNodo.imprimir();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            lisNodo.agregarNodo2(new Nodo(1+ (int)(Math.random()*1000) ));
        }
        lisNodo.imprimir();
        System.out.println(lisNodo.contar());
        System.out.println(lisNodo.contar2());
        try {
            System.out.println(lisNodo.elentoPos(9).getiValor());
            lisNodo.insertarPos(2, new Nodo(123));
            lisNodo.imprimir();
            lisNodo.eliminarPos(2);
            lisNodo.imprimir();
            System.out.println("Ingrese el numero para buscar");
            int x=sc.nextInt();
            System.out.println(lisNodo.posElemento(x));
            System.out.println("La lista esta vacia? "+lisNodo.isEmpty());
            System.out.println("Tamaño: "+lisNodo.contar2());
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
    private int size;
    
    public Lista(){
        nodoIni=null;
        nodoFin=null;
        size=0;
    }
    
    public Lista(Nodo nodoIni){
        this.nodoIni=nodoIni;
        nodoFin=nodoIni;
        size=1;
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
        size++;
    }
    
    public void agregarNodo2(Nodo nNodo){
        if(nodoFin==null){
            nodoIni=nNodo;
            nodoFin=nodoIni;
        }else{
            nodoFin.setnSig(nNodo);
            nodoFin=nNodo;
        }
        size++;
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
        this.size=0;
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
        return this.size;
    }
    
    public Nodo elentoPos(int i) throws Exception{
        if (i<this.size && i>=0) {
            Nodo temp = nodoIni;
            for (int j = 0; j < i; j++) {
                temp = temp.getnSig();
            }
            return temp;
        } else{
            throw new Exception("La posicion no es valida");
        }
    }
    
    public void insertarPos(int pos,Nodo nNodo){
        if(pos==0){
            nNodo.setnSig(this.nodoIni);
            nodoIni=nNodo;
        } else{
            Nodo temp = this.nodoIni;
            for (int i = 0; i < pos-1; i++) {
                temp=temp.getnSig();
            }
            nNodo.setnSig(temp.getnSig());
            temp.setnSig(nNodo);
        }
        size++;
    }
    
    public void eliminarPos(int pos){
        if(pos==0){
            nodoIni=nodoIni.getnSig();
        } else{
            Nodo temp=this.nodoIni;
            for (int i = 0; i < pos-1; i++) {
                temp=temp.getnSig();
            }
            temp.setnSig(temp.getnSig().getnSig());
            if(pos == size-1){
                nodoFin = temp;
            }
        }
        size--;
    }
    
    /**
     * Si  no se encuentra, se regresa -1
     * @param x Es el elento a Buscar
     * 
     */
    public int posElemento(int x){
        int pos = -1;
        Nodo temp=this.nodoIni;
        int cont=0;
        while(temp!=null){
            if(x==temp.getiValor()){
                pos=cont;
                break;
            }
            temp=temp.getnSig();
            cont++;
        }
        return pos;
    }
    
    public boolean isEmpty(){
        return this.nodoIni==null;
    }
}