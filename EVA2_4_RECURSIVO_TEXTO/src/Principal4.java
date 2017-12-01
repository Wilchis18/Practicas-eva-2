
/**
 *
 * @author wilchis
 */
public class Principal4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Metodo recursivo");
        imprimir(10, "*");
        
        System.out.println("Metodo Recurisivo 2 For");
        for (int i = 1; i <=10; i++) {
            System.out.println(imprimirPiramide(i));
        }
        for (int i = 9; i > 0; i--) {
            System.out.println(imprimirPiramide(i));
        }
        
        System.out.println("Metodo recursivo 1 for");
        
        
        /* while(cont<20){
        
        if(cont<=10) System.out.println(imprimirPiramide(cont));
        else System.out.println(imprimirPiramide(20-cont));
        cont++;
        }*/
        int n=10;
        for (int i = 1; i < n*2; i++) {
            if(i<=10) System.out.println(imprimirPiramide(i));
            else System.out.println(imprimirPiramide((2*n)-i));
        }
        
    }
    
    public static String imprimirPiramide(int n){
        if(n>1){
            return "*"+imprimirPiramide(n-1);
        } else{
            return "*";
        }
    }
    
    public static void imprimir(int n,String s){
        if(n>0){
            System.out.println(s);
            imprimir(n-1, s+s.charAt(0));
            if(n!=1) System.out.println(s);
            
        }
    }
    
}
