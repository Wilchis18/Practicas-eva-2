
package Principal;

/**
 *
 * @author wilchis
 */
public class Principal {

    
    public static void main(String[] args) {
        // TODO code application logic here
        try{
            ListaDE list = new ListaDE();
            list.imprimir();
            list.imprimirInverso();
            for (int i = 0; i < 10; i++) {
                list.agregarNodo(new Nodo( (int)(Math.random()*100)+1 ));
            }
            list.imprimir();
            list.imprimirInverso();
            list.insertarPos(2, new Nodo(123));
            list.imprimir();
            list.imprimirInverso();
            System.out.println("Tamaño: "+list.getSize());
            list.eliminarPos(2);
            list.imprimir();
            list.imprimirInverso();
            System.out.println("Tamaño: "+list.getSize());
            list.eliminarPos(0);
            list.imprimir();
            list.imprimirInverso();
            System.out.println("Tamaño: "+list.getSize());
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

class ListaDE{
    private Nodo nIni;
    private Nodo nFin;
    private int size;
    
    public ListaDE(){
        nIni = null;
        nFin= null;
        size=0;
    }
    
    public ListaDE(Nodo nNodo){
        nIni=nNodo;
        nFin = nNodo;
        size=1;
    }
    
    public void agregarNodo(Nodo nNodo){
        if(nIni==null){
            nIni=nNodo;
            nFin = nNodo;
        } else{
            nFin.setnSig(nNodo);
            nNodo.setnAnt(nFin);
            nFin=nNodo;
        }
        size++;
    }
    
    public void imprimir(){
        Nodo temp=nIni;
        if(temp == null){
            System.out.println("La lista esta vacia");
        } else{
            while(temp != null){
                System.out.print(temp.getiValor()+"-");
                temp=temp.getnSig();
            }
            System.out.println("");
        }
    }
    
    public void imprimirInverso(){
        Nodo temp=nFin;
        if(temp == null){
            System.out.println("La lista esta vacia");
        } else{
            while(temp != null){
                System.out.print(temp.getiValor()+"-");
                temp=temp.getnAnt();
            }
            System.out.println("");
        }
    }

    public int getSize() {
        return size;
    }
    
    public void insertarPos(int pos,Nodo nNodo) throws Exception {
        //Si la posocion que se quiere eliminar es mas grande que la lista
        //o es negativo, arroja un error
        if(pos>this.size || pos<0){
            throw new Exception("Posicion invalida");
        //Si la posicion es igual al tamaño de la lista, quiere decir que se
        //quiere insertar al final
        } else if(pos==this.size){
            this.agregarNodo(nNodo);
        //Se inserta en cualquer lugar
        } else {
            size++;
            Nodo temp = nIni;
            if(pos ==0){
                nIni.setnAnt(nNodo);
                nNodo.setnSig(nIni);
                nIni = nNodo;
            } else{
                for (int i = 0; i < pos-1; i++) {
                    temp=temp.getnSig();
                }
                temp.getnSig().setnAnt(nNodo);
                nNodo.setnSig(temp.getnSig());
                nNodo.setnAnt(temp);
                temp.setnSig(nNodo);
            }
        }
    }
    
    public void vaciar(){
        this.nIni=null;
    }
    
    public boolean estaVacia(){
        return this.nIni==null;
    }
    
    public void eliminarPos(int pos) throws Exception {
        if(pos>=this.size || pos<0){
            throw new Exception("Posiscion invalida");
        } else{
            Nodo temp = nIni;
            size--;
            if(pos == 0){
                nIni.getnSig().setnAnt(null);
                nIni = nIni.getnSig();

            } else{
                for (int i = 0; i < pos; i++) {
                    temp=temp.getnSig();
                }
                temp.getnSig().setnAnt(temp.getnAnt());
                temp.getnAnt().setnSig(temp.getnSig());
            }
        }
    }
    
     public Nodo elentoPos(int i) throws Exception{
        if (i<this.size && i>=0) {
            Nodo temp = nIni;
            for (int j = 0; j < i; j++) {
                temp = temp.getnSig();
            }
            return temp;
        } else{
            throw new Exception("La posicion no es valida");
        }
    }
    
    public int posElemento(int x){
        int pos = -1;
        Nodo temp=this.nIni;
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
    
}
