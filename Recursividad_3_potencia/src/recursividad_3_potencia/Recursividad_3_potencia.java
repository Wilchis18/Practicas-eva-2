
package recursividad_3_potencia;

/**
 *
 * @author wilchis
 */
public class Recursividad_3_potencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int base=3;
        int potencia=2;
        System.out.println(potenciaN(base, potencia));
    }
    
    public static long potenciaN(int base,int potencia){
        if(potencia==1) return base;
        return base*potenciaN(base, potencia-1);
    }
    
}

