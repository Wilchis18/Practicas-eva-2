
package eva2_7_inmutables;

/**
 *
 * @author wilchis
 */
public class EVA2_7_INMUTABLES {

    
    public static void main(String[] args) {
        // TODO code application logic here
        int [] arreglo = new int[3];
        int[] arregloCopia=new int[3];
        arreglo[0]=1;
        arreglo[1]=2;
        arreglo[2]=3;
        int cont=0;
        for (int i : arreglo) {
            System.out.print(i+" ");
            arregloCopia[cont]=i;
            cont++; 
        }
        System.out.println("");
        
        arreglo = new int[4];
        for (int i = 0; i < arregloCopia.length; i++) {
            arreglo[i]=arregloCopia[i];
        }
        arreglo[3]=4;
        for (int i : arreglo) {
            System.out.print(i+" ");
        }
    }
    
}
