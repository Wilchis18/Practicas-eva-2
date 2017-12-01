

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
        String pal="axxxxxxxxxxxxrxbxxxoxxxxl";
        System.out.println(quitarX(pal));
    }
    
    public static String quitarX(String pal){
      if(pal.equals("")) return "";
      if(pal.charAt(0)=='x') return quitarX(pal.substring(1));
      return pal.charAt(0)+quitarX(pal.substring(1));
    }
    
}
