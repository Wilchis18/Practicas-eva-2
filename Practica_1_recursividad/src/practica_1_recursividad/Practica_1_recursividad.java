/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package  practica_1_recursividad;

/**
 *
 * @author wilchis
 */
public class  Practica_1_recursividad {

    
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(sumaDigitos(10));
    }
    
    public static int sumaDigitos(int n){
        if(n==0) return 0;
        int ultDigit=n%10;
        int digitod=n/10;
        return ultDigit+sumaDigitos(digitod);
    }
    
}
