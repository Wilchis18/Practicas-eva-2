
package eva2_20_arbol;

import java.util.Scanner;

/**
 *
 * @author wilchis
 */
public class EVA2_20_ARBOL {

    
    public static void main(String[] args) {
        // TODO code application logic here
        Arbol a1 = new Arbol();
        try{
            a1.agregar(new Nodo(100));
            a1.agregar(new Nodo(101));
            a1.agregar(new Nodo(102));
            a1.agregar(new Nodo(99));
            a1.agregar(new Nodo(101));
        } catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        a1.imprimirPreorder();
        System.out.println("");
        a1.imprimirInorder();
        System.out.println("");
        a1.imprimirPostorder();
        
        Scanner sc = new Scanner(System.in);
        System.out.print("\nValor para buscar: ");
        int n = sc.nextInt();
        System.out.println("\nEl numero existe? "+((a1.elementoExiste(n))? 
                "Si":"N0") );
    }
    
}

class Nodo{
    private int iValor;
    private Nodo nDer;
    private Nodo nIzq;

    public Nodo() {
        this.iValor=0;
        this.nDer=null;
        this.nIzq=null;
    }

    public void setnIzq(Nodo nAnt) {
        this.nIzq = nAnt;
    }

    public Nodo getnIzq() {
        return nIzq;
    }

    public Nodo(int iValor) {
        this.iValor = iValor;
        this.nDer = null;
        this.nIzq=null;
    }

    public Nodo(int iValor, Nodo nSig,Nodo nAnt) {
        this.iValor = iValor;
        this.nDer = nSig;
        this.nIzq=nAnt;
    }

    public int getiValor() {
        return iValor;
    }

    public Nodo getnDer() {
        return nDer;
    }

    public void setiValor(int iValor) {
        this.iValor = iValor;
    }

    public void setnDer(Nodo nSig) {
        this.nDer = nSig;
    }
    
//    public void agregar(Nodo nNodo)  throws Exception{
//        if(this.iValor == nNodo.iValor){
//            throw new Exception("Este valos ya existe");
//        }
//        if(this.iValor > nNodo.iValor){
//            if(this.nIzq == null){
//                this.nIzq=nNodo;
//            } else{
//                nIzq.agregar(nNodo);
//            }
//        } else if(this.iValor < nNodo.iValor){
//            if(this.nDer == null){
//                this.nDer=nNodo;
//            } else{
//                nDer.agregar(nNodo);
//            }
//        }
//    }
    
    
}

class Arbol{
    private Nodo nRoot;

    public Arbol() {
        nRoot=null;
    }

    public Arbol(Nodo nRoot) {
        this.nRoot = nRoot;
    }

    public Nodo getnRoot() {
        return nRoot;
    }
    
    public void agregar(Nodo nNodo) throws Exception{
        agregar(nRoot,nNodo);
    }
    
    private void agregar(Nodo nIni,Nodo nNodo) throws Exception{
        if(nRoot == null){
            nRoot = nNodo;
        } else{
            if(nIni.getiValor() == nNodo.getiValor()){
                throw new Exception("Este valor ya existe");
            }
            if(nIni.getiValor() > nNodo.getiValor()){
                if(nIni.getnIzq() == null){
                    nIni.setnIzq(nNodo);
                } else{
                    agregar(nIni.getnIzq(),nNodo);
                }
            } else {
                if(nIni.getnDer() == null){
                    nIni.setnDer(nNodo);
                } else{
                    agregar(nIni.getnDer(),nNodo);
                }
            }
        }
    }
    
    
    //Imprimir Preotder
    public void imprimirPreorder(){
        imprimirPreorder(nRoot);
    }
    
     private void imprimirPreorder(Nodo nIni){
         if(nIni != null){
            System.out.print(nIni.getiValor()+"-");
            imprimirPreorder(nIni.getnIzq());
            imprimirPreorder(nIni.getnDer());
         }
    }
    
     //Imprimir In Order
    public void imprimirInorder(){
        imprimirInorder(nRoot);
    }
    
    private void imprimirInorder(Nodo nIni){
        if(nIni != null){
            imprimirInorder(nIni.getnIzq());
            System.out.print(nIni.getiValor()+"-");
            imprimirInorder(nIni.getnDer());
        }
    }
    
    //Imprimir Post Order
    public void imprimirPostorder(){
        imprimirPostorder(nRoot);
    }
    
    private void imprimirPostorder(Nodo nIni){
        if(nIni != null){
            imprimirPostorder(nIni.getnIzq());
            imprimirPostorder(nIni.getnDer());
            System.out.print(nIni.getiValor()+"-");
        }
    }
    
    //Elemento existe
    public boolean elementoExiste(int n){
        return elementoExiste(n,nRoot);
    }
    
    private boolean elementoExiste(int n,Nodo nActual){
        if(nActual == null) return false;
        if(nActual.getiValor() == n) return true;
        if(n < nActual.getiValor()){
            return elementoExiste(n, nActual.getnIzq());
        } else{
            return elementoExiste(n, nActual.getnDer());
        }
    }

}
