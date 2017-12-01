
package eva2_3_factorial;

/**
 *
 * @author wilchis
 */ 
public class EVA2_3_FACTORIAL {

    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(factorial(10));
    }
    public static int factorial(int n){
        if(n==0) return 1;
        else return n*factorial(n-1);
    }
}
