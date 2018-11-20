package agendax;

import java.util.Arrays;

/**
 *
 * @author alumno
 */
public class Agenda {
    private String nombre;
    private Persona[] vPersona;

    public Agenda() {
        nombre= "";
        vPersona =  new Persona[20];
    }

    public Agenda(String nombre, Persona[] vPersona) {
        this.nombre = "";
        this.vPersona = vPersona;
    }

    
    
    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the vPersona
     */
    public Persona[] getvPersona() {
        return vPersona;
    }

    /**
     * @param vPersona the vPersona to set
     */
    public void setvPersona(Persona[] vPersona) {
        this.vPersona = vPersona;
    }
    
    
    public void añadirPersona(Persona p){
        boolean colocado = false;
        for (int i = 0; i < vPersona.length; i++) {
            if (vPersona[i]==null) {
                vPersona[i]= p;
                System.out.println("Persona guardada");
                colocado = true;
                break;    
            }
        }
        if(!colocado){
            System.out.println("No hay hueco en la agenda");
        }
    }
    
    public void borrarPersona(String nombre){
        boolean encontrado = false;
        for (int i = 0; i < vPersona.length; i++) {
            if((vPersona[i]!=null)&& (vPersona[i].getNombre().equalsIgnoreCase(nombre))){
                vPersona[i]=null;
                System.out.println("Contacto borrado");
                encontrado=true;
                break;
            }
        }       
        if (!encontrado){
            System.out.println("No existe ese contacto");  
        }
    }
    
    public int contarMayoresDeEdad(int num){
        int cont=0;
        
        for (Persona vPersona1 : vPersona) {
            if (vPersona1.getEdad() > 18) {
                cont++;
            }
        }
        num=cont;
        return num;
    }
    
    public void buscarRangoEdad(int menor, int mayor){
        for (int i = 0; i < 10; i++) {
            if ((vPersona[i].getEdad() >= menor) && (mayor >= vPersona[i].getEdad())) {
                System.out.println(vPersona[i]);
            }
        }              
    }
    
    public void mostrarContactos(){
        for (int i = 0; i < vPersona.length; i++) {
            if(vPersona[i]!=null){
                System.out.println(vPersona[i].toString());
            }
        }
    }
}
