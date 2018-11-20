package agendax;

/**
 *
 * @author alumno
 */
public class Persona {
    private String nombre;
    private int telefono;
    private int edad;

    public Persona() {
        nombre="";
        telefono=0;
        edad=0;
    }

    public Persona(String nombre, int telefono, int edad) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.edad = edad;
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
     * @return the telefono
     */
    public int getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    /**
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    
    public String toString() {
        return "\n Nombre: " +nombre+"\n Telefono: "+ telefono+ "\n Edad: "+edad; 
    }
    
  
    
    
    
}
