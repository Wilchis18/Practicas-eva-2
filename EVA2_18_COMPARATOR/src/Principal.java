
import java.util.Collections;
import java.util.LinkedList;
/**
 *
 * @author wilchis
 */
public class Principal {

    
    public static void main(String[] args) {
        // TODO code application logic here
        LinkedList <String> llMiLista = new LinkedList();
        llMiLista.add("HOLA");
        llMiLista.add(" ");
        llMiLista.add("mundo");
        llMiLista.add(" ");
        llMiLista.add("cruel");
        llMiLista.add(" ");
        llMiLista.add("collections");
        for (String string : llMiLista) {
            System.out.println(string);
        }
        Collections.sort(llMiLista);
        for (String string : llMiLista) {
            System.out.println(string);
        }
    }
    
}