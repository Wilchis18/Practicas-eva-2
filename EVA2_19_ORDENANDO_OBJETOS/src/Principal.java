import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;


/**
 *
 * @author wilchis
 */
public class Principal {

    
    public static void main(String[] args) {
        // TODO code application logic here
        LinkedList <Persona> llPersonas = new LinkedList();
        
        llPersonas.add( new Persona("Daniel","Renteria",20,true,25) );
        llPersonas.add( new Persona("Daniel","Renteria",15,true,25) );
        llPersonas.add( new Persona("Paulina","Bolaños",19,false,45) );
        llPersonas.add( new Persona("Sully","Salgado",23,true,65) );
        llPersonas.add( new Persona("Daniel","Renterias",20,true,25) );
        llPersonas.add( new Persona("Sergio","Varela",18,true,85) );
        llPersonas.add( new Persona("Daniel","Renteri",20,true,25) );
        
        for (Persona llPersona : llPersonas) {
            llPersona.imprimir();
            System.out.println("");
        }
        
        Comparator OrdenAlfabetico = new Comparator(){
            @Override
            public int compare(Object o1, Object o2) {
                Persona p1 = (Persona)o1;
                Persona p2 = (Persona)o2;
                String ap1 = p1.getApellido();
                String ap2 = p2.getApellido();
                char c1=' ',c2=' ';
                int index=0;
                while(index<ap1.length() && index<ap2.length()){
                    if(ap1.charAt(index) != ap2.charAt(index) ){
                        c1=ap1.charAt(index);
                        c2=ap2.charAt(index);
                        break;
                    }
                    index++;
                }
                if(c1==c2){
                    return ap1.length()-ap2.length();
                }
                return c1-c2;
                //return c2-c1;
            }
            
            
        };
        
        Comparator Edad = new Comparator(){
            @Override
            public int compare(Object o1, Object o2) {
                Persona p1 = (Persona)o1;
                Persona p2 = (Persona)o2;
                int e1 = p1.getEdad();
                int e2 = p2.getEdad();
                return e1-e2;
            }
        };
        
        Comparator porSexo = new Comparator(){
            @Override
            public int compare(Object o1, Object o2) {
                Persona p1 = (Persona)o1;
                Persona p2 = (Persona)o2;
                boolean s1 = p1.isSexo();
                boolean s2 = p2.isSexo();
                if(s1 == s2) return 0;
                return (s1)? -1:1;
            }
        };
        
        Comparator Salario = new Comparator(){
            @Override
            public int compare(Object o1, Object o2) {
                Persona p1 = (Persona)o1;
                Persona p2 = (Persona)o2;
                double sal1 = p1.getSalario();
                double sal2 = p2.getSalario();
                return (int)(sal1-sal2);
            }
        };
        
        Comparator ApellidoEdad = new Comparator(){
            @Override
            public int compare(Object o1, Object o2) {
                Persona p1 = (Persona)o1;
                Persona p2 = (Persona)o2;
                String ap1 = p1.getApellido();
                String ap2 = p2.getApellido();
                char c1=' ',c2=' ';
                if(ap1.equals(ap2)){
                    int e1 = p1.getEdad();
                    int e2 = p2.getEdad();
                    return e1-e2;
                }
                int index=0;
                while(index<ap1.length() && index<ap2.length()){
                    if(ap1.charAt(index) != ap2.charAt(index) ){
                        c1=ap1.charAt(index);
                        c2=ap2.charAt(index);
                        break;
                    }
                    index++;
                }
                if(c1==c2){
                    return ap1.length()-ap2.length();
                }
                return c1-c2;
                //return c2-c1;
            }
            
            
        };
         
         
        
        Collections.sort(llPersonas,OrdenAlfabetico);
        System.out.println("Ordenar por apellido");
        for (Persona llPersona : llPersonas) {
            llPersona.imprimir();
        }
        System.out.println("");
        
        System.out.println("Odenar por edad");
        Collections.sort(llPersonas,Edad);
        for (Persona llPersona : llPersonas) {
            llPersona.imprimir();
        }
        System.out.println("");
        
        System.out.println("Odenar por sexo");
        Collections.sort(llPersonas,porSexo);
        for (Persona llPersona : llPersonas) {
            llPersona.imprimir();
        }
        System.out.println("");
        
        System.out.println("Odenar por Salario");
        Collections.sort(llPersonas,Salario);
        for (Persona llPersona : llPersonas) {
            llPersona.imprimir();
        }
        System.out.println("");
        
        System.out.println("*******************************");
        System.out.println("Odenar por apellido y edad");
        Collections.sort(llPersonas,ApellidoEdad);
        for (Persona llPersona : llPersonas) {
            llPersona.imprimir();
        }
        System.out.println("");
    }
    
}



class Persona{
    private String nombre;
    private String apellido;
    private int edad;
    private boolean sexo;
    private double salario;

    public Persona() {
    }
    
    public Persona(String nombre, String apellido, int edad, boolean sexo, double salario) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.sexo = sexo;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    public boolean isSexo() {
        return sexo;
    }

    public double getSalario() {
        return salario;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(boolean sexo) {
        this.sexo = sexo;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public void imprimir(){
        System.out.println("Nombre:"+nombre+" "+apellido+"\n"
                + "Edad: "+edad+"\nSexo: "+((sexo)? "M":"F")+"\n"
                + "Salario: "+salario  );
    }
}
