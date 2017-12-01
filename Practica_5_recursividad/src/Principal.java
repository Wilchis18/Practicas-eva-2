


/**
 *
 * @author wilchis
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String s="(()))";
        System.out.println(paresAnidados(s));
    }
    
    public static boolean paresAnidados(String s){
        if(s.length()==0) return true;
        if(s.length()%2!=0) return false;
        if( s.charAt(0)!='(' || s.charAt(s.length()-1)!=')' ) return false;
        return paresAnidados(s.substring(1, s.length()-1));
    }
}
