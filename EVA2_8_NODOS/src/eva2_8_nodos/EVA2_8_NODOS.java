
package eva2_8_nodos;

/**
 *
 * @author wilchis
 */
public class EVA2_8_NODOS { 

    
    public static void main(String[] args) {
        // TODO code application logic here
        Nodo nObj = new Nodo();
        nObj.iVal=1000;
        Nodo nObj2 = new Nodo();
        nObj2.iVal=2000;
        Nodo nObj3 = new Nodo();
        nObj3.iVal=3000;
        
        nObj.nSig=nObj2;
        nObj2.nSig=nObj3;
        
        //nObj.imprimir();
        Nodo nMover=nObj;
        while (nMover!=null){
            System.out.println(nMover.iVal);
            nMover=nMover.nSig;
        }
    }
    
}

class Nodo{
    public int iVal;
    public Nodo nSig;
    
    public Nodo(){
        nSig=null;
    }
    
    public void imprimir(){
        System.out.println(iVal);
        if(nSig!=null) nSig.imprimir();
    }
}
