/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica_4_recursividad;

/**
 *
 * @author wilchis
 */
public class Practica_4_recursividad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String s="llops";
        System.out.println(limpiarCadena(s));
    }
    
    public static String limpiarCadena(String s){
        char first = s.charAt(0);
        int index=0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) != first){
                index=i;
                break;
            }
        }
        if(index==0) return ""+s.charAt(0);
        return first+limpiarCadena(s.substring(index));
    }
}
