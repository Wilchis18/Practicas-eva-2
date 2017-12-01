
import java.util.LinkedList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author temporal2
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LinkedList <String> llMiLista = new LinkedList();
        llMiLista.add("HOLA");
        llMiLista.add(" ");
        llMiLista.add("MUNDO");
        llMiLista.add(" ");
        llMiLista.add("CRUEL!!!");
        llMiLista.add(" ");
        llMiLista.add("COLLECTIONS");
        for (String llMiLista1  : llMiLista) {
            System.out.println(llMiLista);
            
        }
        llMiLista.remove(4);
        System.out.println("");
        System.out.println(llMiLista);
        llMiLista.add(4,"BONDOSO");
        System.out.println(llMiLista);
    }
    
}
