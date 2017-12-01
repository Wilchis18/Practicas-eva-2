
package eva2_2_for_falso;

/**
 *
 * @author wilchis
 */
public class EVA2_2_FOR_FALSO {

    
    public static void main(String[] args) {
        // TODO code application logic here
        for (int i = 5; i >0; i--) {
            System.out.println(i);
        }
        System.out.println("");
        imprimir(20);
        System.out.println("");
        imprimirUp(1,20);
    }
    
    public static void imprimir(int n){
        System.out.print(n+"-");
        if(n>1) imprimir(n-1);
    }
    
    public static void imprimirUp(int p,int n){
        System.out.print(p+"-");
        if(p<n) imprimirUp(++p, n);
    }
    
    
    
}
