
import java.util.ArrayList;
import java.util.Iterator;




public class Principal {

   
    public static void main(String[] args) {
        
        ArrayList <Integer> alMiArrayList = new ArrayList();
        alMiArrayList.add(100);
         alMiArrayList.add(200);
          alMiArrayList.add(300);
           alMiArrayList.add(400);
            alMiArrayList.add(500);
            for (Integer alMiArrayList1 : alMiArrayList) {
                System.out.print(alMiArrayList1 + " - ");
            
        }
            alMiArrayList.add(2,999);
            System.out.println("");
              for (Integer alMiArrayList1 : alMiArrayList) {
                System.out.print(alMiArrayList1 + " - ");
            
        }
              //RECORRER UN COLLECTION CON ITERADORES 
              System.out.println("\n ITERADOR");
              Iterator itRecorreArray = alMiArrayList.iterator();
              while(itRecorreArray.hasNext()){
                  System.out.print(itRecorreArray.next() + " - ");
              }
    }
            
    }
    

