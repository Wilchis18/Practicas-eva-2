
package eva2_5_mcd;

/**
 *
 * @author wilchis
 */ 
public class EVA2_5_MCD {

    
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(mcd(180,48));
    }
    
    public static int mcd(int dividendo, int divisor){
        if(divisor==0) return dividendo;
        int residuo=dividendo%divisor;
        return mcd(divisor,residuo);
    }
    
}
