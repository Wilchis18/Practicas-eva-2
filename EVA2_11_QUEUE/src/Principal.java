

/**
 *
 * @author wilchis
 */
public class Principal {


    public static void main(String[] args) {
        // TODO code application logic here
        Queue q1 = new Queue();
        for (int i = 0; i < 10; i++) {
            q1.push(new Nodo((int)(Math.random()*20)));
            q1.print();
        }
        try{
            q1.pop();
            q1.print();
            for (int i = 0; i < 10; i++) {
                q1.pop();
            }
        } catch(Exception e){
            System.out.println(e.getMessage());
        }
        
    }
    
}

class Nodo{
    private int iValor;
    private Nodo nSig;
    private Nodo nAnt;

    public Nodo() {
        this.iValor=0;
        this.nSig=null;
        this.nAnt=null;
    }

    public void setnAnt(Nodo nAnt) {
        this.nAnt = nAnt;
    }

    public Nodo getnAnt() {
        return nAnt;
    }

    public Nodo(int iValor) {
        this.iValor = iValor;
        this.nSig = null;
        this.nAnt=null;
    }

    public Nodo(int iValor, Nodo nSig,Nodo nAnt) {
        this.iValor = iValor;
        this.nSig = nSig;
        this.nAnt=nAnt;
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

class Queue{
    private Nodo nIni;
    private Nodo nFin;
    private int size=0;

    public Queue() {
        nIni=null;
        nFin=null;
    }
    
    public Queue(Nodo nNodo){
        this.nIni=nNodo;
        this.nIni=nNodo;
        size =1;
    }
    
    //Agregar nodo
    public void push(Nodo nNodo){
        if(nIni == null){
            this.nIni=nNodo;
            this.nFin=nNodo;
        } else{
            nFin.setnSig(nNodo);
            nNodo.setnAnt(nFin);
            nFin = nNodo;
        }
        size++;
    }
    
    //Ver el priximo nodo
    public Nodo peek(){
        return nIni;
    }
    
    
    //Eliminar el proximo nodo
    public void pop() throws Exception{
        if(nIni == null){
            throw new Exception("La lista ya esta vacia");
        }
        if(nIni.getnSig() == null){
            nIni=null;
            nFin=null;
        } else{
            nIni = nIni.getnSig();
            nIni.setnAnt(null);
        }
        size--;
    }
    
    public void print(){
        Nodo temp = nIni;
        while(temp != null){
            System.out.print(temp.getiValor()+"-");
            temp = temp.getnSig();
        }
        System.out.println("");
    }
    
    public void empty(){
        this.nIni = null;
    }
    
    public boolean isEmpty(){
        return this.nIni == null;
    }
    
    public int size(){
        return size;
    }
    
}

